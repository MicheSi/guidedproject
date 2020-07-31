package com.lambdaschool.guidedproject.repositories;

import com.lambdaschool.guidedproject.models.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat, Long> {
}
