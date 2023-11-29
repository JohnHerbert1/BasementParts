package model;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnvioEmail {
    public static void enviarEmail() {
        SimpleEmail email = new SimpleEmail();
        try {
        	email.setDebug(true);
            email.setHostName("smtp.gmail.com");
            email.setAuthentication("projetoPOO2023.1@gmail.com", "wedc buli emsp owkl");
            email.setSSLOnConnect(true);
            email.addTo("projetoPOO2023.1@gmail.com");
            email.setFrom("projetoPOO2023.1@gmail.com");
            email.setSubject("Testando envio de email!!!");
            email.setMsg("Testando o envio de email.");
            email.send();
        } catch (EmailException erro) {
            System.out.println("Falha ao enviar o email!");
        }
    }
}
