package hrms.business.concretes;

import hrms.business.abstracts.VerificationCodeService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.VerificationCodeDao;
import hrms.entities.concretes.VerificationCode;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VerificationCodeManager implements VerificationCodeService {

    private final VerificationCodeDao verificationCodeDao;

    @Override
    public DataResult<List<VerificationCode>> getAll() {
        return new SuccessDataResult<>
                (this.verificationCodeDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(VerificationCode verificationCode) {
        this.verificationCodeDao.save(verificationCode);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(VerificationCode verificationCode) {
        this.verificationCodeDao.saveAndFlush(verificationCode);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(VerificationCode verificationCode) {
        this.verificationCodeDao.delete(verificationCode);
        return new SuccessResult("Deleted Data");
    }
}
