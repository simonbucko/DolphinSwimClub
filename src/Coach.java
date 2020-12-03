import java.time.LocalDate;
import java.util.ArrayList;

public class Coach extends Person {

    public Coach(int id, String swimmingStyle, String name, String surname, String phone, String email, int age, String password){
        super(name,surname,phone,email,age);
        this.id =id;
        this.swimmingStyle = swimmingStyle;
        this.password = password;
    }

    enum ResultType {
        COMPETITION,
        TRAINING
    }

    private int id;
    private String swimmingStyle;
    public ArrayList<EliteSwimmer> students = new ArrayList<EliteSwimmer>();
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public String getSwimmingStyle() {
        return swimmingStyle;
    }

    public void setSwimmingStyle(String newSwimingStyle) {
        this.swimmingStyle = newSwimingStyle;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void displayStudents() {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).printData();
        }
    }

    public ArrayList<EliteSwimmer> getStudents() {
        return students;
    }

    public void registerResult(File_S fileS, File_R file_r, int id, ResultType type, Discipline discipline, int minutes, int seconds, int milliseconds, String location, int place) {
        switch (type) {
            case TRAINING: {
                switch (discipline) {
                    case FREESTYLE: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.FREESTYLE, LocalDate.now(), minutes,seconds,milliseconds,swimmer);
                        file_r.getTrainingResults()[0].add(br);
                        swimmer.getTrainingResult()[0] = br;
                        break;
                    }
                    case CRAWL: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.CRAWL, LocalDate.now(),minutes,seconds,milliseconds,swimmer);
                        file_r.getTrainingResults()[1].add(br);
                        swimmer.getTrainingResult()[1] = br;
                        break;
                    }
                    case BREASTSTROKE: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.BREASTSTROKE, LocalDate.now(),minutes,seconds,milliseconds,swimmer);
                        file_r.getTrainingResults()[2].add(br);
                        swimmer.getTrainingResult()[2] = br;
                        break;
                    }
                    case BACKSTROKE: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.BACKSTROKE, LocalDate.now(),minutes,seconds,milliseconds,swimmer);
                        file_r.getTrainingResults()[3].add(br);
                        swimmer.getTrainingResult()[3] = br;
                        break;
                    }
                    case BUTTERFLY: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.BUTTERFLY, LocalDate.now(),minutes,seconds,milliseconds,swimmer);
                        file_r.getTrainingResults()[4].add(br);
                        swimmer.getTrainingResult()[4] = br;
                        break;
                    }
                }
                break;
            }
            case COMPETITION: {
                switch (discipline) {
                    case FREESTYLE: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.FREESTYLE, LocalDate.now(),location,place,minutes,seconds,milliseconds,swimmer);
                        file_r.getCompetitionResults()[0].add(br);
                        swimmer.getCompetitionResult()[0] = br;
                        break;
                    }
                    case CRAWL: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.CRAWL, LocalDate.now(),location,place,minutes,seconds,milliseconds,swimmer);
                        file_r.getCompetitionResults()[1].add(br);
                        swimmer.getCompetitionResult()[1] = br;
                    }
                    case BREASTSTROKE: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.BREASTSTROKE, LocalDate.now(),location,place,minutes,seconds,milliseconds,swimmer);
                        file_r.getCompetitionResults()[2].add(br);
                        swimmer.getCompetitionResult()[2] = br;
                        break;
                    }
                    case BACKSTROKE: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.BACKSTROKE, LocalDate.now(),location,place,minutes,seconds,milliseconds,swimmer);
                        file_r.getCompetitionResults()[3].add(br);
                        swimmer.getCompetitionResult()[3] = br;
                    }
                    case BUTTERFLY: {
                        EliteSwimmer swimmer = (EliteSwimmer) fileS.getSwimmers().get(id);
                        BestResult br = new BestResult(Discipline.BUTTERFLY, LocalDate.now(),location,place,minutes,seconds,milliseconds,swimmer);
                        file_r.getCompetitionResults()[4].add(br);
                        swimmer.getCompetitionResult()[4] = br;
                    }
                }
                break;
            }
        }
    }


}
