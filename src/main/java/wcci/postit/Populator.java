package wcci.postit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wcci.postit.entities.Student;
import wcci.postit.storage.repository.StudentRepository;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("Celina", "Caban");
        studentRepository.save(student1);
        System.out.println("Hello Jon");
    }
}
