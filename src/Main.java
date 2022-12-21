public class Main {
    public static void main(String[] args) {

        Author authorFirst = new Author("Joanne", "Rowling");
        Book bookFirst = new Book("Harry Potter and the Philosopher's Stone", authorFirst, 2000);
        System.out.println(bookFirst);

        Author authorSecond = new Author("Джеймс", "Боуэн");
        Book bookSecond = new Book("Уличный кот по имени Боб", authorSecond, 2013);
        System.out.println(bookSecond);

        bookFirst.setPublicationYear(1997);
        System.out.println(bookFirst);
    }
}