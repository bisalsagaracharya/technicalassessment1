package com.unidirectionalExample.repository;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unidirectionalExample.entity.Department;
import com.unidirectionalExample.entity.Employee;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
	
	 
    @Query("SELECT d FROM Department d WHERE d.id = :id")
    Department findDepartmentById(Integer id);
   
    @Query("SELECT d FROM Department d")
	List<Department> findAllDepartments();

	
   @Modifying
   @Transactional
   @Query("DELETE FROM Department d WHERE d.id = :id")
   void deleteByDepartmentId(@Param("id") Integer id);
   
   
   @Modifying
   @Transactional
   @Query("UPDATE Department d SET d.name = :name WHERE d.id =:id")
   void updateDepartment(@Param("id") Integer id, String name);

}


