package service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import model.Product;
import repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        // Retrieve and return a list of all products from the repository
        return productRepository.findAll();
    }

    @Override
    public Product getProductByID(Long id) {
        // Find a product by its ID and return it, or return null if not found
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.orElse(null);
    }

    @Override
    public Product saveProduct(Product product) {
        // Save a new product to the repository and return the saved product
        return productRepository.save(product);
    }
    
    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product updateProduct(Product product, Long id) {
        // Find an existing product by its ID, update its properties, and save it
        Optional<Product> existingProductOptional = productRepository.findById(id);
        
        if (existingProductOptional.isPresent()) {
            Product existingProduct = existingProductOptional.get();
            // Update the existing product with new values
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            
            return productRepository.save(existingProduct);
        }
        
        return null; // Product with the given ID not found
    }

}