package Ch07

import java.io.FileWriter
import java.io.IOException
import java.util.*

class Mtrx {
    var mtrx_name: String? = null
    lateinit var mtrx_data: Array<DoubleArray>
    var n_row = 0
    var n_col = 0

    constructor(nm:String) {
        this.mtrx_name = nm
        this.n_row = 0
        this.n_col = 0
    }

    constructor(nm: String?, n_row: Int, n_col: Int) { // 생성자
        this.mtrx_name = nm
        this.mtrx_data = Array(n_row) { DoubleArray(n_col)}
        this.n_row = n_row
        this.n_col = n_col
    }

    constructor(nm: String?, n_row: Int, n_col: Int, dm_data: DoubleArray) {
        this.mtrx_name = nm
        this.mtrx_data = Array(n_row) { DoubleArray(n_col)}
        this.n_row = n_row
        this.n_col = n_col

        var count = 0
        for (r in 0..< n_row) {
            for (c in 0..< n_col) {
                this.mtrx_data[r][c] = dm_data[count++]
            }
        }
    }

    override fun toString(): String {
        var str: String = "%s = \n".format(this.mtrx_name)
        for (r in 0..< this.n_row) {
            for (c in 0..< this.n_col) {
                str += "%7.2f".format(this.mtrx_data[r][c])
            }
            str += "\n"
        }

        return str
    }

    fun setName(nm: String?) {
        this.mtrx_name = nm
    }

    fun fget_Mtrx(fin: Scanner): Mtrx {
        this.mtrx_name = fin.next()
        this.n_row = fin.nextInt()
        this.n_col = fin.nextInt()
        this.mtrx_data = Array(n_row) { DoubleArray(n_col)}

        for (r in 0..< n_row) {
            for (c in 0..< n_col) {
                this.mtrx_data[r][c] = fin.nextDouble()
            }
        }

        return this
    }

    fun printMtrx() {
        println("%s (%d x %d) = ".format(mtrx_name, n_row, n_col))
        for (r in 0 ..< this.n_row) {
            for (c in 0..< this.n_col) {
                print("%7.2f".format(this.mtrx_data[r][c]))
            }
            println()
        }
        println()
    }

    @Throws(IOException::class)
    fun fprintMtrx(fout: FileWriter) {
        fout.write(this.mtrx_name)
        fout.write(" ")
        fout.write(String.format("(%3d x %3d) \n", this.n_row, this.n_col))
        for (r in 0..< this.n_row) {
            for (c in 0..< this.n_col) {
                val str_data = java.lang.String.format("%7.2f", this.mtrx_data[r][c])
                fout.write(str_data)
            }
            fout.write("\n")
        }
        fout.write("\n")

        fout.flush()
    }

    operator fun plus(other:Mtrx): Mtrx { // 덧셈 (+)
        val mR = Mtrx("mR", this.n_row, this.n_col)
        for (r in 0..< this.n_row) {
            for (c in 0..< this.n_col) {
                mR.mtrx_data[r][c] = this.mtrx_data[r][c] + other.mtrx_data[r][c]
            }
        }

        return mR
    }

    operator fun minus(other:Mtrx): Mtrx { // 뺄셈 (-)
        val mR = Mtrx("mR", this.n_row, this.n_col)
        for (r in 0..< this.n_row) {
            for (c in 0..< this.n_col) {
                mR.mtrx_data[r][c] = this.mtrx_data[r][c] - other.mtrx_data[r][c]
            }
        }

        return mR
    }

    operator fun times(other: Mtrx): Mtrx { // 곱셈 (*)
        val mR = Mtrx("mR", this.n_row, other.n_col)
        for (r in 0..< this.n_row) {
            for (c in 0..< other.n_col) {
                var sum = 0.0
                for (k in 0..< this.n_col) {
                    sum += this.mtrx_data[r][k] * other.mtrx_data[k][c]
                }
                mR.mtrx_data[r][c] = sum
            }
        }

        return mR
    }
}