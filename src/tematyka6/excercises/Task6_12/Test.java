package tematyka6.excercises.Task6_12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by BIURO22 on 2023-02-02
 */
public class Test {
    public static void main(String[] args) {

        Order order1 = new Order("psvm0144x", "Lenovo X14", 3499.99);
        Order order2 = new Order("ut5572n", "iPhoneXS", 4299.12);
        Order order3 = new Order("jd982u", "Siemens x2", 128.23);
        Order order4 = new Order("8836613", "Braun xj17", 299.99);
        Order order5 = new Order("ii33519", "Philips X65Ut", 1438.22);

        Manager manager = new Manager();

        manager.addOrderToList(manager.getOrdersStock(), order1);
        manager.addOrderToList(manager.getOrdersStock(), order2);
        manager.addOrderToList(manager.getOrdersStock(), order3);
        manager.addOrderToList(manager.getOrdersStock(), order4);
        manager.addOrderToList(manager.getOrdersStock(), order5);

        printOrdersList(manager.getOrdersStock());

        manager.addOrderToList(manager.getOrdersStock(), order3);
        printOrdersList(manager.getOrdersStock());

        manager.removeOrderFromList(manager.getOrdersStock(), order2);
        manager.removeOrderFromList(manager.getOrdersStock(), order3);
        printOrdersList(manager.getOrdersStock());

        System.out.println();


    }

    static void printOrdersList(HashMap<Order, Integer> orderList) {
        System.out.println(List.of(orderList));
    }

//    static void printOrdersList(HashMap<Order, Integer> orderList) {
//        for(Map.Entry<Order, Integer> o : orderList) {
//            System.out.println(o.getKey().toString() + " quantity: " + o.getValue() + ")");
//        }
//    }
}
