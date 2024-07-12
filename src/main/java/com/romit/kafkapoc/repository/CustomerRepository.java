package com.romit.kafkapoc.repository;

import com.romit.kafkapoc.model.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
