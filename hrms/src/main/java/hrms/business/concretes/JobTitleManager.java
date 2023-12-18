package hrms.business.concretes;

import hrms.business.abstracts.JobTitleService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.JobTitleDao;
import hrms.entities.concretes.JobTitle;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobTitleManager implements JobTitleService {

    private final JobTitleDao jobTitleDao;

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<>
                (this.jobTitleDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(JobTitle jobTitle) {
        this.jobTitleDao.saveAndFlush(jobTitle);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(JobTitle jobTitle) {
        this.jobTitleDao.delete(jobTitle);
        return new SuccessResult("Deleted Data");
    }
}
