// Copyright 2021-2023 The Connect Authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import { ConnectRouter } from '@connectrpc/connect'
import { ElizaService } from './gen/connectrpc/eliza/v1/eliza_connect.js'
import type {
  SayRequest,
  IntroduceRequest,
  ConverseRequest,
} from './gen/connectrpc/eliza/v1/eliza_pb.js'

export default (router: ConnectRouter) =>
  router.service(ElizaService, {
    say(req: SayRequest) {
      return {
        sentence: `You said ${req.sentence}`,
      }
    },
    async *introduce(req: IntroduceRequest) {
      yield { sentence: `Hi ${req.name}, I'm Eliza` }
      for (let i = 0; i < 100; i += 1) {
        yield {
          sentence: `${i} Before we begin, ${req.name}, let me tell you something about myself. ${Math.random()}`,
        }
        await delay(15)
      }
    },
    async *converse(reqs: AsyncIterable<ConverseRequest>) {
      for await (const req of reqs) {
        yield {
          sentence: `You said ${req.sentence}`,
        }
      }
    },
  })

function delay(ms: number) {
  return new Promise((resolve) => setTimeout(resolve, ms))
}