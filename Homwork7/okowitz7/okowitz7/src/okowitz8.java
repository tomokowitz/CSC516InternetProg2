import java.util.ArrayList;

public class okowitz8 {


    ArrayList allOrders;
    okowitz7 order;
    int orderCount;
    
    public okowitz8() {
    }

    public void setAllOrders(ArrayList allOrders) {
    try
    {
        this.allOrders = allOrders;
    }
        catch (Exception e)
            {
            }
    }

    public ArrayList getAll() {
        return allOrders;
    }

    /**
     * @param order
     */
    public void setOrder(okowitz7 order) {
    try
    {
        this.order = order;
        this.allOrders.add(order);
    }catch (Exception e)
    {
    }
    }

    public okowitz7 getOrder() {
        return order;
    }
    public int getOrderCount() {
        return allOrders.size();
    }
}
