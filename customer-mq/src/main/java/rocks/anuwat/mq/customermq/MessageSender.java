package rocks.anuwat.mq.customermq;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import rocks.anuwat.mq.entity.Customer;

public class MessageSender {
    @Autowired
    private TopicExchange topic;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendEmail(Customer customer) {
        String key = "email.customer";
        rabbitTemplate.convertAndSend(topic.getName(), key, customer);
    }

}