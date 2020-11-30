import java.util.ArrayList;
public class Chairman {

//    private String password = "password";
//
//    public String getPassword(){
//        return name;
//    }
//    public void setPassword(String newPassword){
//        this.name = newPassword;
//    }

    public void addCoach(String name, String surname, int age, String swimmStyle, String password){
        ArrayList<String> coachList = new ArrayList<>(name, surname, age, swimmStyle, password);
        coachList.add(coach);
    }
    public void addSwimmer(String name, String surname, int age, String swimmStyle){
        ArrayList<String> swimmerList = new ArrayList<>(name, surname, age, swimmStyle,);
        swimmerList.add(swimmer);

}
