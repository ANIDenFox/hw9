public class Main {
    public static void main(String[] args) {


        Lib lib = new Lib();
        Book b = new Book("Гаррі Потер", "Роулінг", 2001);
        Book b2 = new Book("Lord of the Rings", "Джон Рональд Руэл Толкин", 1954);
        lib.add(b);
        lib.add(b2);
        lib.printAllBooks();
        lib.remove("Гаррі Потер");


        StudentManager studentManager = new StudentManager(10);
        Student student1 = new Student("Джон", 1, 20);
        Student student2 = new Student("Микола", 2, 22);
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addGrade(student1, "Математика", 85.0);
        studentManager.addGrade(student1, "Історія", 90.0);
        studentManager.addGrade(student2, "Математика", 78.0);
        studentManager.addGrade(student2, "Історія", 95.0);

        System.out.println("Середній бал " + student1.name + ": " + studentManager.getAverageGrade(student1));
        System.out.println("Середній бал " + student2.name + ": " + studentManager.getAverageGrade(student2));

    }
}