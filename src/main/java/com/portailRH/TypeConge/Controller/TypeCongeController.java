package com.portailRH.TypeConge.Controller;

import com.portailRH.TypeConge.Entity.TypeConge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.portailRH.TypeConge.Service.ITypeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/typeconge")
public class TypeCongeController {
    @Autowired
    private ITypeService itypeService;

    public TypeCongeController(ITypeService itypeService) {
        this.itypeService = itypeService;
    }


    @GetMapping
    public List<TypeConge> findAllTypes() {
        return itypeService.findAllTypes();
    }

    @GetMapping("/{id}")
    public Optional<TypeConge>  findTypeCongeById(@PathVariable Long id) {
        return itypeService.findById(id);
    }

    @PostMapping
    public TypeConge savetype(@RequestBody TypeConge typeConge) {
        return itypeService.savetype(typeConge);
    }
    @PutMapping
    public TypeConge updatetype(@RequestBody TypeConge typeConge) {
        return itypeService.updatetype(typeConge);
    }
    @DeleteMapping("/{id}")
    public void deleteTypeCongeById(@PathVariable Long id) {
        itypeService.deletetype(id);
    }
}