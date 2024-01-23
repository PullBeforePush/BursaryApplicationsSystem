package com.Bursary.Applications.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "Username"),
        @UniqueConstraint(columnNames = "email")
})
public class User{
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;
      private String name;
      private String username;
      private String email;
      private String password;

      @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
      @JoinTable(name = "user_roles",
      joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "Id"),
      inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "Id"))
      private Set<Role> roles;
}