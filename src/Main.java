import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import Enum.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client("Joao", "joaosnpr@gmail.com", sdf.parse("24/05/2002"));
        Order order = new Order(sdf.parse("25/09/2024"), OrderStatus.PENDING_PAYMENT, client);
        Product product = new Product(1000.00, "TV");
        Product product2 = new Product(2000.00, "Mouse");
        OrderItem orderItem = new OrderItem(product.getPrice(), 2, product);
        OrderItem orderItem2 = new OrderItem(product2.getPrice(), 1, product2);

        order.addItem(orderItem);
        order.addItem(orderItem2);


        System.out.println(order);
        System.out.println(order.total());

    }
}