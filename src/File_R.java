import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class File_R {
    enum Discipline {
        FREESTYLE,
        CRAWL,
        BREASTSTROKE,
        BACKSTROKE,
        BUTTERFLY
    }
    //[freestyle,crawl,breaststroke,backstroke,butterfly]
    private TreeSet[] trainingResults = {new TreeSet<BestResult>(),new TreeSet<BestResult>(),new TreeSet<BestResult>(),new TreeSet<BestResult>(),new TreeSet<BestResult>()};
    private TreeSet[] competitionResults = {new TreeSet<BestResult>(),new TreeSet<BestResult>(),new TreeSet<BestResult>(),new TreeSet<BestResult>(),new TreeSet<BestResult>()};

    private File file = null;
    private Scanner sc = null;
    private FileWriter fw = null;
    private PrintWriter pw = null;

    public File_R() throws IOException {
        file = new File("results.txt");
        if(!file.exists()) file.createNewFile();
        fw = new FileWriter(file,true);
        pw = new PrintWriter(fw,true);
    }

    public void printNewRecord(int id, Discipline discipline, long time, String location, String place){
        pw.printf(id + "");
        printSpaces(id+"");
        pw.printf(discipline + "");
        printSpaces(discipline + "");
        pw.printf(time + "");
        printSpaces(time + "");
        pw.printf(location);
        printSpaces(location);
        pw.printf(place);
        printSpaces(place);
    }

    public void saveToFile(){

    }

    public void eraseFile() throws IOException{
        FileWriter fw = new FileWriter(file,false);
        PrintWriter pw = new PrintWriter(fw,true);
        pw.print("");
    }


    public void loadData() throws IOException{
        sc = new Scanner(file);
        while(sc.hasNext()){


        }
    }

    public void deleteRecord(int line) throws IOException{

    }

    public void printHeader(){
        pw.printf("SWIMMER_ID");
        printSpaces("SWIMMER_ID");
        pw.printf("DISCIPLINE");
        printSpaces("DISCIPLINE");
        pw.printf("TIME");
        printSpaces("TIME");
        pw.printf("LOCATION");
        printSpaces("LOCATION");
        pw.printf("PLACE");
        printSpaces("PLACE");
    }

    public void printSpaces(String word){
        int ID_OFFSET = 30;
        int nameLength = word.length();
        for (int i=0; i<ID_OFFSET-nameLength; i++) pw.printf(" ");
    }
}
