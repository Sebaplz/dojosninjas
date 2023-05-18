package com.seba.dojosninjas.controllers;

import com.seba.dojosninjas.models.Dojo;
import com.seba.dojosninjas.services.MainService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DojoController {

    @Autowired
    private MainService mainService;

    @GetMapping("/dojos")
    public String index(Model model) {
        model.addAttribute("dojos", mainService.todosDojos());
        return "/dojos/indexDojos.jsp";
    }

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "/dojos/newDojo.jsp";
    }

    @PostMapping("/dojos/new")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "/dojos/newDojo.jsp";
        } else {
            mainService.createDojo(dojo);
            return "redirect:/dojos";
        }
    }

    @GetMapping("/dojos/{id}")
    public String verNinjaDeDojo(@PathVariable("id") Long id, Model model){
        model.addAttribute("dojos", mainService.buscarDojo(id));
        return "/dojos/verDojo.jsp";
    }
}
