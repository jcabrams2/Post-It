package wcci.postit.storage;

import org.springframework.stereotype.Service;
import wcci.postit.entities.Student;
import wcci.postit.storage.repository.StudentRepository;

@Service
public class StudentStorage {

    private StudentRepository studentRepo;

    public StudentStorage(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }
    public void saveStudent(Student alsdkjf){
        this.studentRepo.save(alsdkjf);
    }

//    Iterable<Student> retrieveAllStudents(long id);
//
//    void save(Student studentToSave);
//
//    Student retrieveSingleStudent(long id);

}
