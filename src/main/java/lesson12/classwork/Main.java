package lesson12.classwork;

import lesson12.classwork.dao.CustomerDao;
import lesson12.classwork.entity.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        for (Customer customer: customerDao.findAllCustomers()) {
            System.out.println(customer);
        }

        Customer customer = new Customer();
        customer.setName("NAME");
        customer.setSurname("NAME");
        customer.setEmail("sdf@NAME");
        customer.setPassword("geg");
        customer.setAge(4);

        customerDao.save(customer);
        System.out.println("After Save");
        for (Customer customer1: customerDao.findAllCustomers()) {
            System.out.println(customer1);
        }
    }
}
