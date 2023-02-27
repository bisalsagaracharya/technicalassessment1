package com.employee.demo.employeeApp.repository;
import com.employee.demo.employeeApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //@Query("SELECT e From Employee  e JOIN e.department d WHERE d.deptName= :c") //native sql query
    @Query("From Employee where department.deptName= :deptName") //JPQL
    List<Employee> findByDepartmentName(@Param("deptName") String deptName);
    @Query("From Employee where firstName= :firstName")
    List<Employee> findEmployeeByFirstName(@Param("firstName") String firstName);










//    @Transactional //select,update,delete
//    @Modifying
//    @Query("SELECT e From Employee  e JOIN e.projects p WHERE p.projectId= :j")
//    List<Employee> findByProjectId(@Param("j") int projectId);

    //    @Modifying
//    @Query(value ="insert into Employee(firstName, lastName, birthdate, cellphone,department) values (:firstName, :lastName, :birthdate, :cellphone,:department)",
//            nativeQuery = true)
//    Employee insertEmployee(@Param("firstName") String firstName, @Param("lastName") String lastName,
//                        @Param("birthdate") String birthDate, @Param("cellphone") String cellphone, @Param("department")Department department);



}
