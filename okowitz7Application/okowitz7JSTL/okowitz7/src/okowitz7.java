public class okowitz7 {
    String name;
    int cakes_sold;
    double delivery_fee;
    double total; 


    public okowitz7() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCakes_sold(int cakes_sold) {
        this.cakes_sold = cakes_sold;
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
    
    private double calDelivertyFee(int cakes_sold){
        
        return cakes_sold * 2;
    }
}
