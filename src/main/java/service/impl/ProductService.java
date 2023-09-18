package service.impl;

import java.util.List;
import model.Product;

public interface ProductService {
  
//Our crud methods are going to placed
  
  //gonna get everyone!!! READ
  public List<Product> getAllProducts();
  
  //specific, looking by product ID, READ
  public Product getProductByID(Long id);
  
  //Post a product, CREATE
  public Product saveProduct(Product product);
  
  //Update a product, UPDATE
  public Product updateProduct(Product product, Long Id);
  
  //Delete a product, DELETE
  public void deleteProduct(Long Id);
    
}



