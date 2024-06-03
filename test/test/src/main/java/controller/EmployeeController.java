package controller;

import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.EmployeeService;

@RequestMapping("/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/test")
    public ResponseEntity<?> get(){
        employeeService.test();
        return new ResponseEntity<>(HttpStatusCode.valueOf(404));
    }
}
