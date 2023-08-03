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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "message", schema = "rent")
public class Message {

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String content;

    @Column
    private Timestamp createAt;

    public Message(String content) {
    }

    public Message(String content, Timestamp createAt) {

    }
}
