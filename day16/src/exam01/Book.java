package exam01;



public class Book implements Comparable {
    private int isdn;
    private String title;
    private String author;
    private String publisher;

    public Book(String author, int isdn, String publisher, String title) {
        this.author = author;
        this.isdn = isdn;
        this.publisher = publisher;
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", isdn=" + isdn +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }


//    @Override
//    public int compareTo(Book o) {
//        return 0;
//    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
