package okowitz11;

public class Cake {

    private String cakeid;
    private String cakename;
    private double cakeprice;

    public Cake() {
    
      
    }

    public Cake(String cakeid, String cakename, double cakeprice) {
        this.cakeid = cakeid;
        this.cakename = cakename;
        this.cakeprice = cakeprice;
    }
    public void setCakeid(String cakeid) {
        this.cakeid = cakeid;
    }

    public String getCakeid() {
        return cakeid;
    }

    public void setCakename(String cakename) {
        this.cakename = cakename;
    }

    public String getCakename() {
        return cakename;
    }

    public void setCakeprice(double cakeprice) {
        this.cakeprice = cakeprice;
    }

    public double getCakeprice() {
        return cakeprice;
    }
}
