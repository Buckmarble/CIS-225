/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Forrest Marble
 * @version 02012015 lab 3
 */
class BookInfo
{
    // The fields.
    private String authorFirst;
    private String authorLast;
    private String title;
    private int pages;
    private String isbnNumber;
    private String isbn;
    private int pubDate;
    private DisplayDetails firstName;
    private DisplayDetails lastName;
    private DisplayDetails dispBookTitle;
    private DisplayDetails pageCount;
    private DisplayDetails publishDate;
    
    public BookInfo()
    {
        authorFirst = "";
        firstName = new DisplayDetails(authorFirst);
        lastName = new DisplayDetails(authorLast);
        isbnNum = new DisplayDetails(isbnNumber);        
        dispBookTitle = new DisplayDetails(title);
        publishDate = new DisplayDetails(pubDate);        
        pageCount = new DisplayDetails(pages);
    }
    
    public BookInfo(String firstName, String lastName, String isbnNum, String dispBookTitle, int publishDate, int pageCount)
    {
        firstName = new DisplayDetails(authorFirst);
        lastName = new DisplayDetails(authorLast);
        isbnNum = new DisplayDetails(isbnNumber);        
        dispBookTitle = new DisplayDetails(title);
        publishDate = new DisplayDetails(pubDate);        
        pageCount = new DisplayDetails(pages);
    }
        
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public String getAuthorFirst()
    {
        return authorFirst;
    }
    
    public String getAuthorLast()
    {
        return authorLast;
    }    
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getIsbnNumber()
    {
        return isbnNumber;
    }
    
    public void setIsbnNumber(String isbn)
    {
        this.isbn = isbn;
        if (isbn.length()>= 3) {
            isnNumber = isbn;
        } else {
            System.out.println("********isbn number must be at least 3 digits********");
        }
    }
    
    public void setPubDate(String pubDate)
    {
        this.pubDate = pubDate;
    }
    
    public int getpubDate()
    {
        return pubDate;
    }
    
}
