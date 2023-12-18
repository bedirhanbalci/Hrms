package hrms.api.controllers;

import hrms.business.abstracts.CandidateService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.Candidate;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
@AllArgsConstructor
public class CandidatesController {

    private final CandidateService candidateService;

    @GetMapping("/getAll")
    public DataResult<List<Candidate>> getAll() {
        return this.candidateService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody Candidate candidate) {
        return this.candidateService.add(candidate);
    }

    @PutMapping("/update")
    public Result update(@RequestBody Candidate candidate) {
        return this.candidateService.update(candidate);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Candidate candidate) {
        return this.candidateService.delete(candidate);
    }
}
