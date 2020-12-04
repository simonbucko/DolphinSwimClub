import java.io.IOException;
import java.util.Arrays;

public class RunSystem {
    public static void main(String[] args) {
        PrintScreen ps = new PrintScreen();
        Controller controller = new Controller();
        for(;;){
            ps.printMenu();
            int choice = ps.getChoice(3);
            switch (choice){
                //chairman menu
                case 1:{
                    //input controller in params
                    if(ps.printLogInChairman(controller.chairman.getPassword())) ps.startChairmanMenu(controller);
                    break;
                }
                //coach menu
                case 2:{
                    if(ps.printLogInCoach(controller)) ps.startCoachMenu(controller);
                    break;
                }
                //treasurer menu
                case 3:{
                    if(ps.printLogInTreasurer(controller.treasurer.getPassword())) ps.startTreasurerMenu(controller);
                    break;
                }
            }
        }


    }
}
