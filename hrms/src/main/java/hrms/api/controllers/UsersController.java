package hrms.api.controllers;

import hrms.business.abstracts.UserService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UsersController {

    private final UserService userService;

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll() {
        return this.userService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Result add(@RequestBody User user) {
        return this.userService.add(user);
    }

    @PutMapping("/update")
    public Result update(@RequestBody User user) {
        return this.userService.update(user);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody User user) {
        return this.userService.delete(user);
    }
}
