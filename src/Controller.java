import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
    File_C file_c;
    File_R file_r;
    File_S file_s;
    Chairman chairman;
    Treasurer treasurer;
    int lastSwimmerId;
    int lastCoachId;
    Coach currentLoggedCoach;
    MailSender ms;
    public Controller(){
        try {
            file_c = new File_C();
            file_s = new File_S();
            file_r = new File_R();
            file_c.loadData();
            file_s.loadData(file_c);
            file_r.loadData(file_s);
        }catch (IOException e){
            System.out.println("Problem with loading data from files");
        }
        chairman = new Chairman("Samuel","Bartek","09876543","bartek@gmail.com",28,"password");
        treasurer = new Treasurer("Lubomir","Bucko","76876546","lubomir@gmail.com",19,"lubomir123");
        ms = new MailSender();
        lastCoachId = file_c.getCoaches().get(file_c.getCoaches().size() - 1).getId();
        lastSwimmerId = file_s.getSwimmers().get(file_s.getSwimmers().size() - 1).getId();
    }

    public void sendNotifications(){
        LocalDate localDate = LocalDate.now();
        ArrayList<Swimmer> removeGuys = new ArrayList<Swimmer>();
        for(Swimmer swimmer:file_s.getSwimmers()){
            //remove old members
            if(swimmer.getMembershipEnd().isBefore(localDate)) {
                removeGuys.add(swimmer);
            }
            //send emails
            if(swimmer.getMembershipStart().plusMonths(11).isBefore(localDate) && !(swimmer.getWasNotified())){
                ms.sendMail(swimmer);
                swimmer.setWasNotified(true);
                file_s.saveToFile();
            }
        }
        file_s.deleteRecords(removeGuys);
//        System.out.println("Number of deletions of old members: " + removeGuys.size());
        System.out.println("SYSTEM IS NOW READY TO BE USED! ENJOY :)");
    }

}
