package wcci.postit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wcci.postit.entities.Cohort;
import wcci.postit.entities.Message;
import wcci.postit.entities.Student;
import wcci.postit.storage.repository.CohortRepository;
import wcci.postit.storage.repository.StudentRepository;
import wcci.postit.storage.repository.MessageRepository;

import java.awt.*;
import java.util.ArrayList;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CohortRepository cohortRepository;

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void run(String... args) throws Exception {
        Cohort javaSpring21 = new Cohort("Java2021","Columbus","Java");
//        Cohort C#Spring21 = new Cohort("Cleveland", "C#")

// Student Test List
        //ArrayList<Student> students = new ArrayList<Student>();
        //students.add(new Student("Celina", "Caban", javaSpring21));
        Student student1 = new Student("Jordan", "WCCI", javaSpring21);
        Student student2 = new Student ("Doug", "WCCI", javaSpring21);
        Student student3 = new Student("Michelle","WCCI", javaSpring21 );
        Student student4 = new Student("Jonathon", "WCCI", javaSpring21);
        Student student5 = new Student("Keshav", "WCCI", javaSpring21);
        Student student6 = new Student("Bishnu", "WCCI", javaSpring21);
        Student student7 = new Student("Sarah", "WCCI", javaSpring21);
        Student student8 = new Student("Branden", "WCCI", javaSpring21);
        Student student9 = new Student("Miguel", "WCCI", javaSpring21);
        Student student10 = new Student("Bilen", "WCCI", javaSpring21);
        Student student11 = new Student("Celia", "WCCI", javaSpring21);
        Student student12 = new Student("Ricardo", "WCCI", javaSpring21);
        Student student13 = new Student("Connor", "WCCI", javaSpring21);
        Student student14 = new Student("Jelanie", "WCCI", javaSpring21);
        Student student15 = new Student("Lana", "WCCI", javaSpring21);
        Student student16 = new Student("Eduardo", "WCCI", javaSpring21);
        Student student17 = new Student("Fathi", "WCCI", javaSpring21);
        Student student18 = new Student("Weiwei", "WCCI", javaSpring21);
        Student student19 = new Student("David", "WCCI", javaSpring21);



        Message message1 = new Message("Hello World", "#00ff00", student1);
//        javaSpring21.addStudent(student1);
        cohortRepository.save(javaSpring21);
        studentRepository.save(student1);
        messageRepository.save(message1);
        studentRepository.save(student2);
        messageRepository.save(message1);
        studentRepository.save(student3);
        studentRepository.save(student4);
        studentRepository.save(student5);
        studentRepository.save(student6);
        studentRepository.save(student7);
        studentRepository.save(student8);
        studentRepository.save(student9);
        studentRepository.save(student10);
        studentRepository.save(student11);
        studentRepository.save(student12);
        studentRepository.save(student13);
        studentRepository.save(student14);
        studentRepository.save(student15);
        studentRepository.save(student16);
        studentRepository.save(student17);
        studentRepository.save(student18);
        studentRepository.save(student19);
    }
}
