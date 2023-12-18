package hrms.api.controllers;

import hrms.business.abstracts.VerificationCodeService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.VerificationCode;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/verificationCodes")
@AllArgsConstructor
public class VerificationCodesController {

    private final VerificationCodeService verificationCodeService;

    @GetMapping("/getAll")
    public DataResult<List<VerificationCode>> getAll() {
        return this.verificationCodeService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody VerificationCode verificationCode) {
        return this.verificationCodeService.add(verificationCode);
    }

    @PutMapping("/update")
    public Result update(@RequestBody VerificationCode verificationCode) {
        return this.verificationCodeService.update(verificationCode);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody VerificationCode verificationCode) {
        return this.verificationCodeService.delete(verificationCode);
    }
}
