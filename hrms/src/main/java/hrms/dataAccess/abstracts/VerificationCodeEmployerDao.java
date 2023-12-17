package hrms.dataAccess.abstracts;

import hrms.entities.concretes.VerificationCodeEmployer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeEmployerDao extends JpaRepository<VerificationCodeEmployer, Integer> {
}
