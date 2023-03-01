package com.portailRH.TypeConge.Controller;

import com.portailRH.TypeConge.Entity.TypeConge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.portailRH.TypeConge.Service.TypeCongeService;

import java.util.List;

@RestController
@RequestMapping("/api/typeconge")
public class TypeCongeController {
    @Autowired
    private TypeCongeService TypeCongeService;

    @GetMapping
    public List<TypeConge> findAllTypeConge() {
        return TypeCongeService.findAllTypeConge();
    }

    @GetMapping("/{id}")
    public TypeConge findTypeCongeById(@PathVariable Long id) {
        return TypeCongeService.findTypeCongeById(id);
    }

    @PostMapping
    public TypeConge saveUser(@RequestBody TypeConge TypeConge) {
        return TypeCongeService.saveTypeConge(TypeConge);
    }

    @DeleteMapping("/{id}")
    public void deleteTypeCongeById(@PathVariable Long id) {
        TypeCongeService.deleteTypeCongeById(id);
    }
}