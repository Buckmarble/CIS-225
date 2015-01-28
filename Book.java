/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private String ref;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNum, boolean courseTextCheck)
    {
        author = bookAuthor; // immutable because they can't be changed from outside
        title = bookTitle;   // immutable because they can't be changed from outside
        pages = pageNum;     // immutable because they can't be changed from outside
        refNumber = "";
        courseText = courseTextCheck;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void setRefNumber(String ref)
    {
        this.ref = ref;
        if (ref.length()>= 3) {
            refNumber = ref;
        } else {
            System.out.println("********Reference number must be at least 3 digits********");
        }
    }
    
    public void setBorrowed()
    {
        borrowed++;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printAuthor()
    {
        System.out.println("Author: " + author);
    }
    
    public void printTitle()
    {
        System.out.println("Author: " + title);
    }    

    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + pages);
        if (refNumber.length() > 0) {
            System.out.println("Reference Number: " + refNumber);
        } else {
            System.out.println("Referece: ZZZ");
        }
        System.out.println("Book Has Been Borrow: " + borrowed + "times");
    }
}
