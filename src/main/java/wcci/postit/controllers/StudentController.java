package wcci.postit.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wcci.postit.entities.Message;
import wcci.postit.storage.MessageStorage;
import wcci.postit.storage.StudentStorage;

import java.awt.*;

@RequestMapping("/students")
@Controller
public class StudentController {
    private StudentStorage studentStorage;
    private MessageStorage messageStorage;

    public StudentController(StudentStorage studentStorage, MessageStorage messageStorage) {
        this.studentStorage = studentStorage;
        this.messageStorage = messageStorage;
    }

    @RequestMapping("/")
    public String listAllStudents(Model model) {
        model.addAttribute("students", studentStorage.getAllStudents());
        return "studentsView";
    }

    @RequestMapping("/{id}")
    public String studentView(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentStorage.getStudentById(id));
        model.addAttribute("messages", studentStorage.getStudentById(id).getAllMessages());
        return "studentView";
    }

    @PostMapping("/{id}")
    public String addStudentMessage(@PathVariable Long id, @RequestParam String message, @RequestParam String color, @RequestParam Long studentId) {
        Message message1 = new Message(message ,color, studentStorage.getStudentById(studentId));
        messageStorage.saveMessage(message1);
        studentStorage.getStudentById(id).addMessage(message1);
        return "redirect:/students/"+ id;
    }
}
