package com.JpqlCodingChelange.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.JpqlCodingChelange.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
   
    @Query("Select emp from Employee emp where emp.firstName=?1")
      List<Employee> findByFirstName(String firstName);
   
    @Query("SELECT emp FROM Employee emp WHERE emp.employeeId = ?1")
	Employee findEmployeeByEmployeeId(Integer employeeId);
    
    @Query("SELECT emp FROM Employee emp")
	List<Employee> findAllEmployee();

	List<Employee> findByFirstNameContaining(String firstName);
	
    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e WHERE e.employeeId = :employeeId")
    void deleteByEmployeeId(@Param("employeeId") Integer employeeId);
    
//    private Integer employeeId;
//    private String firstName;
//    private String lastName;
//    private String birthdate;
//    private  Long cellphone;
//   
    
//    @Modifying
//    @Transactional
//    @Query("UPDATE Employee e SET e.firstName = :firstName WHERE e.employeeId = :employeeId")
//    void updateEmployee(@Param("employeeId") Integer employeeId, @Param("firstName") String firstName);
//    
    @Modifying
    @Transactional
    @Query("UPDATE Employee emp SET emp.firstName = :firstName,emp.lastName =:lastName,emp.birthdate =:birthdate,emp.cellphone =:cellphone  WHERE emp.employeeId =:employeeId")
    void updateEmployee(@Param("employeeId") Integer employeeId, String firstName ,String lastName ,String birthdate ,Long cellphone);
}
