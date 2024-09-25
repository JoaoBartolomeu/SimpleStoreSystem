package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enum.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItemList = new ArrayList<OrderItem>();

    public Order() {}
    public Order(Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem ordemItem){
        orderItemList.add(ordemItem);
    }
    public void removeItem(OrderItem ordemItem){
        orderItemList.remove(ordemItem);
    }
    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public Double total(){
        Double total = 0.0d;
        for(OrderItem ordemItem : orderItemList){
            total += ordemItem.subTotal();
        }
        return total;
    }

    public String listtotal(){
        String obj = "";
        for (OrderItem ordemItem : orderItemList) {
            obj += ordemItem + "\n";
        }
        return  obj;
    }
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order Status: ").append(status).append("\n");
        sb.append(client).append("\n");
        sb.append("Order Items:\n");
        for (OrderItem item : orderItemList) {
            sb.append(item).append("\n");
        }
        sb.append("Total Price: ").append(total()).append("\n");
        return sb.toString();
    }
}
