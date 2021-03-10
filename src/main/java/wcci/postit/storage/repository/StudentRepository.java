package wcci.postit.storage.repository;

import org.springframework.data.repository.CrudRepository;
import wcci.postit.entities.Student;


public interface StudentRepository extends CrudRepository<Student, Long> {

}
