import java.time.LocalDate;
import java.util.ArrayList;

public class EliteSwimmer extends Swimmer {
//   [freestyle,crawl,breaststroke,backstroke,butterfly]
   private  BestResult[] competitionResult = new BestResult[5];
   private  BestResult[] trainingResult = new BestResult[5];


   public EliteSwimmer(int id, String swimStyle, String name, String surname, String phone, String email, int age, boolean wasNotified) {
      super(id, swimStyle, name, surname, phone, email, age, wasNotified);
   }

   public EliteSwimmer(int id, String swimStyle, String name, String surname, String phone, String email, int age, LocalDate membershipStart, boolean wasNotified) {
      super(id,swimStyle,name, surname, phone, email, age,membershipStart,wasNotified);
   }

   public BestResult[] getTrainingResult() {
      return trainingResult;
   }

   public BestResult[] getCompetitionResult() {
      return competitionResult;
   }

}
