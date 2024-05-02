package com.zaid.musicstoremanagement.repositories;

import com.zaid.musicstoremanagement.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Customer,Long> {
    @Override
    Optional<Customer> findById(Long Id);
    @Override
    List<Customer> findAll();
     @Override
     void delete(Customer customer);
     @Override
     Customer save(Customer customer);
}
