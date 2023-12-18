package hrms.business.abstracts;

import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.User;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();
    Result add(User user);

    Result update(User user);

    Result delete(User user);
}
