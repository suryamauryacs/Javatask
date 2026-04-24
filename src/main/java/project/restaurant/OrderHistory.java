//package project.restaurant;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//
//public class OrderHistory {
//    /**
//     * Manages all restaurant orders and provides analytical methods.
//     */
//
//    ArrayList<Order> orders = new ArrayList<>();
//
//    OrderHistory(){
//
//    }
//
//    void addOrder(Order order){
//        orders.add(order);
//    }
//
//    int getTotalOrders(){
//        return orders.size();
//    }
//
//
//    double getTotalRevenue(){
//        // Returns total revenue from all orders.
//        return orders.stream().mapToDouble(order -> order.getTotalAmount()).sum();
//    }
//
//    double getAevageOrderValue(){
//        //REturn the average value of all orders.
//        // Bug: This method has a bug - fix it !
//        if(orders.isEmpty())
//            return 0.0;
//        return getTotalRevenue() / getTotalOrders();
//    }
//
//    int getOrderCountByCategory(String category){
//        return (int) orders.stream()
//                .filter(order -> order.items.stream()
//                        .anyMatch(item -> item.category.equals(category)))
//                .count();
//    }
//
//    public Object[] getPeakHour() {
//        //write your code here to sovle this problme
////        if(orders.isEmpty())
////            return null;
////
////        Map<Integer, Integer> hourCount = new HashMap<>();
////
////        for (Order order : orders) {
////            String time = order.orderTime; // "HH:MM"
////            int hour = Integer.parseInt(time.split(":")[0]);
////
////            hourCount.put(hour, hourCount.getOrDefault(hour, 0) + 1);
////        }
////
////        int peakHour = -1;
////        int maxCount = 0;
////
////        for (Map.Entry<Integer, Integer> entry : hourCount.entrySet()) {
////            if (entry.getValue() > maxCount) {
////                peakHour = entry.getKey();
////                maxCount = entry.getValue();
////            }
////        }
////
////        return new Object[]{peakHour, maxCount};
//
//        int ordersByHours[] = new int[24];
//        String orderTime = "";
//        if (orders.size() == 0)
//            return null;
//        for (Order o : orders) {
//            orderTime = o.orderTime;
//            orderTime = orderTime.split(":")[0];
//            ordersByHours[Integer.parseInt((orderTime))]++;
//        }
//
//        int highestOrder = 0;
//        int hour = 0;
//        for (int i = 0; i < ordersByHours.length; i++) {
//            if (ordersByHours[i] > highestOrder) {
//                highestOrder = ordersByHours[i];
//                hour = i;
//            }
//        }
//
////        Object peakHourOrder[] = new Object[2];
////        peakHourOrder[0] = hour;
////        peakHourOrder[1] = highestOrder;
////        System.out.println(peakHourOrder[0] + " : " + peakHourOrder[1]);
////
////        List a = orders.stream().map(o -> o.orderTime.split(":")[0]).toList().stream().sorted((v1, v2) -> v1.compareTo(v2)).toList();
////
////        System.out.println(a);
////        a.stream().collect(Collectors.groupingBy((v -> ())));
//
//
//    }
//    }
//
//
//
//}
