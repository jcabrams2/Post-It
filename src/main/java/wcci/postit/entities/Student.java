package wcci.postit.entities;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "student")
    private Collection<Message> messages;

    public Collection<Message> getMessages() {
        return messages;
    }

    public void setMessages(Collection<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }
    public Iterable<Message> getAllMessages(){
        return this.messages;
    }


    public Student(String firstName, String lastName, Cohort cohort) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cohort = cohort;
        this.messages = new ArrayList<>();
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
