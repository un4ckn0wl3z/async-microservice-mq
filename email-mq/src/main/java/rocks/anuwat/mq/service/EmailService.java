package rocks.anuwat.mq.service;

import rocks.anuwat.mq.entity.Customer;

public interface EmailService {
    void sendMessageToCustomer(Customer customer);
    
}