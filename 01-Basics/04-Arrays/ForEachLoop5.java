// Create an array of 3 Book Objects
// Use For Each loop to print each book titles
// Calculate and print the average book price.

public class ForEachLoop5 {
    public static void main(String[] args){
        Book[] books = new Book[] {new Book(), new Book(), new Book()};
        books[0].bookName = "Head First Java";
        books[0].bookPrice = 150;
        books[1].bookName = "Body Second Java";
        books[1].bookPrice = 300;
        books[2].bookName = "Leg Last Java";
        books[2].bookPrice = 450;

        System.out.print("The books are: ");
        for(Book book : books){
            System.out.print(book.bookName + ", ");
        }
        System.out.println("\b\b");

        double sum = 0;
        for(Book book : books){
            sum += book.bookPrice;
        }
        System.out.print("The average book price is: " + sum/3);
    }
}

class Book{
    String bookName;
    double bookPrice;
}
