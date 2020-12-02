public class BestResult implements Comparable {

    enum Discipline {
        FREESTYLE,
        CRAWL,
        BREASTSTROKE,
        BACKSTROKE,
        BUTTERFLY
    }

    private String location;
    private int place;
    private long milliseconds = 99999999;
    private int swimmerId;
    private Discipline discipline;


    public BestResult(Discipline discipline, int minutes, int seconds, int milliseconds, EliteSwimmer swimmer) {
        this.discipline = discipline;
        this.location = null;
        this.place = 0;
        this.milliseconds = convertTimeToMilli(minutes, seconds, milliseconds);
        this.swimmerId = swimmer.getId();
    }

    public BestResult(Discipline discipline, String location, int place, int minutes, int seconds, int milliseconds, EliteSwimmer swimmer) {
        this(discipline, minutes, seconds, milliseconds, swimmer);
        this.location = location;
        this.place = place;
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

    @Override
    public int compareTo(Object o) {
        return (int) (this.milliseconds - ((BestResult) o).getTime());
    }
}
