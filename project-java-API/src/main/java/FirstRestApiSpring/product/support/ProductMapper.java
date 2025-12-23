package FirstRestApiSpring.product.support;

import org.springframework.stereotype.Component;
import FirstRestApiSpring.product.api.request.ProductRequest;
import FirstRestApiSpring.product.api.response.ProductResponse;
import FirstRestApiSpring.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }

    public FirstRestApiSpring.product.domain.Product toProduct(FirstRestApiSpring.product.domain.Product product, FirstRestApiSpring.product.api.request.UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }
}