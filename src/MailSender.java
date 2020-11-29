import com.email.durgesh.Email;
import java.util.Date;

public class MailSender {

    public void sendMail(String name, String surname, String recipient){
        try {
            Email email = new Email("dolphin.club.system@gmail.com", "dolphinclub123");
            email.setFrom("dolphin.club.system@gmail.com","Dolphin Club");
            email.setSubject("Testing");
            email.setContent(HtmlTemplate.getTemplate(name,surname), "text/html");
            email.addRecipient(recipient);
            email.send();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
