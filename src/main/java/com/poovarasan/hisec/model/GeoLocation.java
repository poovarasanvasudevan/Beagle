package com.poovarasan.hisec.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity(name = "geo_location")
public class GeoLocation {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;


    @Column
    private Double lat;

    @Column
    private Double lng;


    @Column
    private String address;


    @Basic(optional = false)
    @Column(insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;


    @OneToOne(mappedBy = "geo")
    private UserLogins userLogins;

    public UserLogins getUserLogins() {
        return userLogins;
    }

    public void setUserLogins(UserLogins userLogins) {
        this.userLogins = userLogins;
    }

    public UUID getId() {
        return id;
    }



    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

}
