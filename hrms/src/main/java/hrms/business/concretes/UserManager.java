package hrms.business.concretes;

import hrms.business.abstracts.UserService;
import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.core.utilities.results.SuccessDataResult;
import hrms.core.utilities.results.SuccessResult;
import hrms.dataAccess.abstracts.UserDao;
import hrms.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserManager implements UserService {

    private final UserDao userDao;

    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<>
                (this.userDao.findAll(), "Listed Data");
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Added Data");
    }

    @Override
    public Result update(User user) {
        this.userDao.saveAndFlush(user);
        return new SuccessResult("Updated Data");
    }

    @Override
    public Result delete(User user) {
        this.userDao.delete(user);
        return new SuccessResult("Deleted Data");
    }
}
