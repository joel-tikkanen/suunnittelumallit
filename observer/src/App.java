public class App {
    public static void main(String[] args) {
        ClockTimer clockTimer = new ClockTimer();
        new DigitalClock(clockTimer);
        EventSource eventSource = new EventSource(clockTimer);
        new Thread(eventSource).start(); 
    }
}
