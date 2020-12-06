import java.time.LocalDate;

public class PassiveSwimmer extends Swimmer{
    public PassiveSwimmer(int id, String swimStyle, String name, String surname, String phone, String email, int age,boolean wasNotified) {
        super(id,swimStyle,name, surname, phone, email, age,wasNotified);
    }
    public PassiveSwimmer(int id, String swimStyle, String name, String surname, String phone, String email, int age, LocalDate membershipStart, boolean wasNotified) {
        super(id,swimStyle,name, surname, phone, email, age,membershipStart,wasNotified);
    }
}
