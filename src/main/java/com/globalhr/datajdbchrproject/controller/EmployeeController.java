package com.globalhr.datajdbchrproject.controller;

import com.globalhr.datajdbchrproject.entity.Employee;
import com.globalhr.datajdbchrproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/countEmployees")
    public Long countEmp(){

        return employeeService.countEmp();
    }
    @GetMapping("/findEmployees")
    public Iterable<Employee> findEmp(){
        return employeeService.findEmp();
    }
    @GetMapping("/findEmployeesByID/{id}")
    public Employee findEmpByID(@PathVariable Integer id){
        return employeeService.findEmpByID(id);
    }
    @PostMapping("/addEmployee")
    public Employee addEmp(@RequestBody Employee employee){
        return employeeService.addEmp(employee);

    }
    @PutMapping("/updateEmployee")
    public Employee updateEmp(@RequestBody Employee employee){
        return employeeService.updateEmp(employee);

    }
    @GetMapping("/findEmployeesByName/{name}")
    public List<Employee> findEmpByName(@PathVariable String name){
        return employeeService.findEmpByName(name);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteById(@PathVariable  Integer id){
        employeeService.deleteById(id);
    }
    @PutMapping("/updateEmpByIdAndSalary")
    public int updateEmpByIdAndSalary(@RequestParam Double salary,@RequestParam Integer id){
        return employeeService.updateEmpByIdAndSalary(salary,id);
    }
}
