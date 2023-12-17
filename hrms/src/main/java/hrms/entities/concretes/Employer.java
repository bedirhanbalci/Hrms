package hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "employers")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    private List<EmployeeConfirmEmployer> employeeConfirmEmployers;

    @OneToMany(mappedBy = "employer")
    @JsonIgnore
    private List<VerificationCodeEmployer> verificationCodeEmployers;
}
