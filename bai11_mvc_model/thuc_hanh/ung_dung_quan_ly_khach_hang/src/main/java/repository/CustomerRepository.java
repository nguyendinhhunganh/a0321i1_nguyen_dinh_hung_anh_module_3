package repository;

import entity.Customer;

import java.util.Map;

public interface CustomerRepository {
    Map<Integer, Customer> findAll();

    Customer findById(Integer id);

    void updateCustomer(Integer id, String name, String email, String address);

    void deleteCustomer(Integer key);

    void createCustomer(Integer idCreate, String nameCreate, String emailCreate, String addressCreate);
}