import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ShopService {

    ProductRepo repo = new ProductRepo();

    OrderListRepo orderRepo = new OrderListRepo();
    public Order createOrder(List<String> names) {
    List<Product> products = new ArrayList<>();



        for (String name: names) {
            Optional <Product> optionalProduct = repo.getOneProduct(name);
            if (optionalProduct.isPresent()) {
                products.add(optionalProduct.get());
            }

            else {
                System.out.println("Dieses Produkt ist nicht vorhanden.");
            }
        }
        System.out.println(products);

        Order newOrder = new Order(products, "1A");
        orderRepo.addOrder(newOrder);

        //1. alle Produkte anhand des Namens aus em produktRepo laden und in eine Liste speichern.
        //2.in Objekt der Klasse Order erstellen bestellnummer erstellen, produkte zuweisen
        //3. Order Objekt in OrderListRepo Speichern.
return newOrder;
    }

}
