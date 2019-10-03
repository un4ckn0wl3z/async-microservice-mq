package rocks.anuwat.mq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import rocks.anuwat.mq.entity.Customer;
import rocks.anuwat.mq.service.EmailService;

@Component
public class EmailServiceImpl implements EmailService {
    @Autowired
    public JavaMailSender emailSender;

    @Override
    public void sendMessageToCustomer(Customer customer) {
        StringBuilder subject = new StringBuilder("Created User ");
        SimpleMailMessage message = new SimpleMailMessage();

        subject.append(customer.getFirstName()).append(" ");
        subject.append(customer.getLastName());
        System.out.println(subject.toString());

        message.setTo(customer.getEmail());
        message.setSubject(subject.toString());
        message.setText(customer.toString());
        emailSender.send(message);
    }
  
}