import java.util.Date;
public class ActiveSW {

    private long id;
    private boolean wasNotified;
    private String swimStyle;
    private Date memebershipStart;
    private Date membershipEnd;

    public Date getMembershipEnd() {
        return membershipEnd;
    }

    public void setMembershipEnd(Date membershipEnd) {
        this.membershipEnd = membershipEnd;
    }

    public Date getMemebershipStart() {
        return memebershipStart;
    }

    public void setMemebershipStart(Date memebershipStart) {
        this.memebershipStart = memebershipStart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getWasNotified(){
        return wasNotified;
    }

    public void setWasNotified(boolean wasNotified){
        this.wasNotified = wasNotified;
    }

    public String getSwimStyle(){
        return swimStyle;
    }

    public void setSwimStyle(String swimStyle){
        this.swimStyle = swimStyle;
    }

}
