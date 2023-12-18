package hrms.api.controllers;

import hrms.business.abstracts.EmployeeConfirmService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.EmployeeConfirm;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employeeConfirms")
@AllArgsConstructor
public class EmployeeConfirmsController {

    private final EmployeeConfirmService employeeConfirmService;

    @GetMapping("/getAll")
    public DataResult<List<EmployeeConfirm>> getAll() {
        return this.employeeConfirmService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody EmployeeConfirm employeeConfirm) {
        return this.employeeConfirmService.add(employeeConfirm);
    }

    @PutMapping("/update")
    public Result update(@RequestBody EmployeeConfirm employeeConfirm) {
        return this.employeeConfirmService.update(employeeConfirm);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody EmployeeConfirm employeeConfirm) {
        return this.employeeConfirmService.delete(employeeConfirm);
    }
}
