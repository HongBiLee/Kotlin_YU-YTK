package Ch09

class HashMap<K, V> {
    private data class Entry<K, V> (val key: K, var value: V, var next: Entry<K, V>?)
    //private var buckets = arrayOfNulls<Entry<K, V>?>(17)
    private var buckets = arrayOfNulls<Entry<K, V>?>(7) // Entry 가 한 테이블 안에 여러 개 있는 걸 볼 수 있음
    private var size = 0
    private val loadFactor = 0.75

    fun put(key: K, value: V)
    {
        val bucketIndex = key.hashCode() % this.buckets.size
        var current = this.buckets[bucketIndex]

        if (current == null)
        {
            this.buckets[bucketIndex] = Entry(key, value, null)

            this.size++
        }
        else
        {
            while (true)
            {
                if (current!!.key == key)
                {
                    current.value = value

                    return
                }

                if (current.next == null)
                {
                    break
                }

                current = current.next
            }

            if (current != null)
            {
                current.next = Entry(key, value, null)
            }

            this.size++
        }

        if (this.size > this.buckets.size * this.loadFactor)
        {
            resize()
        }
    }

    fun get(key: K): V?
    {
        val bucketIndex = key.hashCode() % this.buckets.size
        var current = this.buckets[bucketIndex]

        while (current != null)
        {
            if (current.key == key)
            {
                return current.value
            }

            current = current.next
        }

        return null
    }

    private fun resize()
    {
        val newBuckets = arrayOfNulls<Entry<K, V>?>(this.buckets.size * 2)
        for (entry in this.buckets)
        {
            var current = entry
            while (current != null)
            {
                val newIndex = current.key.hashCode() % newBuckets.size
                val next = current.next
                current.next = newBuckets[newIndex]
                newBuckets[newIndex] = current
                current = next
            }
        }

        this.buckets = newBuckets
    }

    fun keys(): List<K>
    {
        val keyList = mutableListOf<K>()
        for (bucket in this.buckets)
        {
            var current = bucket

            while (current != null)
            {
                keyList.add(current.key)

                current = current.next
            }
        }

        return keyList
    }

    fun values(): List<V>
    {
        val valueList = mutableListOf<V>()
        for (bucket in this.buckets)
        {
            var current = bucket

            while (current != null)
            {
                valueList.add(current.value)

                current = current.next
            }
        }

        return valueList
    }

    fun print()
    {
        for ((index, bucket) in this.buckets.withIndex())
        {
            var current = bucket
            if (bucket == null)
            {
                println("Bucket %2d : Empty".format(index))
            }
            else
            {
                while (current != null)
                {
                    println("Bucket %2d : Key = %s, Value = %d".format(index, current.key, current.value))

                    current = current.next
                }
            }
        }
    }
}