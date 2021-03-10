package wcci.postit.storage.repository;

import org.springframework.data.repository.CrudRepository;
import wcci.postit.entities.Cohort;

public interface CohortRepository extends CrudRepository<Cohort, Long> {
}
