package FirstRestApiSpring.product.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import FirstRestApiSpring.product.api.request.ProductRequest;
import FirstRestApiSpring.product.api.response.ProductResponse;
import FirstRestApiSpring.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        ProductResponse productResponse = productService.create(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    @Operation(summary = "Find product by id")
    public ResponseEntity<ProductResponse> find(@PathVariable Long id) {
        ProductResponse productResponse = productService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
    @PutMapping("/{id}")
    @io.swagger.v3.oas.annotations.Operation(summary = "Update product")
    public ResponseEntity<FirstRestApiSpring.product.api.response.ProductResponse> update(@PathVariable Long id, @RequestBody FirstRestApiSpring.product.api.request.UpdateProductRequest updateProductRequest){
        FirstRestApiSpring.product.api.response.ProductResponse productResponse = productService.update(id, updateProductRequest);
        return ResponseEntity.status(HttpStatus.OK).body(productResponse);
    }
    @GetMapping
    @io.swagger.v3.oas.annotations.Operation(summary = "Find all products")
    public ResponseEntity<java.util.List<FirstRestApiSpring.product.api.response.ProductResponse>> findAll() {
        java.util.List<FirstRestApiSpring.product.api.response.ProductResponse> productResponses = productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(productResponses);
    }

    @DeleteMapping("/{id}")
    @io.swagger.v3.oas.annotations.Operation(summary = "Delete product")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
