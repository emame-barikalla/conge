package com.portailRH.TypeConge.Service;

import com.portailRH.TypeConge.Entity.TypeConge;
import com.portailRH.TypeConge.Repository.TypeCongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCongeService {
    @Autowired
    private TypeCongeRepository TypeCongeRepository;

    public List<TypeConge> findAllTypeConge() {
        return TypeCongeRepository.findAll();
    }

    public TypeConge findTypeCongeById(Long id) {
        return TypeCongeRepository.findById(id).orElse(null);
    }

    public TypeConge saveTypeConge(TypeConge TypeConge) {
        return TypeCongeRepository.save(TypeConge);
    }

    public void deleteTypeCongeById(Long id) {
        TypeCongeRepository.deleteById(id);
    }
}