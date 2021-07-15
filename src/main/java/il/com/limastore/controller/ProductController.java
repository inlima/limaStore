package il.com.limastore.controller;

import il.com.limastore.dao.ProductDao;
import il.com.limastore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

// This controller is in charge of handling any events that control products
@Controller
public class ProductController
{
    // productDao accesses the database of products
    @Autowired
    private ProductDao productDao;

    // This method shows the details of a specific product
    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException
    {
        // get the product the user wants to look at
        Product product = productDao.getProductById(productId);

        // adds the product to the model
        model.addAttribute(product);

        // view product specific page
        return "viewProduct";
    }

}
