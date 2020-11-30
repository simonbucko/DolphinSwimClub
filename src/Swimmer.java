import java.util.*;
import java.time.*;
public abstract class Swimmer{

    private int id;
    private boolean wasNotified;
    private String swimStyle;
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
    public void setSwimStyle(String sStyle){
        this.swimStyle = sStyle;
    }
    public String getSwimStyle(){
        return swimStyle;
    }
    public void setMembershipStart(LocalDate sD){
        this.membershipStart = sD;
    }
    public LocalDate getMembershipStart(){
        return membershipStart;
    }
    public LocalDate getMembershipEnd(){
        return membershipEnd;
    }

}
