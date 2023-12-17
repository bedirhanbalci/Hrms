package hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "employee_confirms")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeConfirm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    @Column(name = "confirm_date")
    private LocalDate confirmDate;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
