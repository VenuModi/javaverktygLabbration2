package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;

public class EmployeesTest {
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    BankService bankService = Mockito.mock(BankService.class);
    Employees employees = new Employees(employeeRepository, bankService);

    Employee employee1 = new Employee("Kalle", 500000);
    Employee employee2 = new Employee("Anki", 300000);
    Employee employee3 = new Employee("Leo", 600000);

    @BeforeEach
    void initTest(){
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }

    @Test
    void checkIfEmployee1GetsPaid(){
        employees.payEmployees();
        assertTrue(employeeRepository.findAll().get(0).isPaid());
    }

    @Test
    void checkIfEmployee2GetsPaid(){
        employees.payEmployees();
        assertTrue(employeeRepository.findAll().get(1).isPaid());
    }

    @Test
    void checkIfEmployee3GetsPaid(){
        employees.payEmployees();
        assertTrue(employeeRepository.findAll().get(2).isPaid());
    }

    @Test
    void checkIfEmployeeNotPaid(){
        doThrow(RuntimeException.class)
                .when(bankService)
                .pay(employee3.getId(), employee3.getSalary());

        employees.payEmployees();
        assertFalse(employee3.isPaid());
    }
}
