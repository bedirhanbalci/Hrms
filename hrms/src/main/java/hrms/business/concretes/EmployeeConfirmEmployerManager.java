package hrms.business.concretes;

import hrms.business.abstracts.EmployeeConfirmEmployerService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.EmployeeConfirmEmployerDao;
import hrms.entities.concretes.EmployeeConfirmEmployer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeConfirmEmployerManager implements EmployeeConfirmEmployerService {

    private final EmployeeConfirmEmployerDao employeeConfirmEmployerDao;

    @Override
    public DataResult<List<EmployeeConfirmEmployer>> getAll() {
        return new SuccessDataResult<>
                (this.employeeConfirmEmployerDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(EmployeeConfirmEmployer employeeConfirmEmployer) {
        this.employeeConfirmEmployerDao.save(employeeConfirmEmployer);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(EmployeeConfirmEmployer employeeConfirmEmployer) {
        this.employeeConfirmEmployerDao.saveAndFlush(employeeConfirmEmployer);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(EmployeeConfirmEmployer employeeConfirmEmployer) {
        this.employeeConfirmEmployerDao.delete(employeeConfirmEmployer);
        return new SuccessResult("Deleted Data");
    }
}
