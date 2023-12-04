import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepo {
    private List<Product> productList = new ArrayList<>();


    public ProductRepo() {
        productList = new ArrayList<>();
    productList.add(new Product("handy", "Apple", 999.99));
    productList.add(new Product("Laptop", "Microsoft", 1560.55 ));
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Optional<Product>  getOneProduct(String name) {
        for (Product product:productList) {

            if (product.name().equalsIgnoreCase(name)) {
            return Optional.of(product);
            }


        }
        return Optional.empty();
    }
}
