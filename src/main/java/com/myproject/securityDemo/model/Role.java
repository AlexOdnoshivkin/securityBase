package com.myproject.securityDemo.model;

import com.myproject.securityDemo.model.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table (name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy="roles")
    private List<User> users;
}
