package wcci.postit.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class Cohort {
    @Id
    @GeneratedValue
    private String city;
    private Integer year;
    private String course;
    @OneToMany
    private List<Student> students;
}
