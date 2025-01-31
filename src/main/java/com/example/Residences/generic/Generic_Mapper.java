package com.example.Residences.generic;

public interface Generic_Mapper<E,D> {
    D toDto(E entity);
    E toEntity(D dto);
}
