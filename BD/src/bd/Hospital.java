
package BD;

import java.util.Date;

public class Hospital 
{
    
    private String name;
    private String area;
    private String city , street ;
    private int phone;
    private Date start;
    private Date close;
    private Date DateC;
    private static Hospital[] hospitalArray = new Hospital[10];
    private static int count=0;
    public Hospital(String name , String area , String city , String street , int phone , int StartWorksHourse , int StartWorksMin , int CloseWorksHourse , int CloseWorksMin)
    {
        this.name=name;
        this.area=area;
        this.city=city;
        this.street=street;
        this.phone=phone;
        this.start=new Date (2017,04,04,StartWorksHourse , StartWorksMin);
        this.start=new Date (2018,04,04,CloseWorksHourse , CloseWorksMin);
        DateC=new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getClose() {
        return close;
    }

    public void setClose(Date close) {
        this.close = close;
    }

    public Date getDateC() {
        return DateC;
    }

    public void setDateC(Date DateC) {
        this.DateC = DateC;
    }
    
    public void add(Hospital h)
    {
        if(count>(hospitalArray.length-1))
        hospitalArray[count]=h;
        count++;
    }
    
    public void del(String name)
    {
        if(count ==0)
        {
            System.out.println("There is no hospital");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                if(hospitalArray[i].getName().equals(name))
                {
                    hospitalArray[i]=null;
                    while(i<(count-1))
                    {
                        hospitalArray[i]=hospitalArray[i+1];
                        i++;
                    }
                    hospitalArray[i]=null;
                    count--;
                }
            }
            
        }
    }

    
    public void getAppointment(String name1)
    {
        if(Appointment.getAppointment().length==0)
        {
            System.out.println("There is no appointments");
        }
        else
        {
            boolean a=false;
            for(int  i=0 ; i  < Appointment.getAppointment().length ; i++)
            {
                if( Appointment.getAppointment()[i].getHospital().getName().equals(name1))
                 if(Appointment.getAppointment()[i].isFromDoner() && Appointment.getAppointment()[i].isFromReceiver())
                {
                    a=true;
                    System.out.println(Appointment.getAppointment()[i].toString());
                }
            }
            
            if(!a)
            {
                System.out.println("There is no appointments in this hospital");
            }
        }
    }
    
    
    
    
    @Override
    public String toString() {
        return "Hospital{" + "name=" + name + ", area=" + area + ", city=" + city + ", street=" + street + ", phone=" + phone + ", start=" + start + ", close=" + close + ", DateC=" + DateC + '}';
    }
    
}
