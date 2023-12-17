package hrms.dataAccess.abstracts;

import hrms.entities.concretes.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer> {
}
