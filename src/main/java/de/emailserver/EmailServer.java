package de.emailserver;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

    /**
     *
     * @author Yasemin
     */
    class EmailService {
        public static void main(String[] args) throws EmailException {

            // Create the attachment
            EmailAttachment attachment1 = new EmailAttachment();
            attachment1.setPath("C:\\Users\\Jasmin\\Desktop\\InvitetextDaten\\invite2.ics");
            attachment1.setDisposition(EmailAttachment.ATTACHMENT);
            attachment1.setDescription("Unser Termin1");
            attachment1.setName("invite2.ics");

            EmailAttachment attachment2 = new EmailAttachment();
            attachment2.setPath("C:\\Users\\Jasmin\\Desktop\\InvitetextDaten\\invite.ics");
            attachment2.setDisposition(EmailAttachment.ATTACHMENT);
            attachment2.setDescription("Unser Termin2");
            attachment2.setName("invite.ics");



            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");
//        email.setSmtpPort(587);
            email.setSslSmtpPort("587");
//        email.setSocketConnectionTimeout(0);
//        email.setSocketTimeout(0);
            email.setStartTLSRequired(true);

        //email.setSSLOnConnect(true);
            email.setAuthenticator(new
                    DefaultAuthenticator("anyas8680@outlook.de", "#Al-Fettah_19#"));

            email.setFrom("anyas8680@outlook.de");
            email.setSubject("Email mit Anhang mit Multipart");
            email.setMsg("mit anhang diesmal");
            email.addTo("nimesay80@googlemail.com");

            email.attach(attachment1);
            //email.attach(attachment2);
            email.send();

        }
}
