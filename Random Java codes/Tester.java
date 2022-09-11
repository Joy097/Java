public class Tester {
    public static void main(String []args)
    {
        OnePlus sevenT = new OnePlus();
        sevenT.initialize(16.0,76.0,16,256.0,"855 Snap Dragon");
        System.out.println("Specification of OnePlus7T:");
        sevenT.printInfo();
    }
}
