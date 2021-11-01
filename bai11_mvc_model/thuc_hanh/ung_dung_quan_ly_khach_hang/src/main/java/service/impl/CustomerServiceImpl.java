package service.impl;

import entity.Customer;
import repository.CustomerRepository;
import repository.impl.CustomerRepositoryImpl;
import service.CustomerService;

import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override

    public Map<Integer, Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public void updateCustomer(Integer id, String name, String email, String address) {
        if (findById(id) == null) {
            System.out.println("ID khong ton tai");
            return;
        }
        if (name.equals("")) {
            System.out.println("Name khong duoc de trong");
            return;
        }
        if (email.equals("")) {
            System.out.println("Email khong duoc de trong");
            return;
        }
        if (address.equals("")) {
            System.out.println("Address khong duoc de trong");
            return;
        }
        customerRepository.updateCustomer(id,name,email,address);
    }

    @Override
    public void deleteCustomer(Integer key) {
        customerRepository.deleteCustomer(key);
    }

    @Override
    public void createCustomer(Integer idCreate, String nameCreate, String emailCreate, String addressCreate) {
        if (nameCreate.equals("")) {
            System.out.println("Name khong duoc de trong");
            return;
        }
        if (emailCreate.equals("")) {
            System.out.println("Email khong duoc de trong");
            return;
        }
        if (addressCreate.equals("")) {
            System.out.println("Address khong duoc de trong");
            return;
        }
        customerRepository.createCustomer(idCreate,nameCreate,emailCreate,addressCreate);
    }
}