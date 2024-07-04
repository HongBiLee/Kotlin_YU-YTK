package Ch07

import java.io.*
import java.nio.charset.Charset

/*
 * cin = InputStreamReader(fin, "MS949") ; 이렇게 작성하면 한글 깨져서 출력됨
 * 이거 해결하기
 */

/*
fun main() {
    var cin: InputStreamReader = InputStreamReader(System.`in`)

    var file_name = "src/Ch07/keyboard_input_text.txt"
    System.out.printf("Input text sentences (Ctrl-D to end) : \n")
    try {
        val fout = FileWriter(file_name)

        while (true) {
            val ch: Int = cin.read()
            if (ch == -1) {
                break
            }

            fout.write(ch)
        }

        cin.close()
        fout.close()
    } catch (e: IOException) {
        System.out.printf("Exception in input/out! \n")
    }

    System.out.printf("\nContents of textfile (%s) : \n".format(file_name))
    try {
        val fin = FileInputStream(file_name)
        cin = InputStreamReader(fin) // InputStreamReader(fin, "MS949") ; MS949 안 적고 default 로 하면 한글 안 깨짐
        System.out.printf("Encoding char set = %s\n".format(cin.getEncoding()))

        while (true) {
            val ch = cin.read()
            if (ch == -1)
                break

            System.out.printf("%c", ch)
        }

        cin.close()
        fin.close()
    } catch (e: IOException) {
        System.out.printf("IOException in text reading!\n")
    }
}
*/