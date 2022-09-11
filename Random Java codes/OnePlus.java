public class OnePlus {
    public double fCamera;
    public double bCamera;
    public int RAM;
    public double ROM;
    public String processor;
    
    public void initialize(double fc, double bc, int ram,double rom,String pr)
    {
        fCamera =fc;
        bCamera = bc;
        RAM = ram;
        ROM = rom;
        processor = pr;
    }
    
    public void printInfo()
    {
        System.out.println("Front Camera : "+fCamera+" MP");
        System.out.println("Back Camera : "+bCamera+" MP");
        System.out.println("RAM : "+RAM+" GB");
        System.out.println("ROM : "+ROM+" GB");
        System.out.println("Processor : "+processor);         
    }}