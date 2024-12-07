public class Book {

    private String title;
    private Author author;
    private Integer publishingYear;

    public Book(String title, Author author, Integer publishingYear) {
        this.publishingYear = publishingYear;
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }
}
