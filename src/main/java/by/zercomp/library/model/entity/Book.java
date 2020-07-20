package by.zercomp.library.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    private int id;
    private String title;
    private List<String> authors;
    private String publisher;

    public Book(int id, String title, List<String> authors, String publisher) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
    }

    public Book(String title, List<String> authors, String publisher) {
        //let iud be 0 for CommandPattern
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

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
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
        final List<String> otherAuthors = other.getAuthors();
        final int length = otherAuthors.size();
        if (length != this.authors.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!this.authors.get(i).equals(otherAuthors.get(i))) {
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
        int length = authors.size();
        final String comma = ", ";
        for (int i = 0; i < length; i++) {
            builder.append(authors.get(i));
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
