package com.whiteship;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable =  false,unique = true)
    private String username;

    private  String password;

    @OneToMany
    private Set<Study> studies = new HashSet<Study>();

    @Temporal(TemporalType.TIME)
    private Date created = new Date();

    private String yes;

    //Transient을 쓰면 컬럼으로 맵핑을 안해도 됩니다.
    @Transient
    private String no;

    private Address Address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Set<Study> getStudies() {
        return studies;
    }

    public void setStudies(Set<Study> studies) {
        this.studies = studies;
    }
}
