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
}
