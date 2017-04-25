import java.util.ArrayList;

public class okowitz8 {


    ArrayList allOrders = new ArrayList();

    
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
<<<<<<< HEAD
    try
    {
        this.order = order;
=======
        
>>>>>>> origin/master
        this.allOrders.add(order);
    }catch (Exception e)
    {
    }
    }

   
    public int getOrderCount() {
        return allOrders.size();
    }
}
