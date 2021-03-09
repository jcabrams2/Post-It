package wcci.postit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "student")
    private List<Message> Messages;


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
}
