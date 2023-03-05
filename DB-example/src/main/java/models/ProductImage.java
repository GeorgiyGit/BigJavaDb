package models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name="tblProductImages")
public class ProductImage {
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
    private int priority;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
