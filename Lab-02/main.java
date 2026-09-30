class Book{
   int bookId;
   String title;
   String author;
   double price;
   static int totalBooks=0;
   
   Book (int bookId, String title, String author, double price){
      this.bookId = bookId;
      this.title = title;
      this.author = author;
      this.price = price;
      
      totalBooks++;
   
   }
   
   void displayBookInfo(){
       
      System.out.println("Id: "+this.bookId);
      System.out.println("Title: "+this.title);
      System.out.println("Author: "+this.author);
      System.out.println("Price: "+this.price);
   }
   
   boolean search(int bookId){
      return this.bookId == bookId;
   }
   
   Book search(String title){
      if(this.title==title)
         return this;
      else
         return null;
   }
   
   Book costlierBook(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
   }
   
   static void displayTotalBooks() {
        System.out.println("Total Books Created: " + totalBooks);
    }
   
   
}


public class main {
    public static void main(String[] args) {


        Book b1 = new Book(1, "ABC", "XYZ", 1000);
        Book b2 = new Book(2, "DEF", "PQR", 2000);

      
        System.out.println("BOOK 1");
        b1.displayBookInfo();

        System.out.println("BOOK 2");
        b2.displayBookInfo();

        

        System.out.println("\nSearch by Book ID: 100");
        if (b1.search(100))
            System.out.println("Book ID 100 found.");
        else
            System.out.println("Book not found.");

        
        System.out.println("\nSearch by Title: DEF");
        Book b3 = b2.search("DEF");
        b3.displayBookInfo();
         

        
        Book costly = b1.costlierBook(b2);

        System.out.println("\nCostlier Book: ");
        costly.displayBookInfo();

        Book.displayTotalBooks();
    }
}