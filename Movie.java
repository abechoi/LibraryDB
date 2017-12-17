public class Movie
{
	private String title; 
	private int year, runtime;
	private String myString = "";
	boolean available;

	public Movie(String title, int year, int runtime){
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.available = true;
	}

	public void setTitle(String title){this.title = title;}
	public String getTitle(){return title;}

    public void setYear(int year){this.year = year;}
    public int getYear(){return year;}

    public void setRuntime(int runtime){this.runtime = runtime;}
    public int getRuntime(){return runtime;}

    public void setAvailable(boolean available){this.available = available;}
    public boolean getAvailable(){return available;}

    public String toString(){
        myString = "\nTitle: "+title+"\nYear: "+year;
        myString += "\nRuntime: "+runtime+" minutes"+"\nAvailability: "+available;
        return myString;
    }
}