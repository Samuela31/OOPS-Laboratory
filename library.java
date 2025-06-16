import java.util.*;

class BookNotFoundException extends Exception {
    public BookNotFoundException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}

class library {
    static void bookStatus(String status) throws BookNotFoundException {
        if (status.equals("no")) {
            throw new BookNotFoundException("Book not available");
        } else if (status.equals("yes")) {
            System.out.println("Book available");
        }
    }

    public static void main(String args[]) {
        String title;
        String[] book = { "DBMS", "JAVA", "DSA", "PCS" };
        String[] status = { "yes", "no", "yes", "no" };
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        title = sc.nextLine();
        
        boolean bookFound = false;

        for (i = 0; i < book.length; i++) {
            if (book[i].equals(title)) {
                try {
                  bookStatus(status[i]);
                } catch (BookNotFoundException ex) {
                    System.out.println("Exception occurred: " + ex);
                }
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book not found");
        }
    }
}
