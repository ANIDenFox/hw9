public class Lib {
    Book[] books ;
    int len;

    Lib(){
        books = new Book[10];
    }


    public void add(Book book){
        books[len] = book;
        len++;
    }
    public void remove(String bookName) {
        for (int i = 0; i < len; i++) {
            if (bookName.equals(books[i].title)) {
                for (int j = i; j < len - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[len - 1] = null;
                len--;
                break;
            }
        }
        printAllBooks();
    }

    public void printAllBooks() {
        System.out.println("Книжки в бібліотеці:");
        for (int i = 0; i < len; i++) {
            System.out.print(i + 1 + " ");
            books[i].print();
        }
    }
}