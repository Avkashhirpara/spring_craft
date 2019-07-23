package com.firstcraft.repository;

import com.firstcraft.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;



@Repository("customerRepository")
public interface CustomerRepository extends
        JpaRepository<Customer, Long>,
        RevisionRepository<Customer,Long,Integer> {
}
