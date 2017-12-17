import java.util.*;
public class StudentProfile
{
	private int id, phone, itemChecked;
	private String first, last, email, myString;
	private boolean hasCheckedItem;
	
	public void StudentProfile(){
		phone = 0;
		first = "";
		last = "";
		email = "";
		hasCheckedItem = false;
		itemChecked = 0;
	}

	public void StudentProfile(int phone, String first, String last, String email){
		this.phone = phone;
		this.first = first;
		this.last = last;
		this.email = email;
		hasCheckedItem = false;
		itemChecked = getItemChecked();
	}

	public void setPhone(int phone){this.phone = phone;}
	public int getPhone(){return phone;}

	public void setFirst(String first){this.first = first;}
	public String getFirst(){return first;}

	public void setLast(String last){this.last = last;}
	public String getLast(){return last;}

	public void setEmail(String email){this.email = email;}
	public String getEmail(){return email;}

	public void setHasCheckedItem(boolean bool){this.hasCheckedItem = bool;}
	public boolean getHasCheckedItem(){return hasCheckedItem;}

	public void setItemChecked(int isbn){itemChecked = isbn;}
	public int getItemChecked(){return itemChecked;}

	public String toString(){
		myString = "\nStudent ID: "+id+"\nPhone Number: "+phone+"\nFirst Name: "+first;
		myString += "\nLast Name: "+last+"\nEmail: "+email;
		myString += "\nHas Checked Item: "+hasCheckedItem+"\nISBN Checked Out:"+itemChecked;
		return myString;
	} 

}

