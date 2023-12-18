package hrms.api.controllers;

import hrms.business.abstracts.VerificationCodeCandidateService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.VerificationCodeCandidate;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/verificationCodeCandidates")
@AllArgsConstructor
public class VerificationCodeCandidatesController {

    private final VerificationCodeCandidateService verificationCodeCandidateService;

    @GetMapping("/getAll")
    public DataResult<List<VerificationCodeCandidate>> getAll() {
        return this.verificationCodeCandidateService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody VerificationCodeCandidate verificationCodeCandidate) {
        return this.verificationCodeCandidateService.add(verificationCodeCandidate);
    }

    @PutMapping("/update")
    public Result update(@RequestBody VerificationCodeCandidate verificationCodeCandidate) {
        return this.verificationCodeCandidateService.update(verificationCodeCandidate);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody VerificationCodeCandidate verificationCodeCandidate) {
        return this.verificationCodeCandidateService.delete(verificationCodeCandidate);
    }
}
