package ar.edu.utn.frba.dds.domain.cargadorcsv;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EnviadorEmails {

    private final String username = "mimail@gmail.com";
    private final String password = "micontraseña";
    public void enviarEmail(String destinatario, String asunto, String mensajeTexto) {
      Properties prop = new Properties();
      prop.put("mail.smtp.host", "smtp.gmail.com");
      prop.put("mail.smtp.port", "587");
      prop.put("mail.smtp.auth", "true");
      prop.put("mail.smtp.starttls.enable", "true"); //TLS

      Session session = Session.getInstance(prop,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
            }
          });

      try {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(
            Message.RecipientType.TO,
            InternetAddress.parse(destinatario)
        );
        message.setSubject(asunto);
        message.setText(mensajeTexto);

        Transport.send(message);

        System.out.println("Correo enviado exitosamente");

      } catch (MessagingException e) {
        e.printStackTrace();
      }
    }
  }
