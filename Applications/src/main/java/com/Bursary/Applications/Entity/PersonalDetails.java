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
//@AllArgsConstructor
//@NoArgsConstructor
//public class PersonalDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long personal_id;
//    private Long identification;
//    private String initials;
//    private String name;
//    private String title;
//    private String gender;
//    private boolean disability;
//    private String race;
//    private String home_language;
//    private String phone_number;
//    private String home_telephone;
//    private String email_address;
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;
//}
