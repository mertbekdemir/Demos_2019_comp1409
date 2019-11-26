/**
 * class Book
 * 
 * @author (Rana Alsammarraie)
 * @version (2014.03.02)
 */
public class Book
{
    private String title;
    private String author;
    private int yearPublished;
    private double bookPriceInCAD;

    /**
     * Default constructor
     */
    public Book() {
       title = "";
       author = "";
       yearPublished = 0;
       bookPriceInCAD = 0;
    }

    /**
     * Book Constructor
     *
     * @param title A parameter to set title
     * @param yearPublished A parameter to set yearPublished
     * @param bookPriceInCAD A parameter to set bookPriceInCAD
     */
    public Book(String title,String author, int yearPublished, double bookPriceInCAD) {
        setTitle(title);
        setAuthor(author);
        setYearPublished(yearPublished);
        setBookPriceInCAD(bookPriceInCAD);
    }

    /**
     * Method getTitle
     *
     * @return The return is book title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method getAuthor
     *
     * @return The return is the book author
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Method getYearPublished
     *
     * @return The return of yearPublished value
     */
    public int getYearPublished() {
        return yearPublished;
    } 

    /**
     * Method setTitle
     *
     * @param title A parameter to set title
     */
    public void setTitle(String title) {
        if(title != null) {
            this.title = title;
        }
        else {
            this.title = "";
        }
    }

    /**
     * Method setAuthor
     *
     * @param author A parameter to set the author
     */
    public void setAuthor(String author){
        if(author != null){
            this.author = author;
        }
        else{
            this.author = "";
        }

    }

    /**
     * Method getBookPriceInCAD
     *
     * @return The return value of bookPriceInCAD
     */
    public double getBookPriceInCAD() {
        return bookPriceInCAD;
    }

    /**
     * Sets the book's year published
     * 
     * @param yearPublished book's year published
     */
    public void setYearPublished(int yearPublished) {
        if(yearPublished > 0) {
            this.yearPublished = yearPublished;
        }
        else {
            this.yearPublished = 0;
        }
    }

    /**
     * Sets the book price in CAD
     * 
     * @param bookPriceInCAD book price in CAD
     */
    public void setBookPriceInCAD(double bookPriceInCAD) {
        if(bookPriceInCAD >= 0) {
            this.bookPriceInCAD = bookPriceInCAD;
        }
    }

    /**
     * Displays the details of the book
     */
    public void displayDetails() {
        System.out.println("Title: " + getTitle() + " the author is: " + getAuthor()+ " year published was "+getYearPublished()+" and the price of the book is "+ getBookPriceInCAD()+ "\n");
      
    }
}
