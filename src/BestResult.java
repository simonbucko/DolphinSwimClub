public class BestResult implements Comparable {
    private String location;
    private String place;
    private long milliseconds = 99999999;
    public Swimmer swimmer;

    public BestResult(int minutes, int seconds, int milliseconds, Swimmer swimmer) {
        this.location = null;
        this.place = null;
        this.milliseconds = convertTimeToMilli(minutes, seconds, milliseconds);
        this.swimmer = swimmer;
    }

    public BestResult(String location, String place, int minutes, int seconds, int milliseconds, Swimmer swimmer) {
        this(minutes, seconds, milliseconds, swimmer);
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

    public String getPlace() {
        return place;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(long time) {
        this.milliseconds = time;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (this.milliseconds - ((BestResult) o).getTime());
    }
}
