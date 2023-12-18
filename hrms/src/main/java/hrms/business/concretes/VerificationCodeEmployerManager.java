package hrms.business.concretes;

import hrms.business.abstracts.VerificationCodeEmployerService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.VerificationCodeEmployerDao;
import hrms.entities.concretes.VerificationCodeEmployer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VerificationCodeEmployerManager implements VerificationCodeEmployerService {

    private final VerificationCodeEmployerDao verificationCodeEmployerDao;

    @Override
    public DataResult<List<VerificationCodeEmployer>> getAll() {
        return new SuccessDataResult<>
                (this.verificationCodeEmployerDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(VerificationCodeEmployer verificationCodeEmployer) {
        this.verificationCodeEmployerDao.save(verificationCodeEmployer);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(VerificationCodeEmployer verificationCodeEmployer) {
        this.verificationCodeEmployerDao.saveAndFlush(verificationCodeEmployer);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(VerificationCodeEmployer verificationCodeEmployer) {
        this.verificationCodeEmployerDao.delete(verificationCodeEmployer);
        return new SuccessResult("Deleted Data");
    }
}
