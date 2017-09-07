package guru.springframework.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by andreaskaitis on 04/09/2017.
 * spring5-recipe-app
 */
@Entity
@Data
public class Notes implements Serializable{

    private static final long serialVersionUID = 5446553411498312649L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
