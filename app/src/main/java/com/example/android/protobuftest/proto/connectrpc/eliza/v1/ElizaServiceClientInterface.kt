// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: proto/eliza.proto
//
package com.example.android.protobuftest.proto.connectrpc.eliza.v1

import com.connectrpc.BidirectionalStreamInterface
import com.connectrpc.Headers
import com.connectrpc.ResponseMessage
import com.connectrpc.ServerOnlyStreamInterface

/**
 *  ElizaService provides a way to talk to Eliza, a port of the DOCTOR script
 *  for Joseph Weizenbaum's original ELIZA program. Created in the mid-1960s at
 *  the MIT Artificial Intelligence Laboratory, ELIZA demonstrates the
 *  superficiality of human-computer communication. DOCTOR simulates a
 *  psychotherapist, and is commonly found as an Easter egg in emacs
 *  distributions.
 */
public interface ElizaServiceClientInterface {
  /**
   *  Say is a unary RPC. Eliza responds to the prompt with a single sentence.
   */
  public suspend fun say(request: SayRequest, headers: Headers = emptyMap()):
      ResponseMessage<SayResponse>

  /**
   *  Converse is a bidirectional RPC. The caller may exchange multiple
   *  back-and-forth messages with Eliza over a long-lived connection. Eliza
   *  responds to each ConverseRequest with a ConverseResponse.
   */
  public suspend fun converse(headers: Headers = emptyMap()):
      BidirectionalStreamInterface<ConverseRequest, ConverseResponse>

  /**
   *  Introduce is a server streaming RPC. Given the caller's name, Eliza
   *  returns a stream of sentences to introduce itself.
   */
  public suspend fun introduce(headers: Headers = emptyMap()):
      ServerOnlyStreamInterface<IntroduceRequest, IntroduceResponse>
}
