
package BD;

import java.awt.Image;
import java.util.Calendar;
import java.util.Date;


public abstract class User 
{
    
    private String username;
    private String password;
    private String Fname , Mname , Lname;
    private int id;
    private int phone;
    private String area;
    private Date dob;
    private int age;
    private Date DateC;
    private Image picture = null;
    private String type;
    public static User[] userarray = new User[50];
    private static int count=0;
    public User(String username , String password , String Fname , String Mname , String Lname , int id , int phone , String area  ,int age ,  int year , int month , int days , String type)
    {
        this.username=username;
        this.Fname=Fname;
        this.Mname=Mname;
        this.Lname=Lname;
        this.id=id;
        this.phone=phone;
        this.area=area;
        this.age=age;
        dob=new Date(year , month , days);
        DateC = new Date();
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String Mname) {
        this.Mname = Mname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getDob() {
        return dob;
    }

    public static User[] getUserarray() {
        return userarray;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDateC() {
        return DateC;
    }

    public void setDateC(Date DateC) {
        this.DateC = DateC;
    }

    @Override
    public String toString() {
        return  "username= " + username + "\npassword= " + password + "\nFname= " + Fname + "\nMname= " + Mname + "\nLname= " + Lname + "\nid= " + id + "\nphone= " + phone + "\narea= " + area + "\ndob =" + dob.toString() +"\n Age = " + this.getAge() + "\nDateC =" + DateC.toString()  + "\n Type  = "+ this.type;
    }
    
    
    
    
}