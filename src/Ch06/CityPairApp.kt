package Ch06

import java.io.File
import java.util.*

/*
fun main() {
    val fname_ICD = "src/Ch06/InterCityDist.txt" // /src/~ 가 아니라 src/~ 로 해야 함

    var hmap_ICD = fget_interCityDistMap(fname_ICD)
    print("hmap_ICD (size = %d) = %s\n".format(hmap_ICD.size, hmap_ICD))

    var hmap_ICD_keys: Set<CityPair> = hmap_ICD.keys
    println("hmap_ICD_keys = %s".format(hmap_ICD_keys))
}

fun fget_interCityDistMap(fname: String): HashMap<CityPair, Int> {
    var hmap_ICD = HashMap<CityPair, Int>()
    val fin = Scanner(File(fname))
    while (fin.hasNext()) {
        val city1 = fin.next()
        val city2 = fin.next()
        val dist = fin.nextInt()

        hmap_ICD.put(CityPair(city1, city2), dist)
        hmap_ICD.put(CityPair(city2, city1), dist)
    }

    return hmap_ICD
}
 */