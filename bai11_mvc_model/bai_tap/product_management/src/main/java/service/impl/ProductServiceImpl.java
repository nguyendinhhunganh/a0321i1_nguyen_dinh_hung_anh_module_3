package service.impl;

import entity.Product;
import repository.ProductRepository;
import repository.impl.ProductRepositoryImpl;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void updateProduct(Integer id, String name, String price, String status, String producer) {
        if (findById(id) == null) {
            System.out.println("id khong ton tai");
            return;
        }
        if (name.equals("")) {
            System.out.println("Name khong duoc de trong");
            return;
        }
        if (price.equals("")) {
            System.out.println("Price khong duoc de trong");
            return;
        }
        if (status.equals("")) {
            System.out.println("Status khong duoc de trong");
            return;
        }
        if (producer.equals("")) {
            System.out.println("Producer khong duoc de trong");
            return;
        }
        productRepository.updateProduct(id, name, price, status, producer);
    }

    @Override
    public void remove(Integer idRemove) {
        if (findById(idRemove) == null) {
            System.out.println("id khong ton tai");
            return;
        }
        productRepository.remove(idRemove);
    }

    @Override
    public void createProduct(Integer idCreate, String nameCreate, String priceCreate, String statusCreate, String producerCreate) {
        if (findById(idCreate) != null) {
            System.out.println("id da ton tai" );
            return;
        }
        productRepository.createProduct(idCreate,nameCreate,priceCreate,statusCreate,producerCreate);
    }
}
