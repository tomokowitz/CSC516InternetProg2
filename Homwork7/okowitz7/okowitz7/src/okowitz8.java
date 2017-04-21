import java.util.ArrayList;

public class okowitz8 {


    ArrayList allOrders;
    okowitz7 order;
    int orderCount;
    
    public okowitz8() {
    }

    public void setAllOrders(ArrayList allOrders) {
        this.allOrders = allOrders;
    }

    public ArrayList getAll() {
        return allOrders;
    }

    public void setOrder(okowitz7 order) {
        this.order = order;
        this.allOrders.add(order);
    }

    public okowitz7 getOrder() {
        return order;
    }
    public int getOrderCount() {
        return allOrders.size();
    }
}
