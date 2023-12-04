import java.util.List;

public class Main {
    public static void main(String[] args) {

        ShopService service = new ShopService();
        Order myOrder = service.createOrder(List.of("Handy", "Laptop", "PC"));

        System .out.println(myOrder);

    }

}
