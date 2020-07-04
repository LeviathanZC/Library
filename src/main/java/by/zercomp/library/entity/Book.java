package by.zercomp.library.entity;

public class Book {

    private int id;
    private String title;
    private String[] authors;
    private String publisher;

    public Book(int id, String title, String[] authors, String publisher) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
    }

    @Override
    public int hashCode() {
        final int prime = 113;
        int result = id;
        for (String item : authors) {
            result += item.hashCode() * prime;
        }
        result += (title.hashCode() + publisher.hashCode()) * prime;
        return result;
    }

}
