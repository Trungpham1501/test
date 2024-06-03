package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void test(){
        employeeRepository.findById(1L);
    }
}
