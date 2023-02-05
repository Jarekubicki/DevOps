package tematyka6.excercises.Task6_12;

import java.util.HashMap;

/**
 * Created by BIURO22 on 2023-02-02
 */
public class Manager {


    private HashMap<Order, Integer> ordersStock = new HashMap<>();

    public boolean checkIfOrderOnList(HashMap<Order, Integer> orderList, Order orderToCheck) {
        return orderList.containsKey(orderToCheck);
    }

    public void addOrderToList(HashMap<Order, Integer> ordersStock, Order orderToAdd) {
        if(!checkIfOrderOnList(ordersStock, orderToAdd)) {
            ordersStock.put(orderToAdd, 1);
        }
        else {
            ordersStock.put(orderToAdd, ordersStock.get(orderToAdd) + 1);
        }
    }

    public void removeOrderFromList(HashMap<Order, Integer> orderList, Order orderToRemove) {
        if(!checkIfOrderOnList(orderList, orderToRemove)) {
            System.out.println("No such order on the list.");
        }
        else if(checkIfOrderOnList(orderList, orderToRemove) && orderList.get(orderToRemove) == 1) {
            orderList.remove(orderToRemove);
        }
        else {
            orderList.put(orderToRemove, orderList.get(orderToRemove) -1);
        }
    }





    public HashMap<Order, Integer> getOrdersStock() {
        return ordersStock;
    }

    public void setOrdersStock(HashMap<Order, Integer> ordersStock) {
        this.ordersStock = ordersStock;
    }

    public void setOrdersStock() {
        this.ordersStock = ordersStock;
    }


}
