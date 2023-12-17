package hrms.dataAccess.abstracts;

import hrms.entities.concretes.EmployeeConfirmEmployer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeConfirmEmployerDao extends JpaRepository<EmployeeConfirmEmployer, Integer> {
}
