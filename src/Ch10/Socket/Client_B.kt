package Ch10.Socket

import java.io.*
import java.net.*

/*
fun main()
{
    //val outputFile = "src/Ch10/Client_B_PrintOut.txt"
    //val fout = FileWriter(outputFile)


    val serverClientB = Socket("localhost", 9999)
    println("Client_A connected to main server (${serverClientB.port})")

    val serverInput = BufferedReader(InputStreamReader(serverClientB.getInputStream()))
    val serverOutput = PrintWriter(serverClientB.getOutputStream(), true)

    val peer = Socket("localhost", 9998)
    println("Client_B connected to peer (${peer.inetAddress.hostAddress}, ${peer.port})")
    //fout.write("Client_B connected to peer (${peer.inetAddress.hostAddress}, ${peer.port})")

    val peer_input = BufferedReader(InputStreamReader(peer.getInputStream()))
    val peer_output = PrintWriter(peer.getOutputStream(), true)


    for (count in 0..100)
    {
        var msgToServer = "Clinet_B:: %03d".format(count)
        serverOutput.println(msgToServer)
        println("Client_B sent to server: $msgToServer")
        println("Client_B:: response from main server: ${serverInput.readLine()}")

        //fout.write("Client_B sent to server: $msgToServer")
        //fout.write("Client_B:: response from main server: ${serverInput.readLine()}")

        var msgToPeer = "Cleint_B (to peer) :: %03d".format(count)
        peer_output.println(msgToPeer)
        println("Client_B sent to peer: $msgToPeer")
        println("Client_B:: received from peer: ${peer_input.readLine()}")

        //fout.write("Client_B sent to peer: $msgToPeer")
        //fout.write("Client_B:: received from peer: ${peer_input.readLine()}")

        Thread.sleep(1000)
    }

    serverClientB.close()
    println("Client_B disconnected from main server.")
    //fout.write("Client_B disconnected from main server.")

    peer.close()
    println("Client_B disconnected from peer.")
    //fout.write("Client_B disconnected from peer.")

    //fout.close()
}

*/