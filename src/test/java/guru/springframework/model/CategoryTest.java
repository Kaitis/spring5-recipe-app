package guru.springframework.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andreaskaitis on 05/09/2017.
 * spring5-recipe-app
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }


    @Test
    public void getRecipes() throws Exception {
    }

    @Test
    public void setDescription() throws Exception {
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue,category.getId());

    }

}