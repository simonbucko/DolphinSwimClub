import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class File_c {

        public File file = null;
        public Scanner sc = null;
        public FileWriter fw = null;
        public PrintWriter pw = null;

    private ArrayList<Coach> coaches = new ArrayList<Coach>();

        public createFile() throws IOException {
            file = new File("coaches.txt");
            if(!file.exists()) file.createNewFile();
            fw = new FileWriter(file,true);
            pw = new PrintWriter(fw,true);
        }

    public void loadData() throws IOException{
        sc = new Scanner(file);
        sc.nextLine();
        while(sc.hasNext()){
            int id = sc.nextInt();
            String name = sc.next();
            String surName = sc.next();
            int age = sc.nextInt();
            int phone = sc.nextInt();
            String email = sc.next();
            String swimStyle = sc.next();
        }
    }


    public void eraseFile() throws IOException{
            FileWriter fw = new FileWriter(file,false);
            PrintWriter pw = new PrintWriter(fw,true);
            pw.print("");
        }

    public void printAllData(){
        for (Coach coach : coaches){
            System.out.println(coach.getId() + " " + coach.getName() + " " + coach.getSurName() + " " + coach.getAge() + " " + coach.getPhone() + " " + coach.getEmail() + " " + coach.getSwimStyle() + " + ");
        }
    }

    public void deleteRecord(int index) throws IOException{
        coaches.remove(index);
        eraseFile();
        for(Coach coach : coaches){
            System.out.println(coach.getId() + " " + coach.getName() + " " + coach.getSurName() + " " + coach.getAge() + " " + coach.getPhone() + " " + coach.getEmail() + " " + coach.getSwimStyle() + " + ")
        }

    }

    public void saveToFile(int id, String name, String surname, int age, int phone, String email, String swimStyle){
        try {
            eraseFile();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        prepareForWriting();
        printHeader();

        pw.println(id + " " + name + " " + surname + " " + age + " " + phone + " " + email + " " + swimStyle + " " );
        pw.close();

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
        pw.printf("SWIM STYLE");
        printSpaces("SWIM STYLE");
        pw.println();
    }

    public void getCoachById(String anId)
    {
        int arraySize = coaches.size();
        for(int i=0; i<arraySize; i++) {
            if (coaches.get(i).getId().equals(anId)) {
                System.out.println(coaches.get(i));
            }
        }
    }
}




