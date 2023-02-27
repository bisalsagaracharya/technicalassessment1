package com.Shopping.controller;

import com.Shopping.dto.FinalProject;
import com.Shopping.dto.Student;
import com.Shopping.exception.StudentException;
import com.Shopping.repository.FinalProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FinalProjectController {
    @Autowired
    private FinalProjectRepository finalProjectRepository;
    @PostMapping("finalproject")
    public FinalProject addNewProject(@RequestBody FinalProject finalProject){
        FinalProject project1 =finalProjectRepository.save(finalProject);
        return project1;
    }
    @GetMapping("finalprojects")
    public List<FinalProject> getListOfProjects(){
        return this.finalProjectRepository.findAll();
    }

    @PutMapping("finalproject")
    public String updateFinalProject(@RequestBody FinalProject finalProject) {
        this.finalProjectRepository.save(finalProject);
        return "Student got updated successfully";
    }

    @DeleteMapping("finalproject/{id}")
    public String deleteFinalProject(@PathVariable("id") Integer id)  {
        this.finalProjectRepository.deleteById(id);
        return "Student got deleted successfully";
    }

}
