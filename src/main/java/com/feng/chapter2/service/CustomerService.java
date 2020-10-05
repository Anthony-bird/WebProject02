package com.feng.chapter2.service;

import com.feng.chapter2.helper.DatabaseHelper;
import com.feng.chapter2.model.Customer;

import java.sql.*;

import java.util.List;
import java.util.Map;


public class CustomerService {

    /*private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

//    private static final Logger LOGGER = null;

    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNAME = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc driver", e);
        }
    }*/


    /*
    * 获取客户列表
    * */
    public List<Customer> getCustomerList() {
       // Connection conn = DatabaseHelper.getConnection();
       // try {
//            List<Customer> customerList = new ArrayList<Customer>();
            String sql = "SELECT *FROM customer";
            return DatabaseHelper.queryEntityList(Customer.class,sql);
//            conn = DatabaseHelper.getConnection(); //<1>
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                Customer customer = new Customer();
//                customer.setId(rs.getLong("id"));
//                customer.setName(rs.getString("name"));
//                customer.setContact(rs.getString("contact"));
//                customer.setTelephone(rs.getString("telephone"));
//                customer.setEmail(rs.getString("email"));
//                customer.setRemark(rs.getString("remark"));
//                customerList.add(customer);
//            }
//            return customerList;
//        } catch (SQLException e) {
//            LOGGER.error("execute sql failure", e);
        //} finally {
        //    DatabaseHelper.closeConnection(conn); //<2>
      //  }

    }


        /*
         * 获取客户
         * */
        public Customer getCustomer ( long id){
            return null;
        }

        /*
         * 创建客户
         * */
        public boolean createCustomer (Map < String, Object > fieldMap){
            return DatabaseHelper.insertEntity(Customer.class,fieldMap);
        }
        /*
         * 更新客户
         * */
        public boolean updateCustomer ( long id, Map<String, Object > fieldMap){
            return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
        }
        /*
         * 删除客户
         * */
        public boolean deleteCustomer ( long id ){
            return DatabaseHelper.deleteEntity(Customer.class,id);
        }
    }
