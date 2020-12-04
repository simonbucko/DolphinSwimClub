import java.io.IOException;

public class Controller {
    File_C file_c;
    File_R file_r;
    File_S file_s;
    Chairman chairman;
    Treasurer treasurer;
    int lastSwimmerId;
    int lastCoachId;
    Coach currentLoggedCoach;

    public Controller(){
        try {
            file_c = new File_C();
            file_s = new File_S();
            file_r = new File_R();
            file_c.loadData();
            file_s.loadData(file_c);
            file_r.loadData(file_s);
        }catch (IOException e){
            System.out.println("Problem with loading data from files");
        }
        chairman = new Chairman("Samuel","Bartek","09876543","bartek@gmail.com",28,"password");
        treasurer = new Treasurer("Lubomir","Bucko","76876546","lubomir@gmail.com",19,"lubomir123");
        lastCoachId = file_c.getCoaches().get(file_c.getCoaches().size() - 1).getId();
        lastSwimmerId = file_s.getSwimmers().get(file_s.getSwimmers().size() - 1).getId();
    }


}
