import java.util.ArrayList;

public class Coach extends Person {

    enum Discipline {
        FREESTYLE,
        CRAWL,
        BREASTSTROKE,
        BACKSTROKE,
        BUTTERFLY
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

    public void registerResult(File_S fileS, int id, ResultType type, Discipline discipline, int minutes, int seconds, int milliseconds, String location, int place) {
        switch (type) {
            case TRAINING: {
                switch (discipline) {
                    case FREESTYLE: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getTrainingResult()[0] = br;
                        break;
                    }
                    case CRAWL: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getTrainingResult()[1] = br;
                        break;
                    }
                    case BREASTSTROKE: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getTrainingResult()[2] = br;
                        break;
                    }
                    case BACKSTROKE: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getTrainingResult()[3] = br;
                        break;
                    }
                    case BUTTERFLY: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getTrainingResult()[4] = br;
                        break;
                    }
                }
                break;
            }
            case COMPETITION: {
                switch (discipline) {
                    case FREESTYLE: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getCompetitionResult()[0] = br;
                        break;
                    }
                    case CRAWL: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getCompetitionResult()[1] = br;
                        break;
                    }
                    case BREASTSTROKE: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getCompetitionResult()[2] = br;
                        break;
                    }
                    case BACKSTROKE: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getCompetitionResult()[3] = br;
                        break;
                    }
                    case BUTTERFLY: {
                        BestResult br = new BestResult(minutes, seconds, milliseconds);
                        ((EliteSwimmer) (fileS.getSwimmers().get(id))).getCompetitionResult()[4] = br;
                        break;
                    }
                }
                break;
            }
        }
    }


}
