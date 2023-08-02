package com.marcdev.rental_app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subscribe", schema = "rent")
public class Subscribe {

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subscribe_at")
    private Timestamp subscribeAt;
}
