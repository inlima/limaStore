package il.com.limastore.service.impl;

import il.com.limastore.dao.ProductDao;
import il.com.limastore.model.Cart;
import il.com.limastore.model.CartItem;
import il.com.limastore.model.Product;
import il.com.limastore.service.CartService;
import il.com.limastore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductDao productDao;

    @Autowired
    private CartService cartService;

    public Product getProductById (String productId) {
        return productDao.getProductById(productId);
    }

    public List<Product> getProductList () {
        return productDao.getProductList();
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    public void editProduct(Product product) {
        productDao.editProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {

    }

    public void deleteProduct(String product) {
        productDao.deleteProduct(product);
    }


}
