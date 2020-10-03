package com.feng.chapter2.test;

import com.feng.chapter2.model.Customer;
import com.feng.chapter2.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
单元测试
* */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService =new CustomerService();
    }

    @Before
    public void init(){
        //初始化数据库

    }
    @Test
    public void getCustomerListTest() throws Exception{
        long id =1;
        Customer customer=customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }
}
