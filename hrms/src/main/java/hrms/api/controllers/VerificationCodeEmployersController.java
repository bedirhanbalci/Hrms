package hrms.api.controllers;

import hrms.business.abstracts.VerificationCodeEmployerService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.VerificationCodeEmployer;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/verificationCodeEmployers")
@AllArgsConstructor
public class VerificationCodeEmployersController {

    private final VerificationCodeEmployerService verificationCodeEmployerService;

    @GetMapping("/getAll")
    public DataResult<List<VerificationCodeEmployer>> getAll() {
        return this.verificationCodeEmployerService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody VerificationCodeEmployer verificationCodeEmployer) {
        return this.verificationCodeEmployerService.add(verificationCodeEmployer);
    }

    @PutMapping("/update")
    public Result update(@RequestBody VerificationCodeEmployer verificationCodeEmployer) {
        return this.verificationCodeEmployerService.update(verificationCodeEmployer);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody VerificationCodeEmployer verificationCodeEmployer) {
        return this.verificationCodeEmployerService.delete(verificationCodeEmployer);
    }
}
