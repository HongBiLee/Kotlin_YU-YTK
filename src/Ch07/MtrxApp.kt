package Ch07

import java.util.*
import java.io.*
import Ch07.Mtrx
import kotlin.jvm.Throws

/*
@Throws(IOException::class)
fun main() {
    val fin_name = "src/Ch07/mtrx_data.txt"
    val fin = Scanner(File(fin_name))

    val fout_name = "src/Ch07/mtrx_operation_result.txt"
    val fout = FileWriter(File(fout_name))

    var mtrxs = Array<Mtrx>(6) {Mtrx("")}

    // 파일로부터 행렬 정보 받아서 기록하고 출력
    mtrxs[0].fget_Mtrx(fin)
    mtrxs[0].printMtrx()
    mtrxs[0].fprintMtrx(fout)

    mtrxs[1].fget_Mtrx(fin)
    mtrxs[1].printMtrx()
    mtrxs[1].fprintMtrx(fout)

    mtrxs[2].fget_Mtrx(fin)
    mtrxs[2].printMtrx()
    mtrxs[2].fprintMtrx(fout)

    // 덧셈
    mtrxs[3] = mtrxs[0].plus(mtrxs[1])
    mtrxs[3].setName("mAdd_AB")
    mtrxs[3].printMtrx()
    mtrxs[3].fprintMtrx(fout)

    // 뺄셈
    mtrxs[4] = mtrxs[0].minus(mtrxs[1])
    mtrxs[4].setName("mSub_AB")
    mtrxs[4].printMtrx()
    mtrxs[4].fprintMtrx(fout)

    // 곱셈
    mtrxs[5] = mtrxs[0].times(mtrxs[2])
    mtrxs[5].setName("mMul_AC")
    mtrxs[5].printMtrx()
    mtrxs[5].fprintMtrx(fout)

    fin.close()
    fout.close()
}

*/