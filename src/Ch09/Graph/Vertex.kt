package Ch09.Graph

class Vertex {
    var vName: String? = null
    var vid = 0
    var wedges: MutableList<WeightedEdge> = ArrayList<WeightedEdge>()
    var childred: List<Vertex> = ArrayList()
    var visited = false
    var prev: Vertex? = null
    var accDist = 0
    var level = 0

    constructor(nm: String)
    {
        this.vName = nm
        this.visited = false
        this.prev = null
        this.accDist = 0
    }

    fun getName(): String?
    {
        return this.vName
    }

    fun setVID(vId: Int)
    {
        this.vid = vId
    }

    fun getVID(): Int
    {
        return this.vid
    }

    fun addWeightedEdge(vrtx_dest: Vertex?, weight: Int)
    {
        val wedge = WeightedEdge(this, vrtx_dest, weight)
        wedges.add(wedge)
    }

    fun getWeightedEdges(): List<WeightedEdge>
    {
        return this.wedges
    }

    override fun toString(): String
    {
        return this.vName!!
    }
}