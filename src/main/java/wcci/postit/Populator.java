package wcci.postit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wcci.postit.entities.Cohort;
import wcci.postit.entities.Student;
import wcci.postit.storage.repository.CohortRepository;
import wcci.postit.storage.repository.StudentRepository;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CohortRepository cohortRepository;

    @Override
    public void run(String... args) throws Exception {
        Cohort javaSpring21 = new Cohort("Columbus","Java");
        Student student1 = new Student("Celina", "Caban", javaSpring21);
        javaSpring21.addStudent(student1);
        cohortRepository.save(javaSpring21);
        studentRepository.save(student1);
        System.out.println("Hello Jon");
    }
}
