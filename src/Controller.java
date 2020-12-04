import java.io.IOException;

public class Controller {
    File_C file_c;
    File_R file_r;
    File_S file_s;
    Chairman chairman;
    Treasurer treasurer;

    public Controller(){
        try {
            File_C file_c = new File_C();
            File_S file_s = new File_S();
            File_R file_r = new File_R();
            file_c.loadData();
            file_s.loadData(file_c);
            file_r.loadData(file_s);
        }catch (IOException e){
            System.out.println("Problem with loading data from files");
        }
        chairman = new Chairman("Samuel","Bartek","09876543","bartek@gmail.com",28,"password");
        treasurer = new Treasurer("Lubomir","Bucko","76876546","lubomir@gmail.com",19,"lubomir123");
    }
}
