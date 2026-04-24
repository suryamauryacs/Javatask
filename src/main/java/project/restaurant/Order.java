package project.restaurant;

import java.util.List;

public class Order {

    String orderId;
    List<MenuItem> items;
    String orderTime;
    String orderDate;

    Order(String orderId, List<MenuItem> items, String orderTime, String orderDate){
        this.orderId = orderId;
        this.items = items;
        this.orderTime = orderTime;
        this.orderDate = orderDate;
    }

    double getTotalAmount(){
        return items.stream().mapToDouble(item -> item.price).sum();
    }
}
