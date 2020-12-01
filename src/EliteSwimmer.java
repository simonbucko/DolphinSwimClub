import java.util.ArrayList;

public class EliteSwimmer extends Swimmer {
   public ArrayList<BestResult> competitionResult = new ArrayList<BestResult>();
   public ArrayList<BestResult> trainingResult = new ArrayList<BestResult>();

   public EliteSwimmer(int id, String swimStyle, String name, String surname, String phone, String email, int age) {
      super(id, swimStyle, name, surname, phone, email, age);
   }
}
