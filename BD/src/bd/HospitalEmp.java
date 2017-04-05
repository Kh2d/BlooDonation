
package BD;


public abstract class  HospitalEmp extends User
{
    
    private Hospital h;
    
    public HospitalEmp(String username , String password , String Fname , String Mname , String Lname , int id , int phone , String area  ,int age, int year , int month , int days , String type , Hospital h)
    {
        super(  username , password ,   Fname ,   Mname ,   Lname ,   id ,   phone , area , age ,year , month ,days , type );
        this.h=h;
    }

    public Hospital getH() {
        return h;
    }

    public void setH(Hospital h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Hospital name =" + h;
    }
    
    
}
