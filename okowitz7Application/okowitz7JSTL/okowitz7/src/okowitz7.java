public class okowitz7 {

    public okowitz7() {
    }

    String custName;
    int cakes_sold;
    double delivery_fee;
    double total; 
  
    public void setCustName(String custName) {
    try
    {
        this.custName = custName;
    }
        catch (Exception e)
            {
            }
    }

    public String getCustName() {
        return custName;
    }

    public void setCakes_sold(int cakes_sold) {
    try
    {
        this.cakes_sold = cakes_sold;
    }
        catch (Exception e)
            {
            }
    }

    public int getCakes_sold() {
        return cakes_sold;
    }

    public void setDelivery_fee(double delivery_fee) {
        this.delivery_fee = delivery_fee;
    }

    public double getDelivery_fee() {
        return delivery_fee;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
    

    
    public double calcDeliveryFee(){
        
        return this.cakes_sold * 2;
     }

}
