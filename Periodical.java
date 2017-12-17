public class Periodical
{
	private String title, dateIssue, author;
	private boolean available; 

	//Constructor 
	public Periodical(String title, String dateIssue, String author)
	{
		this.title = title;
		this.dateIssue = dateIssue;
		this.author = author;
        this.available = true;
	}

    public void setTitle(String title)
    {
    	this.title = title;
    }
	public String getTitle()
	{
		return title;
	}
    public void setDateIssue(String dateIssue)
    {
    	this.dateIssue = dateIssue;
    }
    public String getDateIssue()
    {
    	return dateIssue;
    }

    public void setAuthor(String Author)
    {
    	this.author = Author;
    }
    public String getAuthor()
    {
    	return author;
    }
    public void setAvailable(boolean available){this.available = available;}
    public boolean getAvailable(){return available;}

    public String toString()
    {
        String  myString = "\nTitle: "+title+"\nYear: "+dateIssue+"\nAvailability: "+available;
        return myString;
    }  
}
