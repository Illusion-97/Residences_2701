package com.example.Residences.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class Generic_ServiceImpl<
        E,
        I,
        D,
        R extends JpaRepository<E,I>
        > implements Generic_Service<D,I> {
    protected R repository;

    public Generic_ServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public Page<D> findAll(Pageable pageable) {
        return repository.findAll(pageable).map(this::toDto);
    }
    @Override
    public Optional<D> findById(I id) { return repository.findById(id).map(this::toDto); }
    @Override
    public D saveOrUpdate(D dto) { return toDto(repository.save(toEntity(dto)));}
    @Override
    public void deleteById(I id) {repository.deleteById(id);}

    E toEntity(D dto) {
        return null;
    }


    D toDto(E entity) {return null;}
}
