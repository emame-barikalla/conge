package com.portailRH.Role;

import com.portailRH.TypeConge.Entity.TypeConge;
import com.portailRH.TypeConge.Service.ITypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api("API pour les opérations CRUD sur les types de conge.")
@RestController
@RequestMapping("/api/typeconge")
public class RoleController {
    @Autowired
    private final ITypeService itypeService;

    public RoleController(ITypeService itypeService) {
        this.itypeService = itypeService;
    }
    @ApiOperation(value = "Récupère la liste des types de demande ")
    @GetMapping
    public List<TypeConge> findAllTypes() {
        return itypeService.findAllTypes();
    }
    @ApiOperation(value = "Récupère un type grâce à son ID ")
    @GetMapping("/{id}")
    public Optional<TypeConge>  findTypeCongeById(@PathVariable Long id) {
        return itypeService.findById(id);
    }
    @ApiOperation(value = "ajouter un type ")
    @PostMapping("/add")
    public TypeConge savetype(@RequestBody TypeConge typeConge) {
        return itypeService.savetype(typeConge);
    }
    @ApiOperation(value = "modifier un type ")
    @PutMapping("/update")
    public TypeConge updatetype(@RequestBody TypeConge typeConge) {
        return itypeService.updatetype(typeConge);
    }
    @ApiOperation(value = "supprimer un type ")
    @DeleteMapping("/{id}")
    public void deleteTypeCongeById(@PathVariable Long id) {
        itypeService.deletetype(id);
    }
}