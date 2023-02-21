package Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AddressDetails {
    private String municipality;
    private String surbub_or_town;
    private String area;
    private int house_number;
    private String street_name;
}
