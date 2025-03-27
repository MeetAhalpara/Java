import java.util.Scanner;

class Book{
    private String title;
    private String author;
    private int year_published;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear_published() {
        return year_published;
    }

    public void setYear_published(int year_published) {
        this.year_published = year_published;
    }
    Book(String title, String author, int year_published) {
        System.out.printf("%s is the book which author is %s, and published into %d.", title, author, year_published);
    }
}

public class bookCWP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title: ");
        String title = sc.nextLine();
        System.out.print("Enter the author: ");
        String author = sc.nextLine();
        System.out.print("Enter the year published: ");
        int year_published = sc.nextInt();
        Book book = new Book(title, author, year_published);
    }
}
