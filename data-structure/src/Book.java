public class Book extends Object{
        private String title;
        private String author;
        private String isbn;

public String getTitle(){
 return title;
}       

public void setTitle(String title){
    this.title=title;
}

public String getAuthor(){
 return author;
}       

public void setAuthor(String author){
    this.author=author;
}

public String getIsbn(){
 return isbn;
}       

public void setIsbn(String isbn){
    this.isbn=isbn;
}

// Parameterized constructor initializing all instance variables
public Book(String title, String author,String isbn){
    this.author=author;
    this.title=title;
    this.isbn=isbn;
}

@Override
public String toString() {
    return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
}

}