package Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDetails {
    private Long personal_id;
    private Long identification;
    private String initials;
    private String name;
    private String title;
    private String gender;
    private boolean disability;
    private String race;
    private String home_language;
    private String phone_number;
    private String home_telephone;
    private String email_address;
}
