package hrms.business.abstracts;

import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.VerificationCode;

import java.util.List;

public interface VerificationCodeService {

    DataResult<List<VerificationCode>> getAll();

    Result add(VerificationCode verificationCode);

    Result update(VerificationCode verificationCode);

    Result delete(VerificationCode verificationCode);
}
