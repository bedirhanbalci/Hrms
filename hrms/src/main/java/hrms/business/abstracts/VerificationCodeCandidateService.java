package hrms.business.abstracts;

import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.VerificationCodeCandidate;

import java.util.List;

public interface VerificationCodeCandidateService {
    DataResult<List<VerificationCodeCandidate>> getAll();

    Result add(VerificationCodeCandidate verificationCodeCandidate);

    Result update(VerificationCodeCandidate verificationCodeCandidate);

    Result delete(VerificationCodeCandidate verificationCodeCandidate);
}
