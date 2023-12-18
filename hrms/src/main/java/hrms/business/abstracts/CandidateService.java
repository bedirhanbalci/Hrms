package hrms.business.abstracts;

import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {

    DataResult<List<Candidate>> getAll();

    Result add(Candidate candidate);

    Result update(Candidate candidate);

    Result delete(Candidate candidate);

}
