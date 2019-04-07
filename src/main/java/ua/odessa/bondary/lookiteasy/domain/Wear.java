package ua.odessa.bondary.lookiteasy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wear {

    @Id
    private Long wearId;

    @Column(name="wear_name")
    private String wearName;

    @Column(name="url_path")
    private String urlPath;

}
