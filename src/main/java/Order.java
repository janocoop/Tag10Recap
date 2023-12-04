import java.util.ArrayList;
import java.util.List;

public record Order(
        List<Product> orderProducts,
        String orderNumber) {


}
