package com.syntaxerror.Student.repostory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends CrudRepository<Users, Integers> {
	
	
}
