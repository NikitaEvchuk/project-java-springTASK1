package FirstRestApiSpring.product.service;

import org.springframework.stereotype.Service;
import FirstRestApiSpring.product.api.request.ProductRequest;
import FirstRestApiSpring.product.api.response.ProductResponse;
import FirstRestApiSpring.product.domain.Product;
import FirstRestApiSpring.product.repository.ProductRepository;
import FirstRestApiSpring.product.support.ProductMapper;

import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new FirstRestApiSpring.product.support.exception.ProductNotFoundException(id));
        return productMapper.toProductResponse(product);
    }

    public FirstRestApiSpring.product.api.response.ProductResponse update(Long id, FirstRestApiSpring.product.api.request.UpdateProductRequest updateProductRequest) {
        Product product = productRepository.findById(id).orElseThrow(() -> new FirstRestApiSpring.product.support.exception.ProductNotFoundException(id));
        productRepository.save(productMapper.toProduct(product, updateProductRequest));
        return productMapper.toProductResponse(product);
    }
    public java.util.List<FirstRestApiSpring.product.api.response.ProductResponse> findAll() {
        return productRepository.findAll().stream().map(productMapper::toProductResponse).collect(Collectors.toList());
    }

    public void delete(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new FirstRestApiSpring.product.support.exception.ProductNotFoundException(id));
        productRepository.deleteById(product.getId());
    }
}