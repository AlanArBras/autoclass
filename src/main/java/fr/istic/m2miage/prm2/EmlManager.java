package fr.istic.m2miage.prm2;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class EmlManager {
    public static final String BASE_PATH = "/home/alan/Windows/M2_MIAGE_PRIVATE/Semestre 1/PRM2 (Didier Certain)/TP/TP2/EML_a_trier";

    public ArrayList<String> emailsPaths;

    public static void display(File emlFile) throws Exception{
        Properties props = System.getProperties();
        props.put("mail.host", "smtp.dummydomain.com");
        props.put("mail.transport.protocol", "smtp");

        Session mailSession = Session.getDefaultInstance(props, null);
        InputStream source = new FileInputStream(emlFile);
        MimeMessage message = new MimeMessage(mailSession, source);


        System.out.println("Subject : " + message.getSubject());
        System.out.println("From : " + message.getFrom()[0]);
        System.out.println("--------------");
        System.out.println("Body : " +  message.getContent());
    }
}
