public class Room
{
	private int roomNumber;
	private int capacity;
	private boolean hasComputers;
	private String myString = "";
	private boolean availibility; 

	public Room(int roomNumber, int capacity, boolean hasComputers){
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.hasComputers = hasComputers;
		this.availibility = true; 
	}

	public void setRoomNumber(int roomNumber){this.roomNumber = roomNumber;}
	public int getRoomNumber(){return roomNumber;}

	public void setCapacity(int capacity){this.capacity = capacity;}
	public int getCapacity(){return capacity;}

	public void setHasComputers(boolean hasComputers){this.hasComputers = hasComputers;}
	public boolean getHasComputers(){return hasComputers;}

	public String toString(){
		myString = "\nRoom Number: "+roomNumber+"\nCapacity: "+capacity;
		myString += "\nHas Computers: "+hasComputers+"\nAvailability: "+availibility;
		return myString;
	}
}