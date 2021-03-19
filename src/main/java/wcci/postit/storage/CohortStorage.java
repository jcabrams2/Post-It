package wcci.postit.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wcci.postit.entities.Cohort;
import wcci.postit.entities.Student;
import wcci.postit.storage.repository.CohortRepository;
import wcci.postit.storage.repository.StudentRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class CohortStorage {
    private CohortRepository cohortRepository;
    private StudentRepository studentRepository;
//    private Long id;

    public CohortStorage(CohortRepository cohortRepository) {
        this.cohortRepository = cohortRepository;
    }

    public Cohort getCohortByName(String name){
       return this.cohortRepository.getCohortByName(name);
    }

//    public CohortStorage(StudentRepository studentRepository){this.studentRepository = studentRepository;}
//    public Iterable<Student>getStudentsByCohort(Cohort cohort){
//      return cohortRepository.getCohortByName(String city).getStudents();
//    }

//    public Object getAllStudentsByID() {
//        return studentRepo.findById(id).get();
//    }
//        return studentRepo.findById(id).get();}

//    public Iterable<Cohort> getAllStudentsByID() {
//        return Student students;    }


    //    Iterable<Cohort> retrieveAllCohorts();
}