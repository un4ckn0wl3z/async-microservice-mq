package rocks.anuwat.mq.repository;

import org.springframework.data.repository.CrudRepository;

import rocks.anuwat.mq.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	  
}