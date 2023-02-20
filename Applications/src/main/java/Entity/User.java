package Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long user_id;
      private String user_name;
      private String password;
      private int user_age;
}
