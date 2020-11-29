import java.util.Scanner;

public class PrintScreen {
    public int getChoice(int maxValue){
        Scanner sc = new Scanner(System.in);
        int choise = -1;
        boolean isWrong = false;
        do {
            if (isWrong) System.out.println("PLEASE PICK A NUMBER FROM LISTED OPTIONS:");
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
    //MENU
    public void printMenu(){
        System.out.println("**************************************");
        System.out.println("*    >>WELCOME TO THE MAIN MENU<<    *");
        System.out.println("**************************************");
        System.out.println("PLEASE SELECT ONE OF THE OPTIONS: ");
        System.out.println("[1] Log in as a chairman");
        System.out.println("[2] Log in as a coach");
        System.out.println("[3] Log in as a treasurer");
    }
    //CHAIRMAN
    public boolean printLogInChairman(String password){
        System.out.println("WELCOME CHAIRMAN, TO CONTINUE TYPE YOUR PASSWORD OR TYPE 'Q' TO QUIT");
        Scanner sc = new Scanner(System.in);
        boolean inCorrectPass = false;
        String inputPassword;
        do {
            if(inCorrectPass) System.out.println("Your pass word is not correct, try it again");
            inputPassword = sc.next();
            inCorrectPass = true;
        }while (!(password.equals(inputPassword)) && !(inputPassword.equals("Q")) && !(inputPassword.equals("q")));
        return password.equals(inputPassword);
    }

    public void startChairmanMenu(){
        for(;;){
            System.out.println("PLEASE SELECT ONE OF THE OPTIONS: ");
            System.out.println("[1] Add a coach");
            System.out.println("[2] Add a swimmer");
            System.out.println("[3] Change the password");
            System.out.println("[4] Exit");
            int choice = getChoice(4);
            boolean exit = false;
            switch (choice){
                case 1:{
                    System.out.println("adding coach");
                    break;
                }
                case 2:{
                    System.out.println("adding swimmer");
                    break;
                }
                case 3:{
                    System.out.println("changing password");
                    break;
                }
                case 4:{exit = true;}
            }
            if(exit)break;
        }

    }
}
