package hrms.business.concretes;

import hrms.business.abstracts.EmployeeService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.EmployeeDao;
import hrms.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService {

    private final EmployeeDao employeeDao;

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<>
                (this.employeeDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(Employee employee) {
        this.employeeDao.saveAndFlush(employee);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(Employee employee) {
        this.employeeDao.delete(employee);
        return new SuccessResult("Deleted Data");
    }
}
