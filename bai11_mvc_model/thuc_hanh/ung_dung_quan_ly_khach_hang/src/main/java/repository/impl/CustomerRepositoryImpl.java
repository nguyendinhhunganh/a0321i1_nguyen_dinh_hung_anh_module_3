package repository.impl;

import entity.Customer;
import repository.CustomerRepository;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    static Map<Integer, Customer> customers = new LinkedHashMap<>();

    static {
        customers.put(1, new Customer(101, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(102, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Customer(103, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Customer(104, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new Customer(105, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(106, "Rose", "rose@codegym.vn", "New York"));
    }

    @Override
    public Map<Integer, Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(Integer id) {
        for (Map.Entry<Integer, Customer> customerEntry : customers.entrySet()) {
            if (customerEntry.getValue().getId().equals(id)) {
                return customerEntry.getValue();
            }
        }
        return null;
    }

    @Override
    public void updateCustomer(Integer id, String name, String email, String address) {
        for (Map.Entry<Integer, Customer> customerMap : customers.entrySet()) {
            if (customerMap.getValue().getId().equals(id)) {
                customerMap.getValue().setId(id);
                customerMap.getValue().setName(name);
                customerMap.getValue().setAddress(address);
                customerMap.getValue().setEmail(email);
            }
        }

    }

    @Override
    public void deleteCustomer(Integer key) {
        customers.remove(key);
    }

    @Override
    public void createCustomer(Integer idCreate, String nameCreate, String emailCreate, String addressCreate) {
        customers.put(customers.size()+1,new Customer(idCreate,nameCreate,emailCreate,addressCreate));
    }

}