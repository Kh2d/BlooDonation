package BD;

import java.util.Date;



public class Donation 
{
   // private Doner[] DonerArray = new Doner [5];
   // private int ArrayCount=0;
    private Doner doner;
    private Receiver receiver;
    private int Donation_ID=1000;
    private Date DonationDateTime;
    private int DonerWeight;
    private boolean DonationState=false;
    
    private static Donation[] DonationArray = new Donation[100];
    private static int count=0;
    
     public Donation(Doner n1 , Receiver receiver , int DonerWeight , boolean state )
    {
        this.Donation_ID=Donation_ID; 
        this.doner=n1;
        this.receiver=receiver;
        this.DonerWeight=DonerWeight;
        this.DonationState=state;
        Donation_ID++;
    }
     
   /* public Donation(Doner n1 , Receiver receiver , int DonerWeight , boolean state )
    {
        this.DonerArray[ArrayCount]=n1;
        this.receiver=receiver;
        this.DonerWeight=DonerWeight;
        this.DonationState=state;
        ArrayCount++;
    }
    public Donation(Doner n1 , Doner n2, Receiver receiver , int DonerWeight , boolean state )
    {
        this.DonerArray[ArrayCount]=n1;
        ++ArrayCount;
        this.DonerArray[ArrayCount]=n2;
        ++ArrayCount;
        this.receiver=receiver;
        this.DonerWeight=DonerWeight;
        this.DonationState=state;
    }
    public Donation(Doner n1 , Doner n2 , Doner n3, Receiver receiver , int DonerWeight , boolean state )
    {
        this.DonerArray[ArrayCount]=n1;
        ++ArrayCount;
        this.DonerArray[ArrayCount]=n2;
        ++ArrayCount;
        this.DonerArray[ArrayCount]=n3;
        ++ArrayCount;
        this.receiver=receiver;
        this.DonerWeight=DonerWeight;
        this.DonationState=state;
    }

    public Doner[] getDonerArray() {
        return DonerArray;
    }

    public void AddDoner(Doner NewDoner) 
    {
        if(ArrayCount>DonerArray.length)
        {
            System.out.println("ArrayFull");
        }
        else
        {
            DonerArray[ArrayCount]=NewDoner;
            ArrayCount++;
        }
    }

    public void del(String username , int id1)
    {
        if(ArrayCount ==0)
        {
            System.out.println("There is no Doners");
        }
        else
        {
            for(int i=0;i<ArrayCount;i++)
            {
                if(DonerArray[i].getUsername().equals(username))
                 if(DonerArray[i].getId()==id1)
                {
                    DonerArray[i]=null;
                    while(i<(ArrayCount-1))
                    {
                        DonerArray[i]=DonerArray[i+1];
                        i++;
                    }
                    DonerArray[i]=null;
                    ArrayCount--;
                }
            }
            
        }
    }*/
    
    public Receiver getReceiver() {
        return receiver;
    }

    public Doner getDoner() {
        return doner;
    }

    public void setDoner(Doner doner) {
        this.doner = doner;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public int getDonation_ID() {
        return Donation_ID;
    }

    public void setDonation_ID(int Donation_ID) {
        this.Donation_ID = Donation_ID;
    }

    public Date getDonationDateTime() {
        return DonationDateTime;
    }

    public void setDonationDateTime(Date DonationDateTime) {
        this.DonationDateTime = DonationDateTime;
    }

    public int getDonerWeight() {
        return DonerWeight;
    }

    public void setDonerWeight(int DonerWeight) {
        this.DonerWeight = DonerWeight;
    }

    public boolean isDonationState() {
        return DonationState;
    }

    public void setDonationState(boolean DonationState) {
        this.DonationState = DonationState;
    }

    public static Donation[] getDonationArray() {
        return DonationArray;
    }

    public static void setDonationArray(Donation[] DonationArray) {
        Donation.DonationArray = DonationArray;
    }
    
    public void AddDonation(Donation NewDonation) 
    {
        if(count>DonationArray.length)
        {
            System.out.println("ArrayFull");
        }
        else
        {
            DonationArray[count]=NewDonation;
            count++;
        }
    }

    public void del(int DID)
    {
        if(count ==0)
        {
            System.out.println("There is no Doners");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                 if(DonationArray[i].getDonation_ID()==DID)
                {
                    DonationArray[i]=null;
                    while(i<(count-1))
                    {
                        DonationArray[i]=DonationArray[i+1];
                        i++;
                    }
                    DonationArray[i]=null;
                    count--;
                }
            }
            
        }
    }
    
    
}
