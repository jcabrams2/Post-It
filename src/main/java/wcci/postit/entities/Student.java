package wcci.postit.entities;

import javax.persistence.*;
import java.util.Collection;



@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    @ManyToOne
    private Cohort cohort;

//    @OneToMany()
//    private Collection<Message> Messages;

    public void setMessages(Collection<Message> messages) {
        //Messages = messages;
    }


    public Student(String firstName, String lastName, Cohort cohort) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cohort = cohort;

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

//    public List<Message> getMessages() {
//        return Messages;
//    }




}
