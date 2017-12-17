import java.util.Scanner;

public class MyMethods{

	Scanner sc = new Scanner(System.in);
	Book book;
	Movie movie;
	Periodical periodical;
	StudentProfile student;

	String menu, addItem, promptISBN, promptID, removeItem, addStudent, removeStudent;
	String itemStatus, checkOut, returnItem, title, author, dateIssue, first, last;
	String email, checkOutItem;
	int choice, myISBN, id, bookLength, year, runtime, phone;

	public MyMethods(){}

	public void printMenu(){
		menu = "\n 1) Add an item";
		menu += "\n 2) Remove lost item";
		menu += "\n 3) Register a new student";
		menu += "\n 4) Unregister an old student";
		menu += "\n 5) Status of item";
		menu += "\n 6) Checkout an Item";
		menu += "\n 7) Return an Item";
		menu += "\n 8) Listing of Items";
		menu += "\n 9) Exit \n";
		System.out.println(menu);
	}
	public void printAddItem(){
		addItem = "\nWhat would you like to add?";
		addItem += "\n1. Book\n2. Movie\n3. Periodical\n";
		System.out.println(addItem);
	}
	public void printRemoveItem(){
		removeItem = "\n What would you like to remove?";
		removeItem += "\n1. Book\n2. Movie\n3. Periodical\n";
		System.out.println(removeItem);
	}
	public void printItemStatus(){
		itemStatus = "\n What type of item is this?";
		itemStatus += "\n1. Book\n2. Movie\n3. Periodical\n";
		System.out.println(itemStatus);
	}
	public void printCheckOut(){
		checkOutItem = "\n What type of item is this?";
		checkOutItem += "\n1. Book\n2. Movie\n3. Periodical\n";
		System.out.println(checkOutItem);
	}

	public void printPromptISBN(){promptISBN = "\nEnter the ISBN: ";}
	public void printPromptID(){promptID = "\nEnter student ID number: ";}

	public void setISBN(int myISBN){
		this.myISBN = myISBN;
	}
	public int getISBN(){
		return myISBN;
	}
	public void setID(int id){this.id = id;}
	public int getID(){return id;}

	public Book addBook(){
		
		myISBN = sc.nextInt();
		System.out.println("Enter title: ");
		title = sc.next();
		System.out.println("Enter author: ");
		author = sc.next();
		System.out.println("Enter booklength: ");
		bookLength = sc.nextInt();
		book = new Book(title, author, bookLength);
		return book;
	}
	public Movie addMovie(){
		System.out.println("Enter title: ");
		title = sc.next();
		System.out.println("Enter year: ");
		year = sc.nextInt();
		System.out.println("Enter runtime: ");
		runtime = sc.nextInt();
		movie = new Movie(title, year, runtime);
		return movie;
	}
	public Periodical addPeriodical(){
		System.out.println("Enter title: ");
		title = sc.next();
		System.out.println("Enter date issue: ");
		dateIssue = sc.next();
		System.out.println("Enter author: ");
		author = sc.next();
		
		periodical = new Periodical(title, dateIssue, author);
		return periodical;
	}
	public int removeItem(){
		System.out.println("Enter ISBN");
		myISBN = sc.nextInt();
		return myISBN;
	}
	public StudentProfile addStudent(){

		System.out.println("Enter phone number: ");
		phone = sc.nextInt();
		System.out.println("Enter first name: ");
		first = sc.next();
		System.out.println("Enter last name: ");
		last = sc.next();
		System.out.println("Enter email: ");
		email = sc.next();
		student = new StudentProfile();
		student.setPhone(phone);
		student.setFirst(first);
		student.setLast(last);
		student.setEmail(email);
		return student;
	}

	public void removeStudent(){
		System.out.println("Enter student ID");
		sc.nextInt();
	}

	public void checkOut(int isbn, int id){

		System.out.println("Enter ISBN");

	}

	public void returnItem(){
		System.out.println("Enter ISBN");
	}

}
