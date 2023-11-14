package com.example.android.protobuftest

import com.connectrpc.ProtocolClientConfig
import com.connectrpc.extensions.GoogleJavaJSONStrategy
import com.connectrpc.impl.ProtocolClient
import com.connectrpc.okhttp.ConnectOkHttpClient
import com.connectrpc.protocols.NetworkProtocol
import com.example.android.protobuftest.proto.connectrpc.eliza.v1.ElizaServiceClient
import com.example.android.protobuftest.proto.connectrpc.eliza.v1.introduceRequest
import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import java.security.SecureRandom
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.SSLContext
import javax.net.ssl.X509TrustManager

var trustAllCerts = arrayOf<X509TrustManager>(
    object : X509TrustManager {
        override fun checkClientTrusted(chain: Array<X509Certificate>, authType: String) {}
        override fun checkServerTrusted(chain: Array<X509Certificate>, authType: String) {}
        override fun getAcceptedIssuers(): Array<X509Certificate> {
            return arrayOf()
        }
    }
)

val sslContext = SSLContext.getInstance("SSL").apply {
    init(null, trustAllCerts, SecureRandom())
}

val okHttpClient = OkHttpClient
    .Builder()
    .addNetworkInterceptor(FlipperOkhttpInterceptor(MyApplication.networkPlugin))
    .sslSocketFactory(sslContext.socketFactory, trustAllCerts[0])
    .hostnameVerifier { _, _ -> true }
    .readTimeout(10, TimeUnit.MINUTES)
    .writeTimeout(10, TimeUnit.MINUTES)
    .callTimeout(10, TimeUnit.MINUTES)
    .build()

val client = ProtocolClient(
    httpClient = ConnectOkHttpClient(okHttpClient),
    ProtocolClientConfig(
        host = "https://10.0.2.2:3000",
        serializationStrategy = GoogleJavaJSONStrategy(),
        networkProtocol = NetworkProtocol.CONNECT,
    ),
)

val elizaServiceClient = ElizaServiceClient(client = client)

fun getSettings() {
    CoroutineScope(Dispatchers.IO).launch {
        try {
            val stream = elizaServiceClient.introduce()

            stream.sendAndClose(introduceRequest { name = "Hello" })

            var i = 0

            for (message in stream.responseChannel()) {
                i++
            }

            println("Number of messages: $i")
        } catch (e: Exception) {
            println("ERROR: $e")
        } finally {
            println("FINISH")
        }
    }
}
