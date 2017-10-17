package hu.elte.alkfejl.repository;

import hu.elte.alkfejl.entity.Issue;
import hu.elte.alkfejl.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Long> {
    Iterable<Issue> findAllByUser(User user);
}
