package wcci.postit.controllers;


import com.sun.xml.bind.v2.model.core.ID;
import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import wcci.postit.entities.Cohort;
import wcci.postit.entities.Message;
import wcci.postit.entities.Student;
import wcci.postit.storage.CohortStorage;
import wcci.postit.storage.MessageStorage;
import wcci.postit.storage.StudentStorage;

import java.awt.*;
import java.util.ArrayList;

@RequestMapping("/{cohort}/students")
@Controller
public class StudentController {
    private StudentStorage studentStorage;
    private MessageStorage messageStorage;

    private CohortStorage cohortStorage;

    public StudentController(StudentStorage studentStorage, MessageStorage messageStorage, CohortStorage cohortStorage) {
        this.studentStorage = studentStorage;
        this.messageStorage = messageStorage;
        this.cohortStorage = cohortStorage;
    }
    @RequestMapping("/**")
    public String redirectToStudents(@PathVariable String cohort, Model model) {
        return "redirect:/"+ cohort +"/students/";
    }

    @RequestMapping("/")
    public String listAllStudents(@PathVariable String cohort, Model model) {
        model.addAttribute("cohort", cohortStorage.getCohortByName(cohort));
        model.addAttribute("students", cohortStorage.getCohortByName(cohort).getStudents());

        return "studentsView";
    }


    @RequestMapping("/{id}")
    public String studentView(@PathVariable Long id,@PathVariable String cohort, Model model) {
        model.addAttribute("student", studentStorage.getStudentById(id));
        model.addAttribute("messages", studentStorage.getStudentById(id).getAllMessages());
        model.addAttribute("cohort", cohort);
        return "studentView";
    }

    @PostMapping("/{id}")
    public String addStudentMessage(@PathVariable Long id, @RequestParam String message, @RequestParam String color, @RequestParam Long studentId, @PathVariable String cohort) {
        Message message1 = new Message(message, color, studentStorage.getStudentById(studentId));
        messageStorage.saveMessage(message1);
        studentStorage.getStudentById(id).addMessage(message1);
        return "redirect:/"+ cohort +"/students/" + id;
    }

//    @GetMapping
//    public String displayAllMessages(@PathVariable String cohort, Model model) {
//
//        return "studentsView";
//    }
}

//    @RequestMapping("/{cohort}")
//    public String cohortView(@PathVariable String cohort, @RequestParam Long studentId, Model model) {
//        model.addAttribute("cohort", cohortStorage.getCohortByName(toString()));
//        return "cohortView";
////        model.addAttribute("messages", .getAllMessages());
//    }



