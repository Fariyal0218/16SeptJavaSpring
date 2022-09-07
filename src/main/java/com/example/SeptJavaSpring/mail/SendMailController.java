package com.example.SeptJavaSpring.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMailController {
    
    @Autowired
    private MailSender mailSender;

    @PostMapping("sendMail")
    public String sendEmail(){

        String from = "fariyalshaikh5@gmail.com";
        String to ="shaikhfariyal02@gmail.com";


        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject("Hii");
        mailMessage.setText("Hii Fariyal.......");
        mailMessage.setCc("fariyalshaikh5@gmail.com");
        mailSender.send(mailMessage);

        return "mail send";
    }


}
