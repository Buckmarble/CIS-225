/**
 * Desk calculator calculates the price to make a desk
 * 
 * @Forrest Marble
 * @0.0.1
 */

public class DeskCalculator
{
    // instance variables - replace the example below with your own
    public int price;
    public int orderNum;
    public String name;
    public int length;
    public int width;
    public int woodType;
    public int drawerCount;
    public int minCharge;
    public int surfaceBaseSize;
    public int surfaceOverageCharge;
    public int mahoganyExtra;
    public int oakExtra;
    public int drawerCharge;

    /**
     * Constructor for objects of class DeskCalculator
     */
    public DeskCalculator()
    {
        // initialise instance variables
        minCharge = 200;
        surfaceBaseSize = 750;
        surfaceOverageCharge = 50;
        mahoganyExtra = 150;
        oakExtra = 125;
        drawerCharge = 30;
        price = 0;
    }

    public String setName(String name)
    {
        this.name = name;
        return name;
    }

    public int getOrderNum(int orderNum)
    {
       this.orderNum = orderNum;
       return orderNum;
    }
    
    public int setLength(int length)
    {
        this.length = length;
        return length;
    }
    
    public int setWidth(int width)
    {
        this.width = width;
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
        price = minCharge;
        
        if((length*width)>surfaceBaseSize) {
            price = minCharge + surfaceOverageCharge;}
        
        if (woodType == 1) {
            price = price; }
        else if (woodType == 2) {
            price = price + oakExtra; }
        else if (woodType == 3) {
            price = price + mahoganyExtra; }
        
        price = price + (drawerCount*drawerCharge);
        
    }
   
    public void displayPrice()
    {

        System.out.println("Total desk price is: " + price);
    }
        
}
