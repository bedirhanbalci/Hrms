package hrms.business.concretes;

import hrms.business.abstracts.VerificationCodeCandidateService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.VerificationCodeCandidateDao;
import hrms.entities.concretes.VerificationCodeCandidate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService {

    private final VerificationCodeCandidateDao verificationCodeCandidateDao;

    @Override
    public DataResult<List<VerificationCodeCandidate>> getAll() {
        return new SuccessDataResult<>
                (this.verificationCodeCandidateDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(VerificationCodeCandidate verificationCodeCandidate) {
        this.verificationCodeCandidateDao.save(verificationCodeCandidate);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(VerificationCodeCandidate verificationCodeCandidate) {
        this.verificationCodeCandidateDao.saveAndFlush(verificationCodeCandidate);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(VerificationCodeCandidate verificationCodeCandidate) {
        this.verificationCodeCandidateDao.delete(verificationCodeCandidate);
        return new SuccessResult("Deleted Data");
    }
}
