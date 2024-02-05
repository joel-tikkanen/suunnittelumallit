import java.util.Observable;

@SuppressWarnings("deprecation")
public class ClockTimer extends Observable {

    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    };

    void updateClock() {
        second++;
        if (second == 60) {
            minute++;
            second = 0;
        }
        if (minute == 60) {
            hour++;
            minute = 0;
        }

        if (hour == 24) {
            hour = 0;
        }
    }

    void tick() {
        updateClock();
        setChanged();
        notifyObservers();
    }
}
