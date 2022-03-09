class Payment
{
    public  void Gpay()
    {
        System.out.println("ACCOUNTS:" );
        System.out.println("1. Google pay");
    }
    public  void Paytm()
    {
        System.out.println("2. Paytm");
    }
}
class Bank extends Payment
{
    public void Gpay()
    {
        System.out.println("Google pay is Not good");
    }
    public  void Paytm()
    {
        System.out.println("paytm is Good");
    }
}
public class Amount {
    public static void main(String[] args)
    {
        Payment p=new Payment();
        Bank n=new Bank();
        p.Gpay();
        p.Paytm();
        n.Gpay();
        n.Paytm();
    }
}
