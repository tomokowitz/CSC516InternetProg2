public class okowitz7 {

    String custName;
    int cakes_sold;
//    double delivery_fee;
    double total; 

    public okowitz7() {
    }


    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCakes_sold(int cakes_sold) {
        this.cakes_sold = cakes_sold;
    }

    public int getCakes_sold() {
        return cakes_sold;
    }

//    public void setDelivery_fee(double delivery_fee) {
//        this.delivery_fee = delivery_fee;
//    }

    public double getDelivery_fee() {
        return this.cakes_sold * 2;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return this.cakes_sold * 14 ;
    }
}