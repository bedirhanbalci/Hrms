package hrms.api.controllers;

import hrms.business.abstracts.EmployeeConfirmEmployerService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.EmployeeConfirmEmployer;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employeeConfirmEmployers")
@AllArgsConstructor
public class EmployeeConfirmEmployersController {

    private final EmployeeConfirmEmployerService employeeConfirmEmployerService;

    @GetMapping("/getAll")
    public DataResult<List<EmployeeConfirmEmployer>> getAll() {
        return this.employeeConfirmEmployerService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody EmployeeConfirmEmployer employeeConfirmEmployer) {
        return this.employeeConfirmEmployerService.add(employeeConfirmEmployer);
    }

    @PutMapping("/update")
    public Result update(@RequestBody EmployeeConfirmEmployer employeeConfirmEmployer) {
        return this.employeeConfirmEmployerService.update(employeeConfirmEmployer);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody EmployeeConfirmEmployer employeeConfirmEmployer) {
        return this.employeeConfirmEmployerService.delete(employeeConfirmEmployer);
    }
}
