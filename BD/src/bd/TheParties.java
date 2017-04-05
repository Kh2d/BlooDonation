
package BD;


public abstract class TheParties extends User
{
    
    private String BT;
    public TheParties(String username, String password, String Fname, String Mname, String Lname, int id, int phone, String area ,int age, int year, int month, int days, String type , String BT) {
        super(username, password, Fname, Mname, Lname, id, phone, area, age, year, month, days, type);
        this.BT=BT;
    }

    public String getBT() {
        return BT;
    }

    public void setBT(String BT) {
        this.BT = BT;
    }

    @Override
    public String toString() {
        return super.toString() + "\n BT= " + BT ;
    }
    
}
