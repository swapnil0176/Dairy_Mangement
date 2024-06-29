package com.dms.utilities;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.dms.entities.Product;
import com.dms.model.ProductDTO;

@Component
public class ProductConverter {

	// Convert Product Entity to Product DTO
	public ProductDTO convertToProductDTO(Product product) {
		ProductDTO productDTO = null;

		if (product != null) {
			productDTO = new ProductDTO();
			BeanUtils.copyProperties(product, productDTO);
		}

		return productDTO;
	}

	// Convert Product DTO to Product Entity
	public Product convertToProduct(ProductDTO productDTO) {

		Product product = null;
		if (productDTO != null) {
			product = new Product();
			BeanUtils.copyProperties(productDTO, product);
		}
		return product;
	}

}
