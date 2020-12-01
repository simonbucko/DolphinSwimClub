import java.util.ArrayList;

public class Coach {
    private int id;
    private String swimmingStyle;
    public ArrayList<EliteSwimmer> students = new ArrayList<EliteSwimmer>();
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getSwimmingStyle() {
        return swimmingStyle;
    }

    public void setSwimmingStyle(String newSwimingStyle) {
        this.swimmingStyle = newSwimingStyle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
