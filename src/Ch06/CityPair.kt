package Ch06

import java.util.*

class CityPair(val city1: String, val city2: String) {

    override fun toString(): String {
        return String.format("(%s, %s)".format(city1, city2))
    }

    override fun equals(o: Any?): Boolean {
        if (this === o)
            return true

        if ((o == null) || (javaClass != o.javaClass))
            return false

        val other = o as CityPair

        return ((other.city1 == this.city1) && (other.city2 == this.city2))
    }

    override fun hashCode(): Int {
        return Objects.hash(city1, city2)
    }
}