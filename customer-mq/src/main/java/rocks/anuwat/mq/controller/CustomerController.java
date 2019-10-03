package rocks.anuwat.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rocks.anuwat.mq.entity.Customer;
import rocks.anuwat.mq.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping()
    public ResponseEntity<?> postCustomer(@RequestBody Customer body) {
        Customer customer = customerService.createCustomer(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
    
}
