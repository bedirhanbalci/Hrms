package hrms.business.concretes;

import hrms.business.abstracts.CandidateService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.CandidateDao;
import hrms.entities.concretes.Candidate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CandidateManager implements CandidateService {

    private final CandidateDao candidateDao;

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<>
                (this.candidateDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(Candidate candidate) {
        this.candidateDao.save(candidate);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(Candidate candidate) {
        this.candidateDao.saveAndFlush(candidate);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(Candidate candidate) {
        this.candidateDao.delete(candidate);
        return new SuccessResult("Deleted Data");
    }
}