import java.util.ArrayList;

public class okowitz8 {


    ArrayList allOrders = new ArrayList();

    
    public okowitz8() {
    }

    public void setAllOrders(ArrayList allOrders) {
    
        this.allOrders = allOrders;
    }
        

    public ArrayList getAll() {
        return allOrders;
    }

    /**
     * @param order
     */
    public void setOrder(okowitz7 order) {

        this.allOrders.add(order);
    }

   
    public int getOrderCount() {
        return allOrders.size();
    }
}
