public class Book
{
    //private fields
    private int bookLength;
    private String title;
    private String author;
    private boolean available;
    private String myString = "";

    //Constructor
    public Book(String title, String author, int bookLength) 
    {
        this.title = title;
        this.author = author;
        this.bookLength = bookLength;
        this.available = true;
    }

    public void setBookLength(int bookLength){this.bookLength = bookLength;}
    public int getBookLength(){return bookLength;}

    public void setTitle(String title){this.title = title;}
    public String getTitle(){return title;}

    public void setAuthor(String author){this.author = author;}
    public String getAuthor(){return author;}

    public void setAvailable(boolean available){this.available = available;}
    public boolean getAvailable(){return available;}

    @Override
    public String toString(){
        myString = "\nTitle: "+title+"\nAuthor: "+author;
        myString += "\nPages: "+bookLength+"\nAvailability: "+available;
        return myString;
    }
}