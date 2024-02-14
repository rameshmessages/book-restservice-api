package com.lstech.bookreact.controller;

import com.lstech.bookreact.model.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EmployeeController {
    private List<Employee> employees = createEmpList();
    @RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
    public List<Employee> getEmployees()
    {
        return employees;
    }

    private List<Employee> createEmpList() {
        List<Employee> tempEmps = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("Dinesh");
        emp1.setId(1);
        emp1.setDepartment("HR");

        Employee emp2 = new Employee();
        emp2.setName("Vaagish");
        emp2.setId(2);
        emp2.setDepartment("Finance");

        tempEmps.add(emp1);
        tempEmps.add(emp2);

        return tempEmps;
    }

}
