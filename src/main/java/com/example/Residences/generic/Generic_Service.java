package com.example.Residences.generic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface Generic_Service<E,I> {
    Page<E> findAll(Pageable pageable);

    Optional<E> findById(I id);

    E saveOrUpdate(E entity);

    void deleteById(I id);
}
