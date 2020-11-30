import java.io.*;
import java.util.*;
public class File_S {

    private File file = null;
    private FileWriter fw = null;
    private PrintWriter pw = null;
    private Scanner sc = null;

    public ArrayList<Swimmer> swimmer1 = new ArrayList<Swimmer>();
    public ArrayList<EliteSwimmer> eliteSwimmer = new ArrayList<EliteSwimmer>();

    public static void main(String [] args){
        createFile();
    }

    public static void createFile() {

        try {
            File myObj = new File("C:\\Users\\mikke\\OneDrive\\Dokumenter\\Projekt DolphinClub\\DolphinSwimClub\\src\\File_S.txt");
            if (myObj.createNewFile()) {
                System.out.println("File_S created: " + myObj.getName());
            } else {
                System.out.println("File_S already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating File_S.");
            e.printStackTrace();
        }

    }

    public void clearFile() {
        try {
            fw = new FileWriter(file, false);
            pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        }catch (IOException e){
            System.out.println("An error occurred while clearing a file_S.txt.");
            e.printStackTrace();
        }
        prepareForWriting();
    }
    public void prepareForWriting(){
        try{
            fw = new FileWriter(file, true);
        }catch (IOException e){
            System.out.println("An error occurred while creating a file writer for a file_C.txt.");
            e.printStackTrace();
        }
        try {
            pw = new PrintWriter(fw,true);
        }catch (Exception e){
            System.out.println("An error occurred while creating a print writer for a file_C.txt.");
            e.printStackTrace();
        }
    }
    public void printSpaces(String word){
        int ID_OFFSET = 30;
        int nameLength = word.length();
        for (int i=0; i<ID_OFFSET-nameLength; i++) pw.printf(" ");
    }
    public void printHeader(){
        pw.printf("SWIMMER'S NAME");
        printSpaces("SWIMMER'S NAME");
        pw.printf("SWIMMER ID");
        printSpaces("SWIMMER ID");
        pw.printf("CARD ID");
        printSpaces("CARD ID");
        pw.printf("CARD BALANCE");
        printSpaces("CARD BALANCE");
        pw.println();
    }
    /*public ArrayList<Swimmer> getAllRecords(){
        ArrayList<Swimmer> swimmer = new ArrayList<Swimmer>();
        sc.nextLine();
        while(sc.hasNext()){
            boolean isExisting = false;
            String name;
            long userId;
            long cardId;
            int balance;
            name = sc.next();
            userId = sc.nextLong();
            cardId = sc.nextLong();
            balance = sc.nextInt();
            for (Swimmer cSwimmer : swimmer){
                if(cSwimmer.getId() == userId){
                    WashingCard card = new WashingCard(cardId,balance);
                    cSwimmer.addCard(card);
                    isExisting = true;
                }
            }
            if(isExisting){
                continue;
            }
            Swimmer swimmer = new Customer(name,userId);
            WashingCard card = new WashingCard(cardId,balance);
            customer.addCard(card);
            customers.add(customer);
        }
        return customers;
    }*/
}
