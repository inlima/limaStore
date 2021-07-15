package il.com.limastore.dao;

import il.com.limastore.model.Product;

import java.util.List;

public interface ProductDao {
        void addProduct(Product product);
        Product getProductById(String id);
        List<Product> getAllProducts();
        List<Product> getProductList ();
        void editProduct(Product product);
        void deleteProduct(String id);
}
