package com.example.ramana.employeeapp.controller;

import com.example.ramana.employeeapp.model.EmployeModel;
import com.example.ramana.employeeapp.repositary.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/@RequestMapping
public class EmployeControl
{
    @Autowired
    EmployeRepo employeRepo;

    @PostMapping("create")
    public void create(@RequestBody EmployeModel employeModel)
    {
        employeRepo.save(employeModel);

    }

    @GetMapping("/retreve", consumes =MediaType.TEXT_PLAIN_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeModel> employeDetails(@PathVariable int id)
    {
        List<EmployeModel> employeModelList = employeRepo.findAll();
        EmployeModel emp;
        emp = employeModelList.get(id);
        if (emp.getLocation() == "Banglore")
        {

            emp.setSalary(emp.getSalary() * 2);


        }            return employeModelList;
    }
}






