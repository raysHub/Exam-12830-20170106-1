package com.ray.dao;

import com.ray.dto.Customer;

public interface CustomerDao extends BaseDao<Customer> {
    
    Customer getByName(String userName);
}
