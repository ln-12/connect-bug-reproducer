To run the project:

#### Server
1. `cd node`
2. `npm install fastify @connectrpc/connect-node @connectrpc/connect-fastify`
3. `npx tsx server.ts` (keep it running)

#### App
1. `cd app/src/main`
2. `buf generate`
3. Open Android Studio, build the project and run it from the emulator. If you want to use a real device, change the IP `https://10.0.2.2:3000` to the one of your workstation (where the node server is running).

[Flipper](https://fbflipper.com/)