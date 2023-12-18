package hrms.business.abstracts;

import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.VerificationCodeEmployer;

import java.util.List;

public interface VerificationCodeEmployerService {

    DataResult<List<VerificationCodeEmployer>> getAll();

    Result add(VerificationCodeEmployer verificationCodeEmployer);

    Result update(VerificationCodeEmployer verificationCodeEmployer);

    Result delete(VerificationCodeEmployer verificationCodeEmployer);
}
