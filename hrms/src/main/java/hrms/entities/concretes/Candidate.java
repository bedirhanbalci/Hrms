package hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "candidates")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_number", unique = true)
    private String identityNumber;

    @Column(name = "birth_year")
    private int birthYear;

    @OneToMany(mappedBy = "candidate")
    @JsonIgnore
    private List<VerificationCodeCandidate> verificationCodeCandidates;
}
