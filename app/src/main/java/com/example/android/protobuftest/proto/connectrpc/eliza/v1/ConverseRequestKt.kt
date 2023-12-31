// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto/eliza.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.example.android.protobuftest.proto.connectrpc.eliza.v1;

@kotlin.jvm.JvmName("-initializeconverseRequest")
public inline fun converseRequest(block: com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequestKt.Dsl.() -> kotlin.Unit): com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequest =
  com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequestKt.Dsl._create(com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequest.newBuilder()).apply { block() }._build()
/**
 * ```
 * ConverseRequest is a single sentence request sent as part of a
 * back-and-forth conversation.
 * ```
 *
 * Protobuf type `connectrpc.eliza.v1.ConverseRequest`
 */
public object ConverseRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequest = _builder.build()

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
public inline fun com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequest.copy(block: com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequestKt.Dsl.() -> kotlin.Unit): com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequest =
  com.example.android.protobuftest.proto.connectrpc.eliza.v1.ConverseRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

