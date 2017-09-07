package guru.springframework.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by andreaskaitis on 04/09/2017.
 * spring5-recipe-app
 */
@Entity
@Data
@EqualsAndHashCode(exclude = {"recipes"}, callSuper = false)
public class Category  implements Serializable{

    private static final long serialVersionUID = -6796941742644104603L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;


}
