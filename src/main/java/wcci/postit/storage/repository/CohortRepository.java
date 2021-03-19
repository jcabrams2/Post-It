package wcci.postit.storage.repository;

import org.springframework.data.repository.CrudRepository;
import wcci.postit.entities.Cohort;
import wcci.postit.storage.CohortStorage;

public interface CohortRepository extends CrudRepository<Cohort, Long> {
    public Cohort getCohortByName(String name);

}
