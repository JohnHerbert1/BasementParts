package model;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnvioEmail {
    public static void enviarEmail(String tipo, String tipoMensagem) {
        SimpleEmail email = new SimpleEmail();
        try {
        	email.setDebug(true);
            email.setHostName("smtp.gmail.com");
            email.setAuthentication("projetoPOO2023.1@gmail.com", "wedc buli emsp owkl");
            email.setSSL(true); // ou email.setSSLOnConnect(true);
            email.addTo(tipo);
            email.setFrom(tipo);
            email.setSubject(tipoMensagem);
            email.setMsg(tipoMensagem);
            email.send();
        } catch (EmailException erro) {
            System.out.println("Falha ao enviar o email!");
        }
    }
    
}
