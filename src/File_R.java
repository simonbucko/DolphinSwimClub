import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeSet;

public class File_R {
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

    public void printNewRecord(BestResult result){
        pw.printf(result.getSwimmerId() + "");
        printSpaces(result.getSwimmerId()+"");
        pw.printf(result.getDiscipline() + "");
        printSpaces(result.getDiscipline() + "");
        pw.printf(result.getDate() + "");
        printSpaces(result.getDate() + "");
        pw.printf(result.getTime() + "");
        printSpaces(result.getTime() + "");
        pw.printf(result.getLocation());
        printSpaces(result.getLocation());
        pw.printf(result.getPlace() + "");
        printSpaces(result.getPlace() + "");
        pw.println();
    }

    public void saveToFile(){
        try {
            eraseFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        printHeader();
        //training result
        for(int i = 0; i < 5; i++){
            for(Object result : trainingResults[i]){
                BestResult br = (BestResult)result;
                printNewRecord(br);
            }
        }
    //competition result
        for(int i = 0; i < 5; i++){
            for(Object result : competitionResults[i]){
                BestResult br = (BestResult)result;
                printNewRecord(br);
            }
        }
    }

    public void eraseFile() throws IOException{
        FileWriter fw = new FileWriter(file,false);
        PrintWriter pw = new PrintWriter(fw,true);
        pw.print("");
    }


    public void loadData(File_S file_s) throws IOException{
        sc = new Scanner(file);
        sc.nextLine();
        while(sc.hasNext()){
            int swimmerId = sc.nextInt();
            String discipline = sc.next();
            LocalDate date = LocalDate.parse(sc.next());
            long time = sc.nextLong();
            String location = sc.next();
            int place = sc.nextInt();
            EliteSwimmer es = file_s.getEliteSwimmerById(swimmerId);
            switch (location){
                case "PRACTICE":{
                    switch (discipline){
                        case "FREESTYLE": {
                            BestResult br = new BestResult(Discipline.FREESTYLE,date, time,es);
                            es.getTrainingResult()[0] = br;
                            trainingResults[0].add(br);
                            break;
                        }
                        case "CRAWL": {
                            BestResult br = new BestResult(Discipline.CRAWL,date, time,es);
                            es.getTrainingResult()[1] = br;
                            trainingResults[1].add(br);
                            break;
                        }
                        case "BREASTSTROKE": {
                            BestResult br = new BestResult(Discipline.BREASTSTROKE, date, time,es);
                            es.getTrainingResult()[2] = br;
                            trainingResults[2].add(br);
                            break;
                        }
                        case "BACKSTROKE": {
                            BestResult br = new BestResult(Discipline.BACKSTROKE, date, time,es);
                            es.getTrainingResult()[3] = br;
                            trainingResults[3].add(br);
                            break;
                        }
                        case "BUTTERFLY": {
                            BestResult br = new BestResult(Discipline.BUTTERFLY,date,time,es);
                            es.getTrainingResult()[4] = br;
                            trainingResults[4].add(br);
                            break;
                        }
                    }
                    break;
                }
                default:{
                    switch (discipline){
                        case "FREESTYLE": {
                            BestResult br = new BestResult(Discipline.FREESTYLE,date,location,place,time,es);
                            es.getCompetitionResult()[0] = br;
                            competitionResults[0].add(br);
                            break;
                        }
                        case "CRAWL": {
                            BestResult br = new BestResult(Discipline.CRAWL,date,location,place,time,es);
                            es.getCompetitionResult()[1] = br;
                            competitionResults[1].add(br);
                            break;
                        }
                        case "BREASTSTROKE": {
                            BestResult br = new BestResult(Discipline.BREASTSTROKE,date,location,place,time,es);
                            es.getCompetitionResult()[2] = br;
                            competitionResults[2].add(br);
                            break;
                        }
                        case "BACKSTROKE": {
                            BestResult br = new BestResult(Discipline.BACKSTROKE,date,location,place,time,es);
                            es.getCompetitionResult()[3] = br;
                            competitionResults[3].add(br);
                            break;
                        }
                        case "BUTTERFLY": {
                            BestResult br = new BestResult(Discipline.BUTTERFLY,date,location,place,time,es);
                            es.getCompetitionResult()[4] = br;
                            competitionResults[4].add(br);
                            break;
                        }
                    }
                }
            }

        }
    }

    public void deleteRecord(int line) throws IOException{

    }

    public void printHeader(){
        pw.printf("SWIMMER_ID");
        printSpaces("SWIMMER_ID");
        pw.printf("DISCIPLINE");
        printSpaces("DISCIPLINE");
        pw.printf("DATE");
        printSpaces("DATE");
        pw.printf("TIME");
        printSpaces("TIME");
        pw.printf("LOCATION");
        printSpaces("LOCATION");
        pw.printf("PLACE");
        printSpaces("PLACE");
        pw.println();
    }

    public void printSpaces(String word){
        int ID_OFFSET = 30;
        int nameLength = word.length();
        for (int i=0; i<ID_OFFSET-nameLength; i++) pw.printf(" ");
    }

    public TreeSet[] getCompetitionResults() {
        return competitionResults;
    }

    public TreeSet[] getTrainingResults() {
        return trainingResults;
    }

    private void printResultData(BestResult br, File_S file_s){
        System.out.println(br.getSwimmerId() + " "+file_s.getSwimmerById(br.getSwimmerId()).getName()+" "+file_s.getSwimmerById(br.getSwimmerId()).getSurname()+" " + br.convertMilliToString() + " " +br.getDate()+ " " +br.getLocation()+" "+br.getPlace());
    }

    public void printBestResults(int type, int discipline , File_S file_s){
        int counter = 5;
        switch (type){
            case 1:{
                if(trainingResults[discipline-1].size() == 0){
                    System.out.println("UNFORTUNATELY, THERE ARE NO TRAININGS RESULTS FOR THIS DISCIPLINE.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    for(Object result : trainingResults[discipline-1]){
                        BestResult br = (BestResult)result;
                        printResultData(br,file_s);
                        counter--;
                        if (counter == 5) break;
                    }
                }
                break;
            }
            case 2:{
                if(competitionResults[discipline-1].size() == 0){
                    System.out.println("UNFORTUNATELY, THERE ARE NO COMPETITION RESULTS FOR THIS DISCIPLINE.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    for(Object result : competitionResults[discipline-1]){
                        BestResult br = (BestResult)result;
                        printResultData(br,file_s);
                        counter--;
                        if (counter == 5) break;
                    }
                }

                break;
            }
        }
    }
}
