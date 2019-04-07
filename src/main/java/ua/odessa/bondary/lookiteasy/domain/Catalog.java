package ua.odessa.bondary.lookiteasy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Catalog {

    @Id
    private Long catalogId;
    @Column(name = "catalog_name")
    private String catalogName;
    @Column(name = "catalog_type")
    private String type;
//    @Column(name = "look_id")
//    private Look look;
//    @Column(name = "wear_id")
//    private Wear wear;
}
