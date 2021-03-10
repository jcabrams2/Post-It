package wcci.postit.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
public class Cohort {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private Date year;
    private String course;
    @OneToMany(mappedBy = "cohort")
    private Collection<Student> students;

    protected Cohort(){}

    public Cohort(String city, String course) {
        this.city = city;
        this.course = course;
        this.students = new ArrayList<Student>();
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        //this.students = students;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
}
