package Ch05

import Ch05.Person

class Student: Person {
    var st_id: Int = 0
    var dmmy3 = println("(7) Declaration of Student.st_id")
    var st_major: String = ""
    var dmmy4 = println("(8) Declaration of Student.st_major")

    init {
        println("(9) Student.init")
    }

    constructor(nm: String, rgID: Int, stId: Int, mjr: String, arg: Unit = println("(1) Student secondary constructor default argument")): super(nm, rgID) {
        println("(10) Initialization of st_id and major in Student secondary constructor")

        this.st_id = stId
        this.st_major = mjr
    }

    override fun print() {
        println("Student(name = %s, reg_id = %d, st_id = %d, major = %s)".format(this.name, this.reg_id, this.st_id, this.st_major))
    }

    override fun toString(): String {
        var str = "Student(name = %s, reg_id = %d, st_id = %d, major = %s)".format(this.name, this.reg_id, this.st_id, this.st_major)

        return str
    }
}