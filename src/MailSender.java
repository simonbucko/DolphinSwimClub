import java.util.Properties;

public class MailSender {
    public void sendMail(String receptient){
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        String EMAIL = "dolphin.club.system@gmail.com";
        String PASSWORD = "dolphinclub123";


    }
}
