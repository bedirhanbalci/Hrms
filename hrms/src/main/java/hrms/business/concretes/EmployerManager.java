package hrms.business.concretes;

import hrms.business.abstracts.EmployerService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.EmployerDao;
import hrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployerManager implements EmployerService {

    private final EmployerDao employerDao;

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>
                (this.employerDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(Employer employer) {
        this.employerDao.saveAndFlush(employer);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(Employer employer) {
        this.employerDao.delete(employer);
        return new SuccessResult("Deleted Data");
    }
}


