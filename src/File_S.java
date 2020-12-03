import java.io.*;
import java.util.*;
import java.time.*;

public class File_S {

    private File file = null;
    private FileWriter fw = null;
    private PrintWriter pw = null;
    private Scanner sc = null;
    private ArrayList<Swimmer> swimmers = new ArrayList<Swimmer>();

    public File_S() throws IOException {
        file = new File("swimmers.txt");
        if(!file.exists()) file.createNewFile();
        fw = new FileWriter(file,true);
        pw = new PrintWriter(fw,true);
    }

    public static void createFile() {

        try {
            File myObj = new File("file_S.txt");
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
    public void loadData() throws IOException{
        
        sc = new Scanner(file);
        sc.nextLine();
        while(sc.hasNext()){
            int id = sc.nextInt();
            String name = sc.next();
            String surName = sc.next();
            int age = sc.nextInt();
            String phone = sc.next();
            String email = sc.next();
            LocalDate membershipStart = LocalDate.parse(sc.next());
            LocalDate membershipEnd = LocalDate.parse(sc.next());
            String type = sc.next();
            String swimStyle = sc.next();           
            boolean wasNotified = sc.nextBoolean();
            
            switch(type){
            
               case "Active":{
                  ActiveSwimmer aS = new ActiveSwimmer(id, swimStyle, name, surName, phone, email, age,wasNotified);
                  swimmers.add(aS);
                  break;   
               }    
               case "Passive":{
                  PassiveSwimmer pS = new PassiveSwimmer(id, swimStyle, name, surName, phone, email, age,wasNotified);
                  swimmers.add(pS);
                  break;
               }
            
               case "Elite":{
                  EliteSwimmer eS = new EliteSwimmer(id, swimStyle, name, surName, phone, email, age,wasNotified);
                  swimmers.add((Swimmer)eS);
               break;
               }
           }
            
        }
   }
   
    public void eraseFile() throws IOException{
        FileWriter fw = new FileWriter(file,false);
        PrintWriter pw = new PrintWriter(fw,true);
        pw.print("");
    }
    
    public void printAllData(){
        for (Swimmer swimmer : swimmers){
            System.out.println(swimmer.getId() + " " + swimmer.getName() + " " + swimmer.getSurname() + " " + swimmer.getAge() + " " + swimmer.getPhone() + " " + swimmer.getEmail() + " "+ swimmer.getMembershipStart() + " " + swimmer.getMembershipEnd() + " " + ((swimmer instanceof ActiveSwimmer)?"Active":(swimmer instanceof PassiveSwimmer)?"Passive":"Elite") + " " + swimmer.getSwimStyle() + " " + swimmer.getWasNotified() + " ");
        }
    }
    public void deleteRecord(int index) throws IOException{
        swimmers.remove(index);
        eraseFile();
        for(Swimmer swimmer : swimmers){
            System.out.println(swimmer.getId() + " " + swimmer.getName() + " " + swimmer.getSurname() + " " + swimmer.getAge() + " " + swimmer.getPhone() + " " + swimmer.getEmail() + " "+ swimmer.getMembershipStart() + " " + swimmer.getMembershipEnd() + " " + swimmer.getType() + " " + swimmer.getSwimStyle() + " " + swimmer.getWasNotified() + " ");
        }                
    }

    public void saveToFile(int id, String name, String surname, int age, int phone, String email, LocalDate membershipStart, LocalDate membershipEnd, String type, String swimStyle, boolean wasNotified){
        try {
            eraseFile();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        prepareForWriting();
        printHeader();

        pw.println(id + " " + name + " " + surname + " " + age + " " + phone + " " + email + " " + membershipStart + " " + membershipEnd + " " + type + " " + swimStyle + " " + wasNotified + " ");
        pw.close();
    
    }
    public void prepareForWriting(){
        try{
            fw = new FileWriter(file, true);
        }catch (IOException e){
            System.out.println("An error occurred while creating a file writer for a file_S.txt.");
            e.printStackTrace();
        }
        try {
            pw = new PrintWriter(fw,true);
        }catch (Exception e){
            System.out.println("An error occurred while creating a print writer for a file_S.txt.");
            e.printStackTrace();
        }
    }
    public void printSpaces(String word){
        int ID_OFFSET = 30;
        int nameLength = word.length();
        for (int i=0; i<ID_OFFSET-nameLength; i++) pw.printf(" ");
    }
    public void printHeader(){
        pw.printf("ID");
        printSpaces("ID");
        pw.printf("NAME");
        printSpaces("NAME");
        pw.printf("SURNAME");
        printSpaces("SURNAME");
        pw.printf("AGE");
        printSpaces("AGE");
        pw.printf("PHONE");
        printSpaces("PHONE");
        pw.printf("EMAIL");
        printSpaces("EMAIL");        
        pw.printf("MEMBERSHIP STAR");
        printSpaces("MEMBERSHIP START"); 
        pw.printf("MEMBERSHIP END");
        printSpaces("MEMBERSHIP END");
        pw.printf("TYPE");
        printSpaces("TYPE");
        pw.printf("SWIM TYPE");
        printSpaces("SWIM TYPE");
        pw.printf("NOTIFIED");
        printSpaces("NOTIFIED");
        pw.println();
    }

    public ArrayList<Swimmer> getSwimmers() {
        return swimmers;
    }

    public EliteSwimmer getEliteSwimmerById(int id)
    {
        for(Swimmer swimmer : swimmers){
            if(!(swimmer instanceof EliteSwimmer)) continue;
            if(swimmer.getId() == id) return (EliteSwimmer)swimmer;
        }
        return null;
    }
}
