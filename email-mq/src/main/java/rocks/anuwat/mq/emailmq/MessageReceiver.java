package rocks.anuwat.mq.emailmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import rocks.anuwat.mq.entity.Customer;

@RabbitListener(queues = "#{autoDeletedQueue.name}")
public class MessageReceiver {
    @Autowired
    EmailService emailService;

    @RabbitHandler
    public void receive(Customer customer) {
        System.out.println(customer);
        emailService.sendMessageToCustomer(customer);
    }
    
}