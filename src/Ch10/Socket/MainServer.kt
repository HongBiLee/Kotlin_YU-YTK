package Ch10.Socket

import java.io.*
import java.net.*

/*
fun main()
{
    //val outputFile = "src/Ch10/MainServerPrintOut.txt"
    //val fout = FileWriter(outputFile)


    val server = ServerSocket(9999)
    println("Main Server (${server.inetAddress.hostAddress}) using port (${server.localPort}) just started, and waiting for clients' connection requests.")

    while (true)
    {
        val client = server.accept()
        println("Client (${client.inetAddress.hostAddress}) is just connected...")
        //fout.write("Client (${client.inetAddress.hostAddress}) is just connected...")

        Thread {
            val input = BufferedReader(InputStreamReader(client.getInputStream()))
            val output = PrintWriter(client.getOutputStream(), true)

            var message: String? = ""
            while (client.isConnected && input.readLine().also { message = it } != null)
            {
                println("Received: $message from ${client.inetAddress.hostAddress}")
                output.println("Echo: $message")

                //fout.write("Received: $message from ${client.inetAddress.hostAddress}")
                //fout.write("Echo: $message")
            }

            client.close()
            println("Client (${client.inetAddress.hostAddress}, ${client.port}) is disconnected now.")
            //fout.write("Client (${client.inetAddress.hostAddress}, ${client.port}) is disconnected now.")
        }.start()
    }

    //fout.close()
}

*/