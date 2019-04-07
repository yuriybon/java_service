package ua.odessa.bondary.lookiteasy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    private Long userId;
    @Column(name = "user_name", length = 20)
    private String userName;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "first_name", length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(name = "birth_day")
    private Date birthDay;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "last_login")
    private Date lastLogin;

}
