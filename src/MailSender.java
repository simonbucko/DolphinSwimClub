import com.email.durgesh.Email;

public class MailSender {

    public void sendMail(String name, String surname, String recipient){
        try {
            System.out.println("Preparing to send mail to " + name + " " + surname);
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
