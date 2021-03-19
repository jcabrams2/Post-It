package wcci.postit.storage;

import org.springframework.stereotype.Service;
import wcci.postit.entities.Student;
import wcci.postit.storage.repository.StudentRepository;

import java.util.Collection;

@Service
public class StudentStorage {

    private StudentRepository studentRepo;

    public StudentStorage(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }
    public void saveStudent(Student alsdkjf){
        this.studentRepo.save(alsdkjf);
    }

    public Iterable<Student>getAllStudents(){
        return this.studentRepo.findAll();
    }
    public Student getStudentById(long id){
        return  this.studentRepo.findById(id).get();
    }



}
