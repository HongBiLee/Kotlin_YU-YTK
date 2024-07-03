package Ch05

import Ch05.Person

class Employee: Person {
    private var emp_id: Int = 0
    private var company: String? = null
    private var department: String? = null
    val dmmy3 = println("(7-8) Declaration of Employee.emp_id, company, department")

    init {
        println("(9) Employee.init{}")
    }

    constructor(nm: String, rgID: Int, empID: Int, company:String, department: String, arg: Unit = println("(1) Employee secondary constructor default argument")): super(nm, rgID) {
        println("(10) Initialization of _id and major in Employee secondary constructor")

        this.emp_id = empID
        this.company = company
        this.department = department
    }

    override fun toString(): String {
        var str = String.format("Employee(")
        str += super.toString()
        str += String.format("), company = %s, dept = %s, emp_ID = %d)\n".format(this.company, this.department, this.emp_id))

        return str
    }
}

