package ua.odessa.bondary.lookiteasy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Look {
    @Id
    private Long lookId;

    @Column(name="look_name")
    private String lookName;
    @Column(name="season", length = 8)
    private String season;

    public Long getLookId() {
        return lookId;
    }

    public void setLookId(Long lookId) {
        this.lookId = lookId;
    }

    public String getLookName() {
        return lookName;
    }

    public void setLookName(String lookName) {
        this.lookName = lookName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
