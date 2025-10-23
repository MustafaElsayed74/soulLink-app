package com.us.soullink.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @Column(nullable = false)
    private String password;

    private String nickname;

    private String profileImageUrl;

    @Column(unique = true,nullable = false)
    private String userName;



}
