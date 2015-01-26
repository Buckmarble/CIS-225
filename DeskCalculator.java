/**
 * Desk calculator calculates the price to make a desk
 * 
 * @Forrest Marble
 * @0.0.1
 */

public class DeskCalculator
{
    // instance variables - replace the example below with your own
    private int price;
    private int orderNum;
    private String name;
    private int length;
    private int width;
    private int woodType;
    private int drawerCount;
    //private int minCharge;
    //private int surfaceBaseSize;
    //private int surfaceOverageCharge;
    //private int mahoganyExtra;
    //private int oakExtra;
    //private int drawerCharge;
    private final int MIN_CHARGE = 200;
    private final int SURFACE_BASE_SIZE = 750;
    private final int SURFACE_OVERAGE_CHARGE = 50;
    private final int MAHOGANY_EXTRA = 150;
    private final int OAK_EXTRA = 125;
    private final int DRAWER_CHARGE = 30;

    /**
     * Constructor for objects of class DeskCalculator
     */
    public DeskCalculator()
    {
        // initialise instance variables
        /**
        minCharge = 200;
        surfaceBaseSize = 750;
        surfaceOverageCharge = 50;
        mahoganyExtra = 150;
        oakExtra = 125;
        drawerCharge = 30;*/
        orderNum++;
        price = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }

    public int getOrderNum()
    {
       return orderNum;
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }    
    
    public int getWidth()
    {
        return width;
    }
    /**
    1-pine
    2-oak
    3-mahogany
    */
    public int setWoodType(int woodType) 
    { 
        this.woodType = woodType;
        return woodType;
    }
    
    public int setDrawerCount(int drawerCount)
    {
        this.drawerCount = drawerCount;
        return drawerCount;
    }
    
    public void calcPrice()
    {
        price = MIN_CHARGE;
        
        if((length*width)>SURFACE_BASE_SIZE) {
            price = MIN_CHARGE + SURFACE_OVERAGE_CHARGE;}
        
        if (woodType == 1) {
            price = price; }
        else if (woodType == 2) {
            price += OAK_EXTRA; }
        else { 
            price += MAHOGANY_EXTRA; }
        
        price += (drawerCount*DRAWER_CHARGE);
        
    }
   
    public void displayPrice()
    {

        System.out.println("Total desk price is: " + price);
    }
        
}
