package Ch10.HW10_1

class ThreadRunnable(var mark: Char, var mutex: Any): Runnable {
    override fun run()
    {
        //println("\nMutex %c-Thread\n".format(this.mark))
        synchronized(this.mutex)
        {
            for (i in 1..10)
            {
                for (k in 0..10)
                {
                    print("%c".format(this.mark))
                    Thread.sleep(10)
                }
                println()
                Thread.sleep(100)
            }

            println()
        }
    }
}