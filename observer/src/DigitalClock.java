import java.util.Observer;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        this.timer.addObserver(this); 
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == timer) {
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();

        System.out.println(String.format("%d:%d:%d", hour, minute, second));
    }
}
