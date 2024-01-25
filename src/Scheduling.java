import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
import javax.activation.*;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduling {
    private static final String SMTP_HOST = "your_smtp_server.com";
    private static final String SMTP_PORT = "587";
    private static final String EMAIL_USERNAME = "your_username";
    private static final String EMAIL_PASSWORD = "your_password";
    private static final String SENDER_EMAIL = "your_email@example.com";
    private static final String RECIPIENT_EMAIL = "recipient@example.com";
    private static final String DATASET_PATH_PREFIX = "path_to_dataset_folder/"; // Replace with your dataset folder path

    public static void main(String[] args) {
        Timer timer = new Timer();
        int weeksToSend = 4; // Send for 4 weeks

        for (int week = 0; week < weeksToSend; week++) {
            String datasetPath = DATASET_PATH_PREFIX + "dataset_week" + (week + 1) + ".csv"; // Change the dataset file names accordingly
            timer.schedule(new EmailTask(datasetPath), week * 7 * 24 * 60 * 60 * 1000L);
        }
    }

    static class EmailTask extends TimerTask {
        private final String datasetPath;

        public EmailTask(String datasetPath) {
            this.datasetPath = datasetPath;
        }

        @Override
        public void run() {
            Properties properties = System.getProperties();
            properties.put("mail.smtp.host", SMTP_HOST);
            properties.put("mail.smtp.port", SMTP_PORT);
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");

            /*Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(EMAIL_USERNAME, EMAIL_PASSWORD);
                }
            });

            try {
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(SENDER_EMAIL));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(RECIPIENT_EMAIL));
                message.setSubject("Monthly Dataset");

                // Attach the dataset to the email
                MimeBodyPart datasetPart = new MimeBodyPart();
                FileDataSource fileDataSource = new FileDataSource(datasetPath);
                datasetPart.setDataHandler(new DataHandler(fileDataSource));
                datasetPart.setFileName(fileDataSource.getName());

                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(datasetPart);

                message.setContent(multipart);

                Transport.send(message);
                System.out.println("Email with " + datasetPath + " sent successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }
    }
}

