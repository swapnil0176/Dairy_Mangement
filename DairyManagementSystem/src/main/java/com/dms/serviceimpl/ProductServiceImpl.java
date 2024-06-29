package com.dms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dms.entities.Product;
import com.dms.exception.ResourceNotFoundException;
import com.dms.model.ProductDTO;
import com.dms.repository.ProductRepository;
import com.dms.service.ProductService;
import com.dms.utilities.ProductConverter;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductConverter productConverter;

	@Override
	public ProductDTO addProduct(ProductDTO productDTO) {

		// Convert ProductDTO to Product Entity
		final Product product = productConverter.convertToProduct(productDTO);

		// Save and convert to again convert to DTO
		return productConverter.convertToProductDTO(productRepository.save(product));
	}

	@Override
	public ProductDTO getProductById(int id) {

		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
		return productConverter.convertToProductDTO(product);
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		// Create list of Product DTO
		List<ProductDTO> products = new ArrayList<>();

		List<Product> list = productRepository.findAll();
		list.forEach(product -> products.add(productConverter.convertToProductDTO(product)));
		return products;
	}

	@Override
	public ProductDTO updateProduct(ProductDTO productDTO, int id) {
		Product product = productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));

		// Convert Product DTO to entity
		Product newProduct = productConverter.convertToProduct(productDTO);

		// set new values
		product.setName(newProduct.getName());
		product.setPrice(newProduct.getPrice());
		product.setStockQuantity(newProduct.getStockQuantity());
		product.setDescription(newProduct.getDescription());

		// After setting new values save the information and convert to dto and return
		return productConverter.convertToProductDTO(productRepository.save(product));
	}

	@Override
	public String deleteById(int id) {
		productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
		productRepository.deleteById(id);
		return "Product deleted successfully";
	}

}
