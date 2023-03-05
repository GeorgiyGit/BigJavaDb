package models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="tblFilters")
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private FilterName filterName;

    @ManyToOne(fetch = FetchType.LAZY)
    private FilterValue filterValue;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
