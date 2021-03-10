package wcci.postit.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.awt.*;
import java.util.List;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private long id;
    private String message;
    private Color color;


//    public Message(List<Student> students) {
//        this.students = students;
//    }

    public Message() {

    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    @ManyToOne(optional = false)
    private Student students;

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }
}
