package booking.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Book implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private Category category;
    private String date;
    private String language;
    private int isbn;
    private int nb_pages;
    private double price;
    private String publisher;

}
