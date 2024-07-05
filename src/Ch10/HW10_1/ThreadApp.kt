package Ch10.HW10_1

/*
fun main()
{
    val thrd_A_no_mutex = Thread(ThreadRunnableNoMutex('A'))
    val thrd_B_no_mutex = Thread(ThreadRunnableNoMutex('B'))
    val thrd_C_no_mutex = Thread(ThreadRunnableNoMutex('C'))
    val thrd_D_no_mutex = Thread(ThreadRunnableNoMutex('D'))

    thrd_A_no_mutex.start(); thrd_B_no_mutex.start(); thrd_C_no_mutex.start(); thrd_D_no_mutex.start();
    thrd_A_no_mutex.join(); thrd_B_no_mutex.join(); thrd_C_no_mutex.join(); thrd_D_no_mutex.join();

    val mutex = Any()
    val thrd_A = Thread(ThreadRunnable('A', mutex))
    val thrd_B = Thread(ThreadRunnable('B', mutex))
    val thrd_C = Thread(ThreadRunnable('C', mutex))
    val thrd_D = Thread(ThreadRunnable('D', mutex))

    thrd_A.start(); thrd_B.start(); thrd_C.start(); thrd_D.start();
    thrd_A.join(); thrd_B.join(); thrd_C.join(); thrd_D.join();

}
*/