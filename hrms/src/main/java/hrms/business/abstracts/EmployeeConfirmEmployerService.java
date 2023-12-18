package hrms.business.abstracts;

import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.EmployeeConfirmEmployer;

import java.util.List;

public interface EmployeeConfirmEmployerService {

    DataResult<List<EmployeeConfirmEmployer>> getAll();

    Result add(EmployeeConfirmEmployer employeeConfirmEmployer);

    Result update(EmployeeConfirmEmployer employeeConfirmEmployer);

    Result delete(EmployeeConfirmEmployer employeeConfirmEmployer);
}
