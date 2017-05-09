package dwrproject3;

public class Student {
    private String userid;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private String dob;
    private String major;
    private String address;
    private String city;
    private String state;   
    
    public Student() {
    }
    
    public Student(String userid, String password, String firstName, String lastName, String phone, String dob,  
                    String major, String address, String city, String state)
    {
        this.userid = userid;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dob = dob;
        this.major = major;
        this.address = address;
        this.city = city;
        this.state = state;
    }


    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }        

    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getDob() {
        return dob;
    }
    
    public String getMajor() {
        return major;
    }

    public String getAddress() {
        return address;
    }
    
    public String getCity() {
        return city;
    }

     public String getState() {
        return state;
    }
    
    public void setUserid(String p) {
        userid = p;
    }
    
    public void setPassword(String p) {
        password = p;
    }
    
    public void setFirstName(String p) {
        firstName = p;
    }
    
    public void setLastName(String p) {
        lastName = p;
    }
    
    public void setDob(String p) {
        dob = p;
    }
    
    public void setPhone(String p) {
        phone = p;
    }
    
    public void setMajor(String p) {
        major = p;
    }
    
    public void setAddress(String p) {
        address = p;
    }   
    
    public void setCity(String p) {
        city = p;
    }
    
    public void setState(String p) {
        state = p;
    }    

}

