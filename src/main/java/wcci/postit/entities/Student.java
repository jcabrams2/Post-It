package wcci.postit.entities;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "students")
    private List<Message> Messages;

    public void setMessages(Collection<Message> messages) {
        //Messages = messages;
    }


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//    this.Messages = Arrays.asList(Messages);
    }

    protected Student() {

    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Message> getMessages() {
        return Messages;
    }

    @ManyToOne(optional = false)
    private Cohort cohorts;

    public Cohort getCohorts() {
        return cohorts;
    }

    public void setCohorts(Cohort cohorts) {
        this.cohorts = cohorts;
    }
}
