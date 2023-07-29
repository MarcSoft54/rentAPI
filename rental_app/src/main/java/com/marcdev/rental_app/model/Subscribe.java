package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "subscribe")
public class Subscribe {

    @ManyToOne
    @JoinColumn(name = "id_users")
    User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subscribeAt")
    private Timestamp subscribeAt;
}
