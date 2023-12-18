package hrms.api.controllers;

import hrms.business.abstracts.JobTitleService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.JobTitle;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobTitles")
@AllArgsConstructor
public class JobTitlesController {

    private final JobTitleService jobTitleService;

    @GetMapping("/getAll")
    public DataResult<List<JobTitle>> getAll() {
        return this.jobTitleService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody JobTitle jobTitle) {
        return this.jobTitleService.add(jobTitle);
    }

    @PutMapping("/update")
    public Result update(@RequestBody JobTitle jobTitle) {
        return this.jobTitleService.update(jobTitle);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody JobTitle jobTitle) {
        return this.jobTitleService.delete(jobTitle);
    }
}
