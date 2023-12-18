package hrms.business.abstracts;

import hrms.core.utilities.results.DataResult;
import hrms.core.utilities.results.Result;
import hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {

    DataResult<List<JobTitle>> getAll();

    Result add(JobTitle jobTitle);

    Result update(JobTitle jobTitle);

    Result delete(JobTitle jobTitle);
}
