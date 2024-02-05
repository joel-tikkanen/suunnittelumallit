public class EventSource implements Runnable {
    private ClockTimer timer;

    public EventSource(ClockTimer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(1000);
                timer.tick();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
