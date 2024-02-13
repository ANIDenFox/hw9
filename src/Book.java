public class Book {
    String title;
    String author;
    int publicationYear;
    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void print() {
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Рік публікації: " + publicationYear);
        System.out.println("------------");
    }
}
