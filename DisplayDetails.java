
/**
 * Write a description of class DisplayDetails here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayDetails
{
    private String authorFirst;
    private String authorLast;
    private String title;
    private int pages;
    private String isbnNumber;
    private int pubDate;
    private String nameFirst;
    private String nameLase;
    private String isbnNum;
    private String bookTitle;
    private int publishDate;
    private int pageCount;
    
    
    public DisplayDetails(String authorFirst, String authorLast, String isbnNumber, String title,
                          int pubDate, int pages)
    {
        nameFirst = authorFirst;
        nameLast = authorLast;
        isbnNum = isbnNumber;
        bookTitle = title;
        publishDate = pubDate;
        pageCount = pages;  
    }
    
    public int getFirst()
    {
        return nameFirst;
    }
    
    public int getLast()
    {
        return nameLast;
    }
    
    public int getIsbn()
    {
        return isbnNum;
    }
    
    public int getTitle()
    {
        return bookTitle;
    }
    
    public int getDate()
    {
        return publishDate;
    }
    
    public int getCount()
    {
        return pageCount;
    }    
    
    public void printDetails()
    {
        System.out.println(firstName + lastName);
        System.out.println(dispBookTitle);
        System.out.println(pageCount);
        System.out.println(publishDate);
        System.out.println(isbnNum);  
    }
}
