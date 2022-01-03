package library;

public class Book implements Comparable {
    private String id;
    private String name;
    private int prince;
    private String publisher;

    public Book() {
    	this.id = "NULL";
        this.name = "NULL";
        this.prince = -1;
        this.publisher = "NULL";
    }

    public Book(String id, String name, int prince, String publisher) {
        this.id = id;
        this.name = name;
        this.prince = prince;
        this.publisher = publisher;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrince(int prince) {
        this.prince = prince;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getPrince() {
        return this.prince;
    }
    public String getPublisher() {
        return this.publisher;
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.prince + " " + this.publisher;
    }

    public int compareTo(Object o) {
        if (!(o instanceof Book))
            throw new RuntimeException("≤ª «Book¿‡");
        Book p = (Book) o;
        return this.id.compareToIgnoreCase(p.getId());
    }
}
