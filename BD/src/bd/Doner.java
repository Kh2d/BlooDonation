
package BD;


public class Doner extends TheParties
{
    private static Doner[] DonerArray = new Doner[50];
    private static int count=0; 
    public Doner(String username, String password, String Fname, String Mname, String Lname, int id, int phone, String area  ,int age, int year, int month, int days, String type, String BT) {
        super(username, password, Fname, Mname, Lname, id, phone, area ,age , year, month, days, "Doner", BT);
    }

    
     public void add(Doner h)
    {
        if(count>(DonerArray.length-1))
        DonerArray[count]=h;
        count++;
    }
    
    public void del(String username , int id1)
    {
        if(count ==0)
        {
            System.out.println("There is no Doners");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                if(DonerArray[i].getUsername().equals(username))
                 if(DonerArray[i].getId()==id1)
                {
                    DonerArray[i]=null;
                    while(i<(count-1))
                    {
                        DonerArray[i]=DonerArray[i+1];
                        i++;
                    }
                    DonerArray[i]=null;
                    count--;
                }
            }
            
        }
    }
    
    public void getShowMyRequest()
    {
        boolean p = false;
        if(Appointment.getRTR().length==0)
        {
            System.out.println("There's no thing");
        }
        else
        {
            for(int i=0;i<Appointment.getRTR().length;i++)
            {
                if(Appointment.getRTR()[i].getDoner().getId()==this.getId())
                if(Appointment.getRTR()[i].isFromDoner() && !(Appointment.getRTR()[i].isFromReceiver()))
                {
                    p=true;
                    System.out.println(Appointment.getRTR()[i].toString());
                }
            }
            if(!p)System.out.println("No Requset");
        }
    }
    
    public void getShowInvite()
    {
        boolean p = false;
        if(Appointment.getRTD().length==0)
        {
            System.out.println("");
        }
        else
        {
            for(int i=0;i<Appointment.getRTD().length;i++)
            {
                if(Appointment.getRTD()[i].getDoner().getId()==this.getId())
                if(!(Appointment.getRTD()[i].isFromDoner()) && Appointment.getRTR()[i].isFromReceiver())
                {
                    p=true;
                    System.out.println(Appointment.getRTD()[i].toString());
                }
            }
             if(!p)System.out.println("No Invite to you");
        }
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
