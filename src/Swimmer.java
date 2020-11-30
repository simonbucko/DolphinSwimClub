import java.util.*;
public abstract class Swimmer {

    int id;
    boolean wasNotified;
    String swimstyle;
    Date membershipStart = new Date();
    Date membershipEnd = new Date();

    public void setId(int id) {
      this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setWasNotified(){
        this.wasNotified = wasNotified;
    }
    public boolean getWasNotified(){
        return wasNotified;
    }
    public void setSwimstyle(){
        this.swimstyle = swimstyle;
    }
    public String getSwimstyle(){
        return swimstyle;
    }
    public void setMembershipStart(){
        this.membershipStart = membershipStart;
    }
    public Date getMembershipStart(){
        return membershipStart;
    }
    public void setMembershipEnd(){
        this.membershipEnd = membershipStart(+1);
    }

    protected abstract Date membershipStart(int i);

    public static void main(String [] args){


    }
}
