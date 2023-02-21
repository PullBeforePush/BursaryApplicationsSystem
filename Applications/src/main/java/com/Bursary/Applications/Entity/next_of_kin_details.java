package com.Bursary.Applications.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class next_of_kin_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long kin_id;
    private String first_name;
    private String last_name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
}
