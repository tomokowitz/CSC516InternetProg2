public class okowitz7 {

    String custname;
    int cakessold;

    double total; 

    public okowitz7() {
    }


    public void setCustname(String arg) 
    {
        custname = arg;
    }

    public String getCustname() 
    {
        return custname;
    }

    public void setCakessold(int arg) 
    {
        cakessold = arg;
    }

    public int getCakessold() 
    {
        return cakessold;
    }

//    public void setDelivery_fee(double delivery_fee) {
//        this.delivery_fee = delivery_fee;
//    }

    public double getDelivery_fee() {
        return this.cakessold * 2;
    }

    public void setTotal(double arg) {
        this.total = arg;
    }

    public double getTotal() {
        return this.cakessold * 14 ;
    }
}
