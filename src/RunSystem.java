import java.io.IOException;
import java.util.Arrays;

public class RunSystem {
    public static void main(String[] args) {
//        PrintScreen ps = new PrintScreen();
//        Controller controller = new Controller();
//        for(;;){
//            ps.printMenu();
//            int choice = ps.getChoice(3);
//            switch (choice){
//                //chairman menu
//                case 1:{
//                    //input controller in params
//                    if(ps.printLogInChairman("tajne")) ps.startChairmanMenu();
//                    break;
//                }
//                //coach menu
//                case 2:{
//                }
//                //treasurer menu
//                case 3:{
//                }
//            }
//        }
        try {
            File_S file_s = new File_S();
            File_R file_r = new File_R();
            file_s.loadData();
            file_r.loadData(file_s);
            System.out.println(file_s.getEliteSwimmerById(1).getTrainingResult()[0].convertMilliToString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
