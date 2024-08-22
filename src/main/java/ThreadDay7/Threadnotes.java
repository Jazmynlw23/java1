package ThreadDay7;

public class Threadnotes {
    // THREAD:
    // java supports multithreading: meaning aprogram an performm mutlple tasts simutaneously

    // KEY CONCEPTS:
    // concurrency: multiple thread can run in parallel, sharing the CPU time.
    // multithreading: multiple threads can be executed within a single program.
    // synchronization: mechanism is control the access of multiple threads to be shared

    // WAYS TO ACHIEVE:
    // -By extending thread class.
    // -By implementing runnable interface

    // SYNCHRONIZATION:
    // When multiple threads access shared resources, there can be conflicts,
    // synchronization is used o control this access and prevent issues like race condition/conflicts.

    // DEAD:OCK:
    // a lockup applied when you have a synchronizing process.
    // A thread is waiting outside and a lock is applied then once a thread has finished its work
    // the lock will be removed and other thread can enter.

    // String Builder:
    // -> its not thread safe
    // -> it means its not suitable for multithreading environment
    // -> however it is more efficient than string buffer the reason
    //  is of the thread safety  condition.

    // String Buffer:
    // it


    // String bulder: and string buffer: mutable
    // this classes will allow you to modify without creating new object ea time
    // both classes will provide similar functionality but they differ in their thread safety.

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        String b ="hellotob";
        a.append("b");
        a.append("world");
        a.replace( 0,  8,  "hey");

        System.out.println(a);

        StringBuffer d = new StringBuffer();
        String c = "hellotoc";
        d.append(c);
        d.append("world");
        d.replace(0,8, "hey");

        System.out.println(d);

    }

}
