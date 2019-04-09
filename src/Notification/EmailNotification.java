/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notification;

import java.awt.Component;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.JOptionPane;

public class EmailNotification {
    
    //Atributo para instanciar
    private static final EmailNotification instance = new EmailNotification();

    public static EmailNotification getInstance() {
        return instance;
    }
    
    //Atributos predeterminados para enviar el correo electrónico.
    private String host = "smtp.gmail.com";
    private final String user = "proyectoprogramado2dnjab@gmail.com";
    private final String password = "dropbox123";
    private final String to = "jabrenega@gmail.com";

    private Properties getProperties() {

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");

        props.put("mail.smtp.socketFactory.port", 465);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        return props;
    }

    private Session getSession() {
        Properties props = getProperties();
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
        return session;
    }

    public void sendEmail(String to, String text, Component parent) {

        try {
            Session session = getSession();
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Solicitud recibida");
            message.setText("Su solicitud está siendo procesada");

            Transport.send(message);

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(parent, e.getMessage());
        }
    }

}
