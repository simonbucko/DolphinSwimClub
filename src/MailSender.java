import com.email.durgesh.Email;

public class MailSender {

    public void sendMail(Swimmer swimmer){
        try {
            System.out.println("Preparing to send mail to " + swimmer.getName() + " " + swimmer.getSurname());
            Email email = new Email("dolphin.club.system@gmail.com", "dolphinclub123");
            email.setFrom("dolphin.club.system@gmail.com","Dolphin Club");
            email.setSubject("Your membership is about to expire");
            email.setContent(HtmlTemplate.getTemplate(swimmer.getName(),swimmer.getSurname(),swimmer.getMembershipEnd()), "text/html");
            email.addRecipient(swimmer.getEmail());
            email.send();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
