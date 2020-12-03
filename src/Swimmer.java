import java.time.*;
public abstract class Swimmer extends Person {

    private int id;
    private boolean wasNotified;
    private Discipline swimStyle;
    private LocalDate membershipStart = LocalDate.now();
    private LocalDate membershipEnd = membershipStart.plusMonths(12);

    public Swimmer(int id, String swimStyle, String name, String surname, String phone, String email, int age, boolean wasNotified) {
        super(name, surname, phone, email, age);
        this.id = id;
        switch (swimStyle){
            case "FREESTYLE": {
                this.swimStyle = Discipline.FREESTYLE;
                break;
            }
            case "CRAWL": {
                this.swimStyle = Discipline.CRAWL;
                break;
            }
            case "BREASTSTROKE": {
                this.swimStyle = Discipline.BREASTSTROKE;
                break;
            }
            case "BACKSTROKE": {
                this.swimStyle = Discipline.BACKSTROKE;
                break;
            }
            case "BUTTERFLY": {
                this.swimStyle = Discipline.BUTTERFLY;
                break;
            }
        }
        this.wasNotified = wasNotified;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setWasNotified(boolean wNotified) {
        this.wasNotified = wNotified;
    }
    public boolean getWasNotified(){
        return wasNotified;
    }
    public void setSwimStyle(Discipline sStyle){
        this.swimStyle = sStyle;
    }
    public Discipline getSwimStyle(){
        return swimStyle;
    }
    public void setMembershipStart(LocalDate sD) {
        this.membershipStart = sD;
    }
    public LocalDate getMembershipStart() {
        return membershipStart;
    }
    public LocalDate getMembershipEnd() {
        return membershipEnd;
    }
    public void printData() {
        System.out.println(this.id + " " + getName() + " " + getSurname() + " " + getAge() + " " + swimStyle + " " + getEmail() + " " + getPhone());
    }
}
