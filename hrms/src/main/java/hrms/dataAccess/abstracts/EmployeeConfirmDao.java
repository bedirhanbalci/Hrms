package hrms.dataAccess.abstracts;

import hrms.entities.concretes.EmployeeConfirm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeConfirmDao extends JpaRepository<EmployeeConfirm, Integer> {
}
