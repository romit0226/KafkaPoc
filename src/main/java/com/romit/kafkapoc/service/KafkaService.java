package com.romit.kafkapoc.service;

import com.romit.kafkapoc.model.entity.Customer;
import com.romit.kafkapoc.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    CustomerRepository customerRepository;


    public String createCustomer(String firstName,String lastName){
        Customer c= new Customer(firstName,lastName);
        customerRepository.save(c);

        return "Saved";
    }
}
