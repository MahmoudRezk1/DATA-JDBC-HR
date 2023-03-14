package com.globalhr.datajdbchrproject.controller;

import com.globalhr.datajdbchrproject.entity.Employee;
import com.globalhr.datajdbchrproject.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;
    @GetMapping("/countEmployees")
    public Long countEmp(){

        return this.employeeRepo.count();
    }
    @GetMapping("/findEmployees")
    public Iterable<Employee> findEmp(){
        return this.employeeRepo.findAll();
    }
    @GetMapping("/findEmployeesByID/{id}")
    public Employee findEmpByID(@PathVariable Integer id){
        Optional<Employee> emp= employeeRepo.findById(id);
        if(emp.isPresent())
        return emp.get();
        else return null;
    }
    @GetMapping("/addEmployee")
    public Employee addEmp(){
        return employeeRepo.save(new Employee("sahar",6000.0));

    }
    @GetMapping("/updateEmployee")
    public Employee updateEmp(){
        return employeeRepo.save(new Employee(5,"sahar",8000.0));

    }
    @GetMapping("/findEmployeesByName/{name}")
    public List<Employee> findEmpByName(@PathVariable String name){
        return this.employeeRepo.findByName(name);
    }
}
