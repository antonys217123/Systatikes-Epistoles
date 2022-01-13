package gr.hua.SystatikesEpistoles.controller;

import java.util.List;

import gr.hua.SystatikesEpistoles.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.SystatikesEpistoles.dao.ProfessorDAO;
import gr.hua.SystatikesEpistoles.Professor;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

    // inject the professor dao
    @Autowired
    private ProfessorDAO ProfessorDAO;

    @RequestMapping("/list")
    public String listProfessors(Model model) {

        // get professors from dao
        List<Professor> professors = ProfessorDAO.getProfessors();

        // add the professors to the model
        model.addAttribute("professors",professors);

        return "list-professors";
    }
}
