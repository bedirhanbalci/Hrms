package hrms.business.concretes;

import hrms.business.abstracts.EmployeeConfirmService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.EmployeeConfirmDao;
import hrms.entities.concretes.EmployeeConfirm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeConfirmManager implements EmployeeConfirmService {

    private final EmployeeConfirmDao employeeConfirmDao;

    @Override
    public DataResult<List<EmployeeConfirm>> getAll() {
        return new SuccessDataResult<>
                (this.employeeConfirmDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(EmployeeConfirm employeeConfirm) {
        this.employeeConfirmDao.save(employeeConfirm);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(EmployeeConfirm employeeConfirm) {
        this.employeeConfirmDao.saveAndFlush(employeeConfirm);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(EmployeeConfirm employeeConfirm) {
        this.employeeConfirmDao.delete(employeeConfirm);
        return new SuccessResult("Deleted Data");
    }
}
