package hrms.business.abstracts;

import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.EmployeeConfirm;

import java.util.List;

public interface EmployeeConfirmService {

    DataResult<List<EmployeeConfirm>> getAll();

    Result add(EmployeeConfirm employeeConfirm);

    Result update(EmployeeConfirm employeeConfirm);

    Result delete(EmployeeConfirm employeeConfirm);
}
