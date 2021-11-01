package repository.impl;

import entity.Product;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(101, "iphone X", "8.000.000", "đien thoai the he moi", "apple"));
        productList.add(new Product(102, "iphone 11", "10.000.000", "đien thoai the he moi", "apple"));
        productList.add(new Product(103, "iphone 11 pro", "14.000.000", "đien thoai the he moi", "apple"));
        productList.add(new Product(104, "iphone 11 pro max", "16.000.000", "đien thoai the he moi", "apple"));
        productList.add(new Product(105, "iphone 12", "18.000.000", "đien thoai the he moi", "apple"));
        productList.add(new Product(106, "iphone 12 pro", "20.000.000", "đien thoai the he moi", "apple"));
        productList.add(new Product(107, "iphone 12 pro max", "22.000.000", "đien thoai the he moi", "apple"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(Integer id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(Integer id, String name, String price, String status, String producer) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setId(id);
                product.setName(name);
                product.setPrice(price);
                product.setStatus(status);
                product.setProducer(producer);
            }
        }
    }

    @Override
    public void remove(Integer idRemove) {
        productList.remove(findById(idRemove));
    }

    @Override
    public void createProduct(Integer idCreate, String nameCreate, String priceCreate, String statusCreate, String producerCreate) {
        productList.add(new Product(idCreate, nameCreate, priceCreate, statusCreate, producerCreate));
    }
}
