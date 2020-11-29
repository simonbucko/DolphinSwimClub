import java.util.Scanner;

public class PrintScreen {
    //MENU
    public void printMenu(){
        System.out.println("**************************************");
        System.out.println("*    >>WELCOME TO THE MAIN MENU<<    *");
        System.out.println("**************************************");
        System.out.println("PLEASE SELECT ONE OF THE OPTIONS: ");
    }

    public int getChoice(int maxValue){
        Scanner sc = new Scanner(System.in);
        int choise = -1;
        boolean isWrong = false;
        do {
            if (isWrong) System.out.println("PLEASE PICK A NUMBER FROM LISTED OPTIONS:");
            if(!isWrong) System.out.println("WRITE A NUMBER OF YOUR CHOICE: ");
            if (sc.hasNextInt()) {
                choise = sc.nextInt();
            }
            else {
                sc.next();
            }
            isWrong = true;
        }while (choise < 1 || choise > maxValue);
        return choise;
    }
}
