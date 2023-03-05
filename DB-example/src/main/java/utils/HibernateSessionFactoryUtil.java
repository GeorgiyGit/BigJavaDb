package utils;

import models.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;
    public HibernateSessionFactoryUtil(){

    }

    public static SessionFactory getSessionFactory() {
        if(sessionFactory==null) {
            try{
                Configuration configuration = new Configuration().configure();

                configuration.addAnnotatedClass(Basket.class);
                configuration.addAnnotatedClass(Filter.class);
                configuration.addAnnotatedClass(FilterNameGroup.class);
                configuration.addAnnotatedClass(Category.class);
                configuration.addAnnotatedClass(FilterName.class);
                configuration.addAnnotatedClass(FilterValue.class);
                configuration.addAnnotatedClass(Order.class);
                configuration.addAnnotatedClass(OrderItem.class);
                configuration.addAnnotatedClass(OrderStatus.class);
                configuration.addAnnotatedClass(Product.class);
                configuration.addAnnotatedClass(ProductImage.class);
                configuration.addAnnotatedClass(Role.class);
                configuration.addAnnotatedClass(User.class);

                StandardServiceRegistryBuilder builder =
                        new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory();
            }catch(Exception ex) {
                System.out.println("Exception "+ ex.toString());
            }
        }
        return sessionFactory;
    }
}
