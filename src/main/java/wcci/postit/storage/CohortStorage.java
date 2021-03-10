package wcci.postit.storage;

import org.springframework.stereotype.Service;
import wcci.postit.entities.Cohort;
import wcci.postit.storage.repository.CohortRepository;

@Service
public class CohortStorage {
    private CohortRepository cohortRepository;
    public CohortStorage(CohortRepository cohortRepository) {
        this.cohortRepository = cohortRepository;
    }


    //    Iterable<Cohort> retrieveAllCohorts();
}
