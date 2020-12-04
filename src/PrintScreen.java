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
            if (isWrong) System.out.println("THE INPUTTED VALUE IS NOT A NUMBER OR IT IS NOT PLAUSIBLE:");
            if (sc.hasNextInt()) {
                choise = sc.nextInt();
            }
            else {
                sc.next();
            }
            isWrong = true;
        }while (choise < 0 || choise > maxValue);
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

    public String getStyle(){
        Scanner sc = new Scanner(System.in);
        String style;
        boolean notMatch = false;
        do{
            if(notMatch) System.out.println("ONLY FREESTYLE/CRAWL/BREASTSTROKE/BACKSTROKE/BUTTERFLY OPTIONS ARE AVAILABLE HERE, PLEASE TRY AGAIN: ");
            style = sc.next();
            if(style.equals("FREESTYLE") || style.equals("CRAWL") || style.equals("BREASTSTROKE") || style.equals("BACKSTROKE") || style.equals("BUTTERFLY")) notMatch = false;
            else notMatch = true;
        }while (notMatch);
        return style;
    }

    public String getType(){
        Scanner sc = new Scanner(System.in);
        String type;
        boolean notMatch = false;
        do{
            if(notMatch) System.out.println("ONLY PASSIVE/ACTIVE/ELITE OPTIONS ARE AVAILABLE HERE, PLEASE TRY AGAIN: ");
            type = sc.next();
            if(type.equals("PASSIVE") || type.equals("ACTIVE") || type.equals("ELITE")) notMatch = false;
            else notMatch = true;
        }while (notMatch);
        return type;
    }

    public String getResultType(){
        Scanner sc = new Scanner(System.in);
        String type;
        boolean notMatch = false;
        do{
            if(notMatch) System.out.println("ONLY PRACTICE/COMPETITION OPTIONS ARE AVAILABLE HERE, PLEASE TRY AGAIN: ");
            type = sc.next();
            if(type.equals("PRACTICE") || type.equals("COMPETITION") ) notMatch = false;
            else notMatch = true;
        }while (notMatch);
        return type;
    }

    public String getPhoneNumber(){
        Scanner sc = new Scanner(System.in);
        String phone;
        boolean notMatch = false;
        do{
            if(notMatch) System.out.println("PHONE NUMBER IS INVALID! IT HAS TO HAVE AT LEAST 8 DIGITS, PLEASE TRY AGAIN: ");
            phone = sc.next();
            if(phone.length() >= 8) notMatch = false;
            else notMatch = true;
        }while (notMatch);
        return phone;
    }

    public int getSwimmerId(File_S file_s){
        Scanner sc = new Scanner(System.in);
        int id = -1;
        boolean inCorrectId = false;
        boolean quit = false;
        String input;
        do {
            if(inCorrectId)System.out.println("ID IS INVALID OR DOES NOT EXIST IN DATABASE, PLEASE TRY AGAIN OR TYPE 'Q' TO EXIT:");
            if(sc.hasNextInt()) {
                id = sc.nextInt();
                if(file_s.getSwimmerById(id) == null) inCorrectId = true;
            }
            else {
                input = sc.next();
                if(input.equals("Q") || input.equals("q")) quit = true;
                inCorrectId = true;
            }
        }while(inCorrectId && !quit);
        if (quit) return -1;
        else return id;
    }

    public int getEliteSwimmerId(File_S file_s){
        Scanner sc = new Scanner(System.in);
        int id = -1;
        boolean inCorrectId = false;
        boolean quit = false;
        String input;
        do {
            if(inCorrectId)System.out.println("ID IS INVALID OR DOES NOT EXIST IN DATABASE, PLEASE TRY AGAIN OR TYPE 'Q' TO EXIT:");
            if(sc.hasNextInt()) {
                id = sc.nextInt();
                inCorrectId = false;
                if(file_s.getEliteSwimmerById(id) == null) inCorrectId = true;
            }
            else {
                input = sc.next();
                if(input.equals("Q") || input.equals("q")) quit = true;
                inCorrectId = true;
            }
        }while(inCorrectId && !quit);
        if (quit) return -1;
        else return id;
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
            if(inCorrectPass) System.out.println("Your password is not correct, try it again");
            inputPassword = sc.next();
            inCorrectPass = true;
        }while (!(password.equals(inputPassword)) && !(inputPassword.equals("Q")) && !(inputPassword.equals("q")));
        return password.equals(inputPassword);
    }

    public void startChairmanMenu(Controller controller){
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
                //adding coach
                case 1:{
                    System.out.println("PLEASE INPUT THE NAME: ");
                    String name = sc.next();
                    System.out.println("PLEASE INPUT THE SURNAME: ");
                    String surname = sc.next();
                    System.out.println("PLEASE INPUT THE PHONE NUMBER: ");
                    String phone = getPhoneNumber();
                    System.out.println("PLEASE INPUT THE EMAIL: ");
                    String email = sc.next();
                    System.out.println("PLEASE INPUT THE AGE: ");
                    int age = getAge(100);
                    System.out.println("PLEASE INPUT PREFERRED SWIMMING STYLE: ");
                    String style = getStyle();
                    System.out.println("PLEASE INPUT PASSWORD: ");
                    String password = sc.next();
                    controller.file_c.getCoaches().add(new Coach(++controller.lastCoachId,style,name,surname,phone,email,age,password));
                    controller.file_c.saveToFile();
                    System.out.println("COACH WAS SUCCESSFULLY ADDED!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                //adding swimmer
                case 2:{
                    System.out.println("PLEASE INPUT THE NAME: ");
                    String name = sc.next();
                    System.out.println("PLEASE INPUT THE SURNAME: ");
                    String surname = sc.next();
                    System.out.println("PLEASE INPUT THE PHONE NUMBER: ");
                    String phone = getPhoneNumber();
                    System.out.println("PLEASE INPUT THE EMAIL: ");
                    String email = sc.next();
                    System.out.println("PLEASE INPUT THE AGE: ");
                    int age = getAge(100);
                    System.out.println("PLEASE INPUT PREFERRED SWIMMING STYLE: ");
                    String style = getStyle();
                    System.out.println("PLEASE INPUT MEMBERSHIP TYPE: ");
                    String type = getType();
                    switch(type){
                        case "ACTIVE":{
                            ActiveSwimmer aS = new ActiveSwimmer(++controller.lastSwimmerId, style, name, surname, phone, email, age,false);
                            controller.file_s.getSwimmers().add(aS);
                            controller.file_s.saveToFile();
                            break;
                        }
                        case "PASSIVE":{
                            PassiveSwimmer aS = new PassiveSwimmer(++controller.lastSwimmerId, style, name, surname, phone, email, age,false);
                            controller.file_s.getSwimmers().add(aS);
                            controller.file_s.saveToFile();
                            break;
                        }
                        case "ELITE":{
                            EliteSwimmer eS = new EliteSwimmer(++controller.lastSwimmerId, style, name, surname, phone, email, age,false);
                            controller.file_s.getSwimmers().add(eS);
                            controller.file_s.saveToFile();
                            if(age<18) controller.file_c.getCoaches().get(0).getStudents().add(eS);
                            else controller.file_c.getCoaches().get(1).getStudents().add(eS);
                            break;
                        }
                    }
                    System.out.println("SWIMMER WAS SUCCESSFULLY ADDED!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 3:{
                    controller.chairman.setPassword(getNewPassword());
                    System.out.println("PASSWORD CHANGED SUCCESSFULLY!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 4:{exit = true;}
            }
            if(exit)break;
        }
    }

    //COACH
    public boolean printLogInCoach(Controller controller){
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME COACH, TO CONTINUE TYPE YOUR ID OR TYPE 'Q' TO EXIT:");
        int id = -1;
        boolean inCorrectId = false;
        boolean quit = false;
        String input;
        do {
            if(inCorrectId)System.out.println("YOUR ID IS INVALID OR DOES NOT EXIST IN DATABASE, PLEASE TRY AGAIN OR TYPE 'Q' TO EXIT:");
            if(sc.hasNextInt()) {
                id = sc.nextInt();
                if(controller.file_c.getCoachById(id) == null) inCorrectId = true;
            }
            else {
                input = sc.next();
                if(input.equals("Q") || input.equals("q")) quit = true;
                inCorrectId = true;
            }
        }while(inCorrectId && !quit);
        if (quit) return false;
        controller.currentLoggedCoach = controller.file_c.getCoachById(id);
        String password = controller.currentLoggedCoach.getPassword();
        System.out.println("WELCOME "+ controller.currentLoggedCoach.getName() +" "+controller.currentLoggedCoach.getSurname()+", TO CONTINUE TYPE YOUR PASSWORD OR TYPE 'Q' TO QUIT");
        boolean inCorrectPass = false;
        String inputPassword;
        do {
            if(inCorrectPass) System.out.println("YOUR PASSWORD IS NOT CORRECT, PLEASE TRY AGAIN OR TYPE 'Q' TO EXIT");
            inputPassword = sc.next();
            if(inputPassword.equals("Q") || inputPassword.equals("q")) quit = true;
            else if(password.equals(inputPassword)) inCorrectPass = false;
            else inCorrectPass = true;
        }while (inCorrectPass);
        if(quit){
            controller.currentLoggedCoach = null;
            return false;
        }
        return true;
    }

    public void startCoachMenu(Controller controller){
        for(;;){
            System.out.println("You are now logged as " + controller.currentLoggedCoach.getName()+ " "+ controller.currentLoggedCoach.getSurname() +", PLEASE SELECT ONE OF THE OPTIONS: ");
            System.out.println("[1] Display all students");
            System.out.println("[2] Register best result");
            System.out.println("[3] View top swimmers");
            System.out.println("[4] Change password");
            System.out.println("[5] Exit");
            int choice = getChoice(5);
            boolean exit = false;
            Scanner sc = new Scanner(System.in);
            switch (choice){
                //display all students
                case 1:{
                    controller.currentLoggedCoach.displayStudents();
                    System.out.println("TO CONTINUE, TYPE ANYTHING AND PRESS ENTER: ");
                    sc.next();
                    break;
                }
                //register best result
                case 2:{
                    System.out.println("DO YOU WANT TO REGISTER PRACTICE/COMPETITION RESULT: ");
                    String resultType = getResultType();
                    boolean quitSwitch=false;
                    switch (resultType){
                        case "PRACTICE": {
                            System.out.println("PLEASE INPUT SWIMMERS ID OR 'Q' TO EXIT: ");
                            int id = getEliteSwimmerId(controller.file_s);
                            if(id == -1) {
                                quitSwitch = true;
                                break;
                            }
                            System.out.println("PLEASE INPUT DISCIPLINE FREESTYLE/CRAWL/BREASTSTROKE/BACKSTROKE/BUTTERFLY: ");
                            String discipline = getStyle();
                            System.out.println("PLEASE INPUT MINUTES: ");
                            int minutes = getAge(60);
                            System.out.println("PLEASE INPUT SECONDS: ");
                            int seconds = getAge(60);
                            System.out.println("PLEASE INPUT MILLISECONDS: ");
                            int milliseconds = getAge(9999);
                            switch (discipline){
                                case "FREESTYLE":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.TRAINING,Discipline.FREESTYLE,minutes,seconds,milliseconds,"PRACTICE",0);
                                    break;
                                }
                                case "CRAWL":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.TRAINING,Discipline.CRAWL,minutes,seconds,milliseconds,"PRACTICE",0);
                                    break;
                                }
                                case "BREASTSTROKE":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.TRAINING,Discipline.BREASTSTROKE,minutes,seconds,milliseconds,"PRACTICE",0);
                                    break;
                                }
                                case "BACKSTROKE":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.TRAINING,Discipline.BACKSTROKE,minutes,seconds,milliseconds,"PRACTICE",0);
                                    break;
                                }
                                case "BUTTERFLY":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.TRAINING,Discipline.BUTTERFLY,minutes,seconds,milliseconds,"PRACTICE",0);
                                    break;
                                }
                            }
                            break;
                        }
                        case "COMPETITION": {
                            System.out.println("PLEASE INPUT SWIMMERS ID: ");
                            int id = getEliteSwimmerId(controller.file_s);
                            if(id == -1) break;
                            System.out.println("PLEASE INPUT DISCIPLINE FREESTYLE/CRAWL/BREASTSTROKE/BACKSTROKE/BUTTERFLY: ");
                            String discipline = getStyle();
                            System.out.println("PLEASE INPUT MINUTES: ");
                            int minutes = getAge(60);
                            System.out.println("PLEASE INPUT SECONDS: ");
                            int seconds = getAge(60);
                            System.out.println("PLEASE INPUT MILLISECONDS: ");
                            int milliseconds = getAge(9999);
                            System.out.println("PLEASE INPUT LOCATION OF COMPETITION: ");
                            String location = sc.next();
                            System.out.println("PLEASE INPUT ACHIEVED PLACE OF SWIMMER: ");
                            int place = getAge(100);
                            switch (discipline){
                                case "FREESTYLE":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.COMPETITION,Discipline.FREESTYLE,minutes,seconds,milliseconds,location,place);
                                    break;
                                }
                                case "CRAWL":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.COMPETITION,Discipline.CRAWL,minutes,seconds,milliseconds,location,place);
                                    break;
                                }
                                case "BREASTSTROKE":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.COMPETITION,Discipline.BREASTSTROKE,minutes,seconds,milliseconds,location,place);
                                    break;
                                }
                                case "BACKSTROKE":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.COMPETITION,Discipline.BACKSTROKE,minutes,seconds,milliseconds,location,place);
                                    break;
                                }
                                case "BUTTERFLY":{
                                    controller.currentLoggedCoach.registerResult(controller.file_s, controller.file_r, id, Coach.ResultType.COMPETITION,Discipline.BUTTERFLY,minutes,seconds,milliseconds,location,place);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    if (quitSwitch) break;
                    System.out.println("RECORD WAS SUCCESSFULLY ADDED!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 3:{
                    System.out.println("[1] TRAINING RESULTS");
                    System.out.println("[2] COMPETITION RESULTS");
                    System.out.println("[3] BACK");
                    int type = getChoice(3);
                    if(type == 3) break;
                    System.out.println("[1] FREESTYLE");
                    System.out.println("[2] CRAWL");
                    System.out.println("[3] BREASTSTROKE");
                    System.out.println("[4] BACKSTROKE");
                    System.out.println("[5] BUTTERFLY");
                    System.out.println("[6] EXIT");
                    int discipline = getChoice(6);
                    if(discipline == 6) break;
                    controller.file_r.printBestResults(type,discipline,controller.file_s);
                    break;
                }
                case 4:{
                    controller.currentLoggedCoach.setPassword(getNewPassword());
                    controller.file_c.saveToFile();
                    System.out.println("PASSWORD CHANGED SUCCESSFULLY!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 5:{
                    exit = true;
                }
            }
            if(exit){
                controller.currentLoggedCoach = null;
                break;
            }
        }
    }
}
