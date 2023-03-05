package models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="tblProducts")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 500, nullable = false)
    private String name;

    @Column(nullable = false)
    private Date dateCreated;

    @Column(nullable = false)
    private boolean isDelete;

    @Column(nullable = false)
    private int price;

    @Column(length = 3000, nullable = false)
    private String description;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    private List<Basket> baskets = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Category> categories=new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    private List<OrderItem> orderItems=new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    private List<ProductImage> images=new ArrayList<>();
}
