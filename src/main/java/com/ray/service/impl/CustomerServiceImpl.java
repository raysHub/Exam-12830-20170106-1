package com.ray.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ray.dao.CustomerDao;
import com.ray.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerDao customerDao;

    @Override
    public boolean getByName(String userName) {
        if(customerDao.getByName(userName) != null){
            return true;
        }
        return false;
    }

   

}
