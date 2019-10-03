package rocks.anuwat.mq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rocks.anuwat.mq.customermq.MessageSender;
import rocks.anuwat.mq.entity.Customer;
import rocks.anuwat.mq.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    MessageSender sender;

    CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        Customer result = customerRepository.save(customer);
        sender.sendEmail(customer);
        return result;
    }
    
}
