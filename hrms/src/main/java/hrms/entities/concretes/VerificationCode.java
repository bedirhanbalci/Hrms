package hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "verification_codes")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VerificationCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "is_verified")
    private boolean isVerified;

    @Column(name = "verified_date")
    private LocalDate verifiedDate;
}
