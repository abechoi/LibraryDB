import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class LibraryMenu{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		MyMethods m = new MyMethods();
		int choice1 = 0;
		int choice2 = 0;
		int myId, myISBN;

		PrintWriter pw;
		Book book;
		Room room;
		Movie movie;
		Periodical periodical;
		StudentProfile student;

		HashMap<Integer, Book> books = new HashMap<Integer, Book>();
		HashMap<Integer, Movie> movies = new HashMap<Integer, Movie>();
		HashMap<Integer, Periodical> periodicals = new HashMap<Integer, Periodical>();
		HashMap<Integer, Room> rooms = new HashMap<Integer, Room>();
		HashMap<Integer, StudentProfile> students = new HashMap<Integer, StudentProfile>();

		while(choice1 != 9){
			// PRINT MENU
			m.printMenu();
			choice1 = sc.nextInt();

			switch(choice1){
				case 1: m.printAddItem();
						choice2 = sc.nextInt();
						switch(choice2){

							case 1: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									book = m.addBook();
									books.put(myISBN, book); break;

							case 2: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									movie = m.addMovie();
									movies.put(myISBN, movie); break;

							case 3: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									book = m.addBook();
									books.put(myISBN, book); break;
						} break;

				case 2: m.printRemoveItem();
						choice2 = sc.nextInt();
						switch(choice2){
							case 1: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									books.remove(myISBN); break;
							case 2: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									movies.remove(myISBN); break;
							case 3: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									periodicals.remove(myISBN); break;
						} break;
						// ADD STUDENT
				case 3:	System.out.println("Enter Student ID: ");
						myId = sc.nextInt();
						student = m.addStudent();
				 		students.put(myId, student); break;
				 		// REMOVE STUDENT
				case 4: System.out.println("Enter Student ID: ");
						myId = sc.nextInt();
				 		students.remove(myId); break;
				 		// CHECK STATUS OF ITEM
				 		// TODO: AND BY WHOM
				case 5: m.printItemStatus();
						choice2 = sc.nextInt();
						switch(choice2){

							case 1: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									book = books.get(myISBN);
									System.out.println(book.getAvailable());
									break;

							case 2: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									movie = movies.get(myISBN);
									System.out.println(movie.getAvailable());
									break;

							case 3: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									periodical = periodicals.get(myISBN);
									System.out.println(periodical.getAvailable());
									break;
						} break;

						// CHECK OUT
				case 6: m.printCheckOut();
						choice2 = sc.nextInt();
						switch(choice2){

							case 1: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									book = books.get(myISBN);
									System.out.println("Enter Student ID");
									myId = sc.nextInt();
									student = students.get(myId);
									if(book.getAvailable() && !student.getHasCheckedItem()){
										book.setAvailable(false);
										student.setHasCheckedItem(true);
										student.setItemChecked(myISBN);
									}break;

							case 2: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									movie = movies.get(myISBN);
									System.out.println("Enter Student ID");
									myId = sc.nextInt();
									student = students.get(myId);
									if(movie.getAvailable() && !student.getHasCheckedItem()){
										movie.setAvailable(false);
										student.setHasCheckedItem(true);
										student.setItemChecked(myISBN);
									}break;

							case 3: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									periodical = periodicals.get(myISBN);
									System.out.println("Enter Student ID");
									myId = sc.nextInt();
									student = students.get(myId);
									if(periodical.getAvailable() && !student.getHasCheckedItem()){
										periodical.setAvailable(false);
										student.setHasCheckedItem(true);
										student.setItemChecked(myISBN);
									}break;
						} break;

						// RETURN ITEM
				case 7: m.printCheckOut();
						choice2 = sc.nextInt();
						switch(choice2){

							case 1: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									book = books.get(myISBN);
									System.out.println("Enter Student ID");
									myId = sc.nextInt();
									student = students.get(myId);
									book.setAvailable(true);
									student.setItemChecked(0);
									student.setHasCheckedItem(false);
									break;

							case 2: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									movie = movies.get(myISBN);
									System.out.println("Enter Student ID");
									myId = sc.nextInt();
									student = students.get(myId);
									movie.setAvailable(true);
									student.setItemChecked(0);
									student.setHasCheckedItem(false);
									break;

							case 3: System.out.println("Enter ISBN: ");
									myISBN = sc.nextInt();
									periodical = periodicals.get(myISBN);
									System.out.println("Enter Student ID");
									myId = sc.nextInt();
									student = students.get(myId);
									periodical.setAvailable(true);
									student.setItemChecked(0);
									student.setHasCheckedItem(false);
									break;
						} break;

						// LIST ALL ITEMS
				case 8: Set set = books.entrySet();
						Iterator iterator = set.iterator();
						while(iterator.hasNext()) {
						Map.Entry mentry = (Map.Entry)iterator.next();
						System.out.print("ISBN: "+ mentry.getKey());
						System.out.println(mentry.getValue());}

						set = movies.entrySet();
						iterator = set.iterator();
						while(iterator.hasNext()) {
						Map.Entry mentry = (Map.Entry)iterator.next();
						System.out.print("ISBN: "+ mentry.getKey());
						System.out.println(mentry.getValue());}

						set = periodicals.entrySet();
						iterator = set.iterator();
						while(iterator.hasNext()) {
						Map.Entry mentry = (Map.Entry)iterator.next();
						System.out.print("ISBN: "+ mentry.getKey());
						System.out.println(mentry.getValue());}
						
						set = students.entrySet();
						iterator = set.iterator();
						while(iterator.hasNext()) {
						Map.Entry mentry = (Map.Entry)iterator.next();
						System.out.print("ISBN: "+ mentry.getKey());
						System.out.println(mentry.getValue());}
						break;

			} // END SWITCH
		} // END WHILE
	} // END MAIN
} // END CLASS