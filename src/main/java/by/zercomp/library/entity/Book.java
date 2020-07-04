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
