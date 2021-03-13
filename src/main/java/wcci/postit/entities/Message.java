package wcci.postit.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private long id;
    private String message;
    private String color;
    @ManyToOne
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


//    public Message(List<Student> students) {
//        this.students = students;
//    }

    public Message(String message, String color, Student student) {
        this.message = message;
        this.color = color;
        this.student = student;

    }

    public Message() {

    }

    public long getId() {
        return id;
    }

    public String getColor(){
        return this.color;
    }

    public String getMessage() {
        return this.message;
    }

}
