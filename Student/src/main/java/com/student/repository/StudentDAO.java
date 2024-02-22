package com.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Studentinfo;
@Repository
public interface StudentDAO extends CrudRepository<Studentinfo,Integer>{

}
