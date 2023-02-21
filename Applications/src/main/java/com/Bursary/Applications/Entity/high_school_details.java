package com.Bursary.Applications.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class high_school_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long high_school_id;
    private String province;
    private String school_name;
    private int year_from;
    private int year_end;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
}
