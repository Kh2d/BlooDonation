
package BD;


public class Nurse extends HospitalEmp
{
     private static Nurse[] NurseArray = new Nurse[10];
    private static int count=0;
    
    public Nurse (String username , String password , String Fname , String Mname , String Lname , int id , int phone , String area  , int age , int year , int month , int days , String type , Hospital h)
       {
           super(username , password ,   Fname ,   Mname , Lname , id ,phone , area , age ,year , month ,days , "Nurse" ,h);
       }

     public void add(Nurse h)
    {
        if(count>(NurseArray.length-1))
        NurseArray[count]=h;
        count++;
    }
    
    public void del(String username , int id1)
    {
        if(count ==0)
        {
            System.out.println("There is no Nurse");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                if(NurseArray[i].getUsername().equals(username))
                 if(NurseArray[i].getId()==id1)
                {
                    NurseArray[i]=null;
                    while(i<(count-1))
                    {
                        NurseArray[i]=NurseArray[i+1];
                        i++;
                    }
                    NurseArray[i]=null;
                    count--;
                }
            }
            
        }
    }
    
    @Override
    public String toString() 
    {
        return super.toString();
    }    
}
