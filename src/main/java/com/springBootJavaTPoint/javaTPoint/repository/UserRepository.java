package com.springBootJavaTPoint.javaTPoint.repository;

import com.springBootJavaTPoint.javaTPoint.model.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserRecord, Long> {
}
