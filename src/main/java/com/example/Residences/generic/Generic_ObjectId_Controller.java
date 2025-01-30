package com.example.Residences.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class Generic_ObjectId_Controller<
        E,
        I,
        S extends Generic_Service<E,I>
        > {
    protected S service;

    public Generic_ObjectId_Controller(S service) {
        this.service = service;
    }

    @GetMapping
    public Page<E> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @PostMapping
    public E saveOrUpdate(@RequestBody E entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping("byId")
    public Optional<E> findById(@RequestBody I id) {
        return service.findById(id);
    }

    @DeleteMapping("delete")
    public void deleteById(@RequestBody I id) {
        service.deleteById(id);
    }
}
