import java.util.ArrayList;
public class Chairman extends Person {

    ArrayList<Coach> coachList = new ArrayList<>();

    private String password = "password";

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void addCoach(String name, String surname, int age, String swimmStyle, String password) {
        Coach coach = new Coach();
        coachList.add(coach);
    }

    public void addSwimmer(String name, String surname, int age, String swimmStyle) {
        ArrayList<String> swimmerList = new ArrayList<>(name, surname, age, swimmStyle, );
        swimmerList.add(swimmer);
    }
}