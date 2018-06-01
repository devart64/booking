package booking.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data @AllArgsConstructor
public class Category implements Serializable{
    @Id
    private Long id;
    private String code;
    private String desc;
}
