package hrms.api.controllers;

import hrms.business.abstracts.EmployeeService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeesController {

    private final EmployeeService employeeService;

    @GetMapping("/getAll")
    public DataResult<List<Employee>> getAll() {
        return this.employeeService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody Employee employee) {
        return this.employeeService.add(employee);
    }

    @PutMapping("/update")
    public Result update(@RequestBody Employee employee) {
        return this.employeeService.update(employee);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Employee employee) {
        return this.employeeService.delete(employee);
    }
}
