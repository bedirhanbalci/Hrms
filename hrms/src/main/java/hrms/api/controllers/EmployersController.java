package hrms.api.controllers;

import hrms.business.abstracts.EmployerService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
@AllArgsConstructor
public class EmployersController {

    private final EmployerService employerService;

    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll() {
        return this.employerService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody Employer employer) {
        return this.employerService.add(employer);
    }

    @PutMapping("/update")
    public Result update(@RequestBody Employer employer) {
        return this.employerService.update(employer);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Employer employer) {
        return this.employerService.delete(employer);
    }
}
