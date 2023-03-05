package Seeders;

import models.Category;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

import java.sql.Date;
import java.time.LocalDateTime;

public class CategorySeeder {

    public CategorySeeder(){
        Session context = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Category category = new Category();
        category.setName("Music");
        category.setImage("aeraegaer");
        category.setDateCreated(new Date(System.currentTimeMillis()));

        context.save(category);
        context.close();
    }
}
