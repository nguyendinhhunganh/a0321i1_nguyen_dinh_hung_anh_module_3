package service;

import entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(Integer id);

    void updateProduct(Integer id, String name, String price, String status, String producer);

    void remove(Integer idRemove);

    void createProduct(Integer idCreate, String nameCreate, String priceCreate, String statusCreate, String producerCreate);
}
