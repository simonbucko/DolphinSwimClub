import java.util.*;
import java.time.*;
public abstract class Swimmer{

    private int id;
    private boolean wasNotified;
    private String swimstyle;
    private LocalDate membershipStart = LocalDate.now();
    private LocalDate membershipEnd = membershipStart.plusMonths(12);

    public void setId(int id) {
      this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setWasNotified(boolean wNotified){
        this.wasNotified = wNotified;
    }
    public boolean getWasNotified(){
        return wasNotified;
    }
    public void setSwimstyle(String sStyle){
        this.swimstyle = sStyle;
    }
    public String getSwimstyle(){
        return swimstyle;
    }
    public void setMembershipStart(LocalDate sD){
        this.membershipStart = sD;
    }
    public LocalDate getMembershipStart(){
        return membershipStart;
    }
    public void setMembershipEnd(LocalDate lD){
        this.membershipEnd = lD;
    }

}
