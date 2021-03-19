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

    public Cohort getCohortByName(String name){
       return this.cohortRepository.getCohortByName(name);
    }


}