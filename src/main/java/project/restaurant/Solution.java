//package project.restaurant;
//
//import org.junit.Assert;
//
//import java.awt.*;
//import java.util.Arrays;
//import java.util.List;
//
//
//
//public class Solution {
//        public static void main(String[] args) {
//            testOrder();
//        }
//        public static void testorderHistory(){
//            System.out.println("Running testOrderHistory");
//            OrderHistory history = new OrderHistory();
//            Assert.assertEquals(0, history.getTotalOrders());
//            Assert.assertEquals(0.0, history.getTotalRevenue(), 0.01);
//
//            MenuItem item1 = new MenuItem("M001", "Burger","Main Course", 10.00);
//            MenuItem item2 = new MenuItem("M002", "Fries", "Appetizer", 5.00);
//            MenuItem item3 = new MenuItem("M003", "Soda", "Beverage", 2.00);
//
//            Order order1 = new Order("001",Arrays.asList(item1,item2), "12:30", "2024-0-01");
//            Order order2 = new Order("O002", Arrays.asList(item3), "13:15", "2024-02-01");
//            Order order3 = new Order("O003", Arrays.asList(item1, item3), "14:00", "2024-02-01");
//            history.addOrder(order1);
//            history.addOrder(order2);
//            history.addOrder(order3);
//
//            Assert.assertEquals(3, history.getTotalOrders());
//            Assert.assertEquals(29.00, history.getTotalOrders(), 0.01);
//            Assert.assertEquals(9.67, history.getAevageOrderValue(), 0.01);
//            Assert.assertEquals(2, history.getOrderCountByCategory("Main Course"));
//        }
//        public static void testOrder(){
//            System.out.println("Running testOrder");
//            MenuItem item1 = new MenuItem("M001", "Burger", "Main Course", 12.99);
//            MenuItem item2 = new MenuItem("M002", "Fries", "Appetizer", 4.99);
//
//            List<MenuItem> items = Arrays.asList(item1, item2);
//            Order order = new Order("0001", items,"12:30", "2024-02-01");
//
//            Assert.assertEquals("0001",order.orderId);
//            Assert.assertEquals(17.98, order.getTotalAmount(), 0.01);
//        }
//
//    public static void testGetPeakHour() {
//        System.out.println("Running testGetPeakHour");
//        OrderHistory history = new OrderHistory();
//
//        Assert.assertNull(history.getPeakHour());
//
//        MenuItem item1 = new MenuItem("M001", "Item1", "Main Course", 10.00);
//
//        Order order1 = new Order("O001", Arrays.asList(item1), "12:30", "2024-02-01");
//        Order order2 = new Order("O002", Arrays.asList(item1), "13:15", "2024-02-01");
//        Order order3 = new Order("O003", Arrays.asList(item1), "12:45", "2024-02-01");
//        Order order4 = new Order("O004", Arrays.asList(item1), "18:20", "2024-02-01");
//        Order order5 = new Order("O005", Arrays.asList(item1), "12:10", "2024-02-01");
//
//        history.addOrder(order1);
//        history.addOrder(order2);
//        history.addOrder(order3);
//        history.addOrder(order4);
//        history.addOrder(order5);
//
//        Assert.assertArrayEquals(new Object[] {12, 3}, history.getPeakHour());
//    }
//
//}
