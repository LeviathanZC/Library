package by.zercomp.library.model.entity;

import java.util.UUID;

public class Book {

    private int id;
    private String title;
    private String[] authors;
    private String publisher;

    public Book(int id) {
        this(id, "");
    }

    public Book(int id, String title) {
        this(id, title, "");
    }

    public Book(int id, String[] authors) {
        this(id, "", authors);
    }

    public Book(int id, String title, String publisher) {
        this(id, title, new String[0], publisher);
    }

    public Book(int id, String title, String[] authors) {
        this(id, title, authors, "");
    }

    public Book(int id, String title, String[] authors, String publisher) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Book other = (Book) o;
        final String[] otherAuthors = other.getAuthors();
        final int length = otherAuthors.length;
        if (length != this.authors.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!this.authors[i].equals(otherAuthors[i])) {
                return false;
            }
        }
        return (this.title.equals(other.publisher)) &&
                (this.publisher.equals(other.getPublisher()));
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Book {");
        builder.append("\n\tid = ").append(id);
        builder.append(";\n\ttitle = ").append(title);
        builder.append(";\n\tauthors = [");
        int length = authors.length;
        final String comma = ", ";
        for (int i = 0; i < length; i++) {
            builder.append(authors[i]);
            if (i < length - 1) {
                builder.append(comma);
            }
        }
        builder.append("];\n\ttitle = ").append(title);
        builder.append(";\n\tpublisher = ").append(publisher);
        builder.append(";\n}");
        return builder.toString();
    }

}
