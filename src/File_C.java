import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class File_C {

    public File file = null;
    public Scanner sc = null;
    public FileWriter fw = null;
    public PrintWriter pw = null;

    private ArrayList<Coach> coaches = new ArrayList<Coach>();

    public File_C() throws IOException {
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
            String phone = sc.next();
            String email = sc.next();
            String swimStyle = sc.next();
            String password = sc.next();
            Coach co = new Coach(id,swimStyle,name,surName,phone,email,age,password);
            coaches.add(co);
        }
    }


    public void eraseFile() throws IOException{
            FileWriter fw = new FileWriter(file,false);
            PrintWriter pw = new PrintWriter(fw,true);
            pw.print("");
        }

    public void printAllData(){
        for (Coach coach : coaches){
            System.out.println(coach.getId() + " " + coach.getName() + " " + coach.getSurname() + " " + coach.getAge() + " " + coach.getPhone() + " " + coach.getEmail() + " " + coach.getSwimmingStyle() + " + ");
        }
    }

    public void deleteRecord(int index) throws IOException{
        coaches.remove(index);
        eraseFile();
        for(Coach coach : coaches){
            System.out.println(coach.getId() + " " + coach.getName() + " " + coach.getSurname() + " " + coach.getAge() + " " + coach.getPhone() + " " + coach.getEmail() + " " + coach.getSwimmingStyle() + " + ");
        }

    }

    public void saveToFile(){
        try {
            eraseFile();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        printHeader();
        for (Coach coach : coaches){
            pw.printf(coach.getId() + "");
            printSpaces(coach.getId() + "");
            pw.printf(coach.getName());
            printSpaces(coach.getName());
            pw.printf(coach.getSurname());
            printSpaces(coach.getSurname());
            pw.printf(coach.getAge() + "");
            printSpaces(coach.getAge() + "");
            pw.printf(coach.getPhone());
            printSpaces(coach.getPhone());
            pw.printf(coach.getEmail());
            printSpaces(coach.getEmail());
            pw.printf(coach.getSwimmingStyle());
            printSpaces(coach.getSwimmingStyle());
            pw.printf(coach.getPassword());
            printSpaces(coach.getPassword());
            pw.println();
        }

        pw.close();

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
        pw.printf("PASSWORD");
        printSpaces("PASSWORD");
        pw.println();
    }

    public Coach getCoachById(int id)
    {
        for(int i=0; i<coaches.size(); i++) {
            if(coaches.get(i).getId() == id) return coaches.get(i);
        }
        return null;
    }

    public ArrayList<Coach> getCoaches() {
        return coaches;
    }
}




