import java.util.Objects;

public class Book {
    private String nameOfTheBook;
    private final Author author;
    private int publicationYear;

    public Book(String nameOfTheBook, Author author, int publicationYear) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getNameOfTheBook() {
        return this.nameOfTheBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setNameOfTheBook(String nameOfTheBook) {
        this.nameOfTheBook = nameOfTheBook;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + nameOfTheBook + ", Автор: " + author + ", Год издания: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && nameOfTheBook.equals(book.nameOfTheBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, author, publicationYear);
    }
}
