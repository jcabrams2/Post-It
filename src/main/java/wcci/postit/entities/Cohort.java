package wcci.postit.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    @OneToMany(mappedBy = "cohorts")
    private List<Student> students;

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        //this.students = students;
    }
}
