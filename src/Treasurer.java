import java.util.ArrayList;

public class Treasurer extends Person{
    private String password = "password";
    public Treasurer(String name, String surname, String phone, String email, int age,String password){
        super(name, surname, phone, email, age);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Swimmer> searchMemberByName(File_S file_s, String name, String surname){
        ArrayList<Swimmer> foundSwimmers = new ArrayList<Swimmer>();
        for(Swimmer swimmer:file_s.getSwimmers()){
            if(swimmer.getName().equals(name) && swimmer.getSurname().equals(surname)){
                foundSwimmers.add(swimmer);
            }
        }
        return foundSwimmers;
    }

    public void renewMemberShip(int swimmerId){
        //update times with local time
    }
}
