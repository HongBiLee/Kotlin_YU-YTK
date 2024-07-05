package Ch09.Graph

class WeightedEdge {
    private var src: Vertex? = null
    private var dest: Vertex? = null
    private var weight = 0

    constructor(src: Vertex?, dest: Vertex?, weight: Int)
    {
        this.src = src
        this.dest = dest
        this.weight = weight
    }

    override fun toString(): String
    {
        return this.src.toString() + " -> " + this.dest
    }

    fun getSrcVID(): Int
    {
        return this.src!!.getVID()
    }

    fun getDestVID(): Int
    {
        return this.dest!!.getVID()
    }

    fun getWeight(): Int
    {
        return this.weight
    }
}