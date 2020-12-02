public class Chairman extends Person {
    private String password = "password";

    enum SwimmerType{
        PASSIVE,
        ACTIVE,
        ELITE,
    }

    public Chairman(String name, String surname, String phone, String email, int age, String password){
        super(name,surname,phone,email,age);
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void addCoach(File_c file_c, int id, String swimStyle, String name, String surname, String phone, String email, int age, String password) {
        Coach coach = new Coach(id,swimStyle,name,surname,phone,email,age,password);
        file_c.getCoaches().add(coach);
    }


    public void addSwimmer(File_S file_s, SwimmerType type, int id, String name, String surname, String phone, String email, int age, String swimStyle, boolean notified) {
        switch (type){
            case PASSIVE: {
                PassiveSwimmer ps = new PassiveSwimmer(id,swimStyle,name,surname,phone,email,age,notified);
                file_s.getSwimmers().add(ps);
                break;
            }
            case ACTIVE:{
                ActiveSwimmer as = new ActiveSwimmer(id,swimStyle,name,surname,phone,email,age,notified);
                file_s.getSwimmers().add(as);
                break;
            }
            case ELITE:{
                EliteSwimmer es = new EliteSwimmer(id,swimStyle,name,surname,phone,email,age,notified);
                file_s.getSwimmers().add(es);
                break;
            }
        }
    }

}
