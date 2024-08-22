package ThreadDay7;


    class threadRunnable1 implements Runnable {

        @Override
        public void run() {
            int i= 0;
            while (i<5){
            System.out.println("this is thread 1");
            i++;
        }
    }

    static class threadRunnable2 implements Runnable {

        @Override
        public void run() {


        }

        }
    }

public class RunnableIntro{
    public static void main(String[] args) {
        threadRunnable1 bullet1 = new threadRunnable1();
        Thread gun1 = new Thread(bullet1);
        threadRunnable1.threadRunnable2 bullet2 = new threadRunnable1.threadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();


    }
}





