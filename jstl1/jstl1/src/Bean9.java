
public class Bean9 
{
  String name = "unknown";
  String orderDate = "unknown";
  String email = "unknown";
  int quantity1 = 0;
  int quantity2 = 0;
  int quantity3 = 0;
  boolean product1 = false;
  boolean product2 = false;
  boolean product3 = false;
  int deliveryCost = 0;
  String delivery = "Unknown";
  int jacketPrice = 50;
  int hatPrice = 10;
  int shirtPrice = 20;
  
  public Bean9()
  {
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setOrderDate(String orderDate)
  {
    this.orderDate = orderDate;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public void setQuantity1(int quantity1)
  {
    this.quantity1 = quantity1;
  }
  
  public void setQuantity2(int quantity2)
  {
    this.quantity2 = quantity2;
  }
  
  public void setQuantity3(int quantity3)
  {
    this.quantity3 = quantity3;
  }
  
  public void setProduct1(String product1)
  {
    if (product1 != null)
    {
      this.product1 = true;
    }
  }
  
  public void setProduct2(String product2)
  {
    if (product2 != null)
    {
      this.product2 = true;
    }
  }
  
  public void setProduct3(String product3)
  {
    if (product3 != null)
    {
      this.product3 = true;
    }
  }
  
  public void setDelivery(String delivery)
  {
    if (delivery.equals("ups"))
    {
      deliveryCost = 5;    
      this.delivery = "UPS";
    }
    else if (delivery.equals("firstclass"))
    {
      deliveryCost = 4;    
      this.delivery = "US Postal Service";
    } 
    else if (delivery.equals("fedex"))
    {
      deliveryCost = 8;    
      this.delivery = "Federal Express";
    }    
  }
   
  
  public String getName()
  {
    return name;
  }
  
  public String getOrderDate()
  {
    return orderDate;
  }
  
  public String getEmail()
  {
    return email;
  }
  
  public int getQuantity1()
  {
    if (product1)
      return quantity1;
    else
      return 0;
  }
  
  public int getQuantity2()
  {
    if (product2)
      return quantity2;
    else
      return 0;
  }
  
  public int getQuantity3()
  {
    if (product3)
      return quantity3;
    else
      return 0;
  }
  
  public String getDelivery()
  {
    return delivery;
  }
  
  public int getDeliveryCost()
  {
    return deliveryCost;
  }
  
  public int getTotalCost()
  {
    return jacketPrice * getQuantity1() 
          + hatPrice * getQuantity2() 
          + shirtPrice * getQuantity3()
          + deliveryCost;
  }
  
  public boolean getValidName()
  {
    if (name == null
        || name.equalsIgnoreCase("Unknown")
        || name.trim().equals(""))
      return false;
    else
      return true;
  }
}