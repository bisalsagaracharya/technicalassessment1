package com.JpqlCodingChelange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.JpqlCodingChelange.entity.Department;
 

import java.util.List;

import javax.transaction.Transactional;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
	
	@Query("SELECT d FROM Department d WHERE d.departmentName = :departmentName")
    List<Department> findByDepartmentName(String departmentName);

  
   @Query("SELECT d FROM Department d WHERE d.departmentId = ?1")
   Department findDepartmentByDepartmentId(Integer departmentId);
   
   @Query("SELECT d FROM Department d")
	List<Department> findAllDepartments();

	
   @Modifying
   @Transactional
   @Query("DELETE FROM Department d WHERE d.departmentId = :departmentId")
   void deleteByDepartmentId(@Param("departmentId") Integer departmentId);
   
   
   @Modifying
   @Transactional
   @Query("UPDATE Department d SET d.departmentName = :departmentName WHERE d.departmentId =:departmentId")
   void updateDepartment(@Param("departmentId") Integer departmentId, String departmentName);
}
	
	 

