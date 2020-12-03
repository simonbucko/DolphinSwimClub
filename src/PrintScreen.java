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

    public int getAge(int maxValue){
        Scanner sc = new Scanner(System.in);
        int choise = -1;
        boolean isWrong = false;
        do {
            if (isWrong) System.out.println("THE INPUTTED VALUE IS NOT A NUMBER OR IT IS NOT IN RANGE BETWEEN 0-100:");
            if (sc.hasNextInt()) {
                choise = sc.nextInt();
            }
            else {
                sc.next();
            }
            isWrong = true;
        }while (choise < 5 || choise > maxValue);
        return choise;
    }

    public String getNewPassword(){
        Scanner sc = new Scanner(System.in);
        String password;
        boolean notMatch = true;
        do{
            System.out.println("PLEASE INPUT YOUR NEW PASSWORD: ");
            password = sc.next();
            System.out.println("PLEASE INPUT YOUR NEW PASSWORD AGAIN: ");
            String retypedPassword = sc.next();
            if(password.equals(retypedPassword)) notMatch=false;
            else System.out.println("YOUR PASSWORDS ARE NOT MATCHING, PLEASE TRY AGAIN: ");
        }while (notMatch);
        return password;
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
            Scanner sc = new Scanner(System.in);
            switch (choice){
                case 1:{
                    System.out.println("PLEASE INPUT THE NAME: ");
                    String name = sc.next();
                    System.out.println("PLEASE INPUT THE SURNAME: ");
                    String surname = sc.next();
                    System.out.println("PLEASE INPUT THE PHONE NUMBER: ");
                    String phone = sc.next();
                    System.out.println("PLEASE INPUT THE EMAIL: ");
                    String email = sc.next();
                    System.out.println("PLEASE INPUT THE AGE: ");
                    int age = getAge(100);
                    System.out.println("PLEASE INPUT PREFERRED SWIMMING STYLE: ");
                    String style = sc.next();
                    System.out.println("PLEASE INPUT PASSWORD: ");
                    String password = sc.next();
                    //create coach from params
                    break;
                }
                case 2:{
                    System.out.println("adding swimmer");
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{exit = true;}
            }
            if(exit)break;
        }

    }
}
