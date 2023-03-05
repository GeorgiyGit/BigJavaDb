package models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tblFilterNameGroups")
public class FilterNameGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private FilterName filterName;

    @ManyToOne(fetch = FetchType.LAZY)
    private FilterValue filterValue;
}
