//package com.Bursary.Applications.Entity;
//
////import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class result_details {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long results_id;
//    private String result_type;
//    private String subject_name;
//    private int marks;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;
//}
