package com.poovarasan.hisec.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;
import java.util.Date;

@Entity
public class UserLogins {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;


    @Column
    private String ip;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "geo_location_id")
    private GeoLocation geo;


    @ManyToOne
    @JoinColumn(name = "login_user_id")
    private User user;

    @Basic(optional = false)
    @Column(insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;



}
