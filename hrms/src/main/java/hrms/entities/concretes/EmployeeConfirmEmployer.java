package hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "employee_confirms_employers")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeConfirmEmployer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;

}
