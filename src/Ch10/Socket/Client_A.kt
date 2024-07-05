package Ch10.Socket

import java.io.*
import java.net.*

/*

fun ClientA_asServer()
{
    val cliA_server = ServerSocket(9998)
    println("Client_A's server (${cliA_server.inetAddress.hostAddress}, ${cliA_server.localPort}) just started...")

    while (true)
    {
        val peer = cliA_server.accept()
        println("peer(${peer.inetAddress}) connected to Client_A server.")

        Thread {
            val input = BufferedReader(InputStreamReader(peer.getInputStream()))
            val output = PrintWriter(peer.getOutputStream(), true)

            var message: String? = ""
            while (peer.isConnected && input.readLine().also { message = it } != null)
            {
                println("Client_A received from Client_B : $message")
                output.println("Echo from Client_A's server ; $message")
            }

            peer.close()
            println("peer is now disconnected from Client_A Server.")
        }.start()
    }
}

fun main()
{
    //val outputFile = "src/Ch10/Client_A_PrintOut.txt"
    //val fout = FileWriter(outputFile)

    Thread { ClientA_asServer() }.start()

    val serverClientA = Socket("localhost", 9999)
    println("Client_A connected to main server (${serverClientA.port})")
    //fout.write("Client_A connected to main server (${serverClientA.port})")

    val serverInput = BufferedReader(InputStreamReader(serverClientA.getInputStream()))
    val serverOutput = PrintWriter(serverClientA.getOutputStream(), true)

    for (count in 0..100) {
        var msgToServer = "Clinet_A:: %03d".format(count)
        serverOutput.println(msgToServer)

        println("Client_A sent to server: $msgToServer")
        //fout.write("Client_A sent to server: $msgToServer")

        println("Client_A:: response from main server: ${serverInput.readLine()}")
        //fout.write("Client_A:: response from main server: ${serverInput.readLine()}")

        Thread.sleep(1000)
    }

    serverClientA.close()

    println("ServerClient_A is closed now.")
    //fout.write("ServerClient_A is closed now.")

    //fout.close()
}

*/