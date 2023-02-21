package Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class HighSchoolDetails {
    private String province;
    private String school_name;
    private int year_started_at;
    private int year_ended_at;
}
