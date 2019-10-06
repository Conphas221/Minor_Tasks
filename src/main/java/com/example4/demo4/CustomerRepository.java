package com.example4.demo4;

public interface CustomerRepository extends BaseRepository<Customer, Long> {
    Customer findByCustomerNumber(Long customerNumber);
}
