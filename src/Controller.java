import java.io.IOException;

public class Controller {
    File_C file_c;
    File_R file_r;
    File_S file_s;
    Chairman chairman;
    //finish treasurer, finish writing into file, finish sorting with vlad into treeset


    public Controller(){
        try {
            file_c = new File_C();
            file_s = new File_S();
            file_r = new File_R();
        }catch (IOException e){
            System.out.println("Problem with loading data from files");
        }
        chairman = new Chairman("Samuel","Bartek","09876543","bartek@gmail.com",28,"password");
    }
}
