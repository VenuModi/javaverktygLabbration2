package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    Employee employee = new Employee("Kalle", 500000.00);

    @Test
    void checkGetIdReturnsIdTest(){
        var id = "Kalle";
        assertEquals(employee.getId(), id);
    }

    @Test
    void checkSetIdTest(){
        var id = "Martin";
        employee.setId(id);
        assertEquals(employee.getId(), id);
    }

    @Test
    void checkGetSalaryReturnsSalaryTest(){
        var salary = 500000.00;
        assertEquals(employee.getSalary(), salary);
    }

    @Test
    void CheckIfSalaryIsSetForEmployee(){
        var salary = 300000.00;
        employee.setSalary(salary);
        assertEquals(employee.getSalary(), salary);
    }

    @Test
    void checkIfSalaryIsPaid(){
        var paid = true;
        employee.setPaid(true);
        assertEquals(employee.isPaid(), paid);
    }

    @Test
    void checkIfIdAndSalaryIsToString(){
        var res = employee.toString();
        assertEquals("Employee [id=Kalle, salary=500000.0]", res);
    }
}
