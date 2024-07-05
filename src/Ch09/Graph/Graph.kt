package Ch09.Graph

import java.util.*

class Graph {
    var name: String? = null
    var num_vrtx = 0
    var vrtxArray = Vector<Vertex>()
    var wedges: MutableList<WeightedEdge> = ArrayList()
    lateinit var distTbl: Array<IntArray>
    var adjList = ArrayList<MutableList<Vertex>>()
    var dest_arrived = false

    constructor(nm: String?)
    {
        this.name = nm
    }

    fun addVertex(vrtxName: String): Vertex?
    {
        return if (findVertex(vrtxName) == null)
        {
            val newVrtx = Vertex(vrtxName)
            vrtxArray.add(newVrtx)
            newVrtx.setVID(num_vrtx)
            adjList.add(newVrtx.getVID(), ArrayList())
            this.num_vrtx++

            newVrtx
        }
        else
        {
            null
        }
    }

    fun findVertex(vrtxName: String): Vertex?
    {
        for (v in this.vrtxArray)
        {
            var vName = v.getName().toString()
            if (vName == vrtxName)
            {
                return v
            }
        }

        return null
    }

    fun addWeightedEdge(vrtx_src: Vertex, vrtx_dest: Vertex, weight: Int)
    {
        addDirectedWeightedEdge(vrtx_src, vrtx_dest, weight)
        addDirectedWeightedEdge(vrtx_dest, vrtx_src, weight)
    }

    fun addDirectedWeightedEdge(vrtx_src: Vertex, vrtx_dest: Vertex, weight: Int)
    {
        val wedge = WeightedEdge(vrtx_src, vrtx_dest, weight)
        wedges.add(wedge)
        vrtx_src.addWeightedEdge(vrtx_dest, weight)
        adjList[vrtx_src.getVID()].add(vrtx_dest)
    }

    fun initDistTable()
    {
        this.distTbl = Array(this.num_vrtx) { IntArray(this.num_vrtx) }
        for (i in 0..< this.num_vrtx)
        {
            for (j in 0..< this.num_vrtx)
            {
                if (i == j)
                {
                    this.distTbl[i][j] = 0
                }
                else
                {
                    this.distTbl[i][j] = Int.MAX_VALUE / 2
                }
            }
        }

        for (e in wedges)
        {
            this.distTbl[e.getSrcVID()][e.getDestVID()] = e.getWeight()
        }
    }


}