package models;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="tblBaskets")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "basket")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @Column(nullable = true)
    private int count;
}
