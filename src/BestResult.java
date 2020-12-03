import java.time.LocalDate;

public class BestResult implements Comparable {


    private String location;
    private int place;
    private long milliseconds = 99999999;
    private int swimmerId;
    private Discipline discipline;
    private LocalDate date;


    public BestResult(Discipline discipline, LocalDate date, int minutes, int seconds, int milliseconds, EliteSwimmer swimmer) {
        this.discipline = discipline;
        this.location = "PRACTICE";
        this.place = 0;
        this.milliseconds = convertTimeToMilli(minutes, seconds, milliseconds);
        this.swimmerId = swimmer.getId();
        this.date = date;
    }

    public BestResult(Discipline discipline, LocalDate date, String location, int place, int minutes, int seconds, int milliseconds, EliteSwimmer swimmer) {
        this(discipline, date, minutes, seconds, milliseconds, swimmer);
        this.location = location;
        this.place = place;
    }

    public BestResult(Discipline discipline,LocalDate date, String location, int place, long time, EliteSwimmer swimmer) {
        this.discipline = discipline;
        this.swimmerId = swimmer.getId();
        this.milliseconds = time;
        this.location = location;
        this.place = place;
        this.date = date;
    }

    public BestResult(Discipline discipline,LocalDate date, long time, EliteSwimmer swimmer) {
        this.discipline = discipline;
        this.swimmerId = swimmer.getId();
        this.milliseconds = time;
        this.location = "PRACTICE";
        this.place = 0;
        this.date = date;
    }

    public String convertMilliToString() {
        long minutes = milliseconds / 3600;
        long seconds = (milliseconds - (minutes * 3600)) / 60;
        long milliseconds = this.milliseconds - (minutes * 3600) - (seconds * 60);
        return (((minutes < 10) ? "0" : "") + minutes + ":" + ((seconds < 10) ? "0" : "") + seconds + "," + ((milliseconds < 10) ? "0" : "") + milliseconds);
    }

    private long convertTimeToMilli(int minutes, int seconds, int milliseconds) {
        return (long) minutes * 3600 + seconds * 60 + milliseconds;
    }

    public long getTime() {
        return milliseconds;
    }

    public String getLocation() {
        return location;
    }

    public int getPlace() {
        return place;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setTime(long time) {
        this.milliseconds = time;
    }

    public int getSwimmerId() {
        return swimmerId;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (this.milliseconds - ((BestResult) o).getTime());
    }
}
