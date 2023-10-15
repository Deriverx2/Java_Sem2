public class Synchronization{
    private static int counter = 0;

    public static void main(String[] args) {
        final int numThreads = 3;

        for (int i = 0; i < numThreads; i++) {
            Thread incrementThread = new Thread(new CounterIncrementer());
            Thread decrementThread = new Thread(new CounterDecrementer());
            incrementThread.start();
            decrementThread.start();
        }
    }

    static class CounterIncrementer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                incrementCounter();
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private synchronized void incrementCounter() {
            int temp = counter;
            temp++;
            counter = temp;
            System.out.println("Increment Thread " + Thread.currentThread().getId() + ": Counter = " + counter);
        }
    }

    static class CounterDecrementer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                decrementCounter();
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        private synchronized void decrementCounter() {
            int temp = counter;
            temp--;
            counter = temp;
            System.out.println("Decrement Thread " + Thread.currentThread().getId() + ": Counter = " + counter);
        }
    }
}
