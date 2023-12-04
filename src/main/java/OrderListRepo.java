import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderListRepo {
    private List<Order> orderList = new ArrayList<>();


    public OrderListRepo() {
        orderList = new ArrayList<>();

    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
    }

    public List<Order> getAllOrders() {
        return orderList;
    }

    public Optional<Order>  getOneOrder(String orderNumber) {
        for (Order order:orderList) {

            if (order.orderNumber().equalsIgnoreCase(orderNumber)) {
                return Optional.of(order);
            }


        }
        return Optional.empty();
    }
}
