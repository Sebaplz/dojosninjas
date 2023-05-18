package com.seba.dojosninjas.controllers;

import com.seba.dojosninjas.models.Dojo;
import com.seba.dojosninjas.models.Ninja;
import com.seba.dojosninjas.services.MainService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NinjaController {

    @Autowired
    private MainService mainService;

    @GetMapping("/ninjas")
    public String index(Model model) {
        model.addAttribute("ninjas", mainService.todosNinjas());
        return "/ninjas/indexNinjas.jsp";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        model.addAttribute("dojos", mainService.todosDojos());
        return "/ninjas/newNinja.jsp";
    }

    @PostMapping("/ninjas/new")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "/ninjas/newNinja.jsp";
        } else {
            mainService.createNinja(ninja);
            return "redirect:/ninjas";
        }
    }
}
