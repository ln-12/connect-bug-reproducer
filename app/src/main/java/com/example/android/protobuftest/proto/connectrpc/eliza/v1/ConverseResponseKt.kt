// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/eliza.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.example.android.protobuftest.proto.connectrpc.eliza.v1;

@kotlin.jvm.JvmName("-initializeconverseResponse")
public inline fun converseResponse(block: com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponseKt.Dsl.() -> kotlin.Unit): com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponse =
  com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponseKt.Dsl._create(com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponse.newBuilder()).apply { block() }._build()
/**
 * ```
 * ConverseResponse is a single sentence response sent in answer to a
 * ConverseRequest.
 * ```
 *
 * Protobuf type `connectrpc.eliza.v1.ConverseResponse`
 */
public object ConverseResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponse = _builder.build()

    /**
     * `string sentence = 1 [json_name = "sentence"];`
     */
    public var sentence: kotlin.String
      @JvmName("getSentence")
      get() = _builder.getSentence()
      @JvmName("setSentence")
      set(value) {
        _builder.setSentence(value)
      }
    /**
     * `string sentence = 1 [json_name = "sentence"];`
     */
    public fun clearSentence() {
      _builder.clearSentence()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponse.copy(block: com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponseKt.Dsl.() -> kotlin.Unit): com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponse =
  com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
