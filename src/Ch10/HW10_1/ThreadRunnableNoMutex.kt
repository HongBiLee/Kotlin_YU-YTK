package Ch10.HW10_1

class ThreadRunnableNoMutex(var mark: Char): Runnable {
    override fun run()
    {
        println("\nNo Mutex %c-Thread".format(this.mark))
        for (i in 1..5)
        {
            for (k in 0..5)
            {
                print("%c".format(this.mark))
                Thread.sleep(10)
            }
            println()
            Thread.sleep(100)
        }
    }
}