package Ch07

import java.io.File

/*
fun main() {
    val inputFile = "src/Ch07/fileInput.txt"
    val outputFile = "src/Ch07/fileOutput.txt"

    val inputLines = File(inputFile).readLines()
    println("inputLines = ")
    for (str_line in inputLines) {
        println("    %s".format(str_line))
    }

    val processedLines = processInput(inputLines)

    writeOutput(outputFile, processedLines)

    println("Data has been processed and written to $outputFile")
}

fun processInput(inputLines: List<String>): List<String> {
    return inputLines.map { it.toUpperCase() }
}

fun writeOutput(outputFile: String, lines: List<String>) {
    File(outputFile).bufferedWriter().use { out ->
        lines.forEach { line ->
            out.write(line)
            out.newLine()
        }
    }
}
*/