package gr.hua.SystatikesEpistoles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.SystatikesEpistoles.dao.StudentDAO;
import gr.hua.SystatikesEpistoles.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

    // inject the student dao
    @Autowired
    private StudentDAO studentDAO;

    @RequestMapping("/list")
    public String listStudents(Model model) {

        // get students from dao
        List<Student> students = studentDAO.getStudents();

        // add the students to the model
        model.addAttribute("students",students);

        return "list-students";
    }
}
