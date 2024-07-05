package Ch09

import Ch09.HashMap

fun main()
{
    val hmap = HashMap<String, Int>()
    val oneToTenLetter = arrayOf("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten")
    for (i in 0..< oneToTenLetter.size)
    {
        hmap.put(oneToTenLetter[i], i)
    }
    hmap.print()

    var hmap_keys = hmap.keys()
    println("hmap keys = " + hmap_keys)

    var hmap_values = hmap.values()
    println("hmap_values = " + hmap_values)
}