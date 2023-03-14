package com.globalhr.datajdbchrproject.repository;

import com.globalhr.datajdbchrproject.entity.Employee;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
    List<Employee> findByName (String name);
    @Modifying
    @Query(value = "update employees set salary = :salary where id= :id")
    int updateEmpByIdAndSalary(Double salary,Integer id);
}
