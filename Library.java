import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Library{
    List<String> books;
    Library(){
        books=new ArrayList<>();
    }
    void addBook(String book){ //method to add book into books
        books.add(book);
        System.out.println(book+" has been added!!");
    }
    void issueBook(String book){ //method to issue a book if it present in books
        for(int i=0;i<books.size();i++){
            if(books.get(i).equals(book)){
                books.remove(book);
                System.out.println("Book has been issued!!");
                return ;
            }
        }
        System.out.println("This book does not exist!!");
    }
    void returnBook(String book){  // method to return a book
        books.add(book);
        System.out.println("Book has been returned!!");
    } 
    
    void showAvailableBooks(){  // method to show all Available books
        System.out.println("Available books are: ");
        for(int i=0;i<books.size();i++){
            System.out.println("* "+books.get(i));
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Library centralLibrary=new Library(); 
        char c='y';
        while(c=='y' || c=='Y'){
            System.out.println("\n1: To add the book\n2: To issue the books\n3: To return the book \n4: To show the avialable books\n");
	        System.out.print("Enter your choice: ");
	        int ch=sc.nextInt();
	        sc.nextLine(); //placed to solve an issue that i have faced earlier
	        switch(ch){
	            case 1: System.out.print("Enter the book name: ");
	                    String book=sc.nextLine();
	                    centralLibrary.addBook(book);
	                    break;
    	        case 2: System.out.print("Enter the book name: ");
	                    book=sc.nextLine();
	                    centralLibrary.issueBook(book);
	                    break;
    	        case 3: System.out.print("Enter the book name: ");
	                    book=sc.nextLine();
	                    centralLibrary.returnBook(book);
	                    break;
	            case 4: centralLibrary.showAvailableBooks();
	                    break;
	            default:System.out.print("Please enter the valid choice!! ");
	        
	        }
	        System.out.print("\nTo conitnue press y/Y ");
	        c=sc.nextLine().charAt(0);
        }
	}
}