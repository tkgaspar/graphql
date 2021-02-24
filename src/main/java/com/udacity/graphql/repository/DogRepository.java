package com.udacity.graphql.repository;

import com.udacity.graphql.Entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog,Long> {



    @Query("select d.id, d.breed from Dog d where d.id=:id")
    public String findBreedById(Long id);

    @Query("select d.id, d.breed from Dog d")
    public List <String> findAllBreed();

    @Query("select d.id, d.name from Dog d")
    public List <String> findAllName();
}
