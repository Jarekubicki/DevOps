package tematyka6.excercises.Task6_12;

import java.util.Objects;

/**
 * Created by BIURO22 on 2023-02-02
 */
public class Order {

    private String id;
    private String name;
    private double price;

    public Order(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Order (id: " + id +
                ", product: " + name +
                ", price=" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o == null || getClass() != o.getClass())) {
            return false;
        }

        Order order = (Order) o;
        return order.price == price &&  order.name.equals(name) && order.id.equals(id);
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = result * 31 + id.hashCode();
        result = result * 31 + name.hashCode();
        result = result * 31 + (int) price;
        return result;
    }
}
