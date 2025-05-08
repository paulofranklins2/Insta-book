package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee = new Employee("123456", "John", "IT", 100, 40);

    @Test
    void getEmployeeId() {
        assertEquals("123456", employee.getEmployeeId());
    }

    @Test
    void setEmployeeId() {
        employee.setEmployeeId("654321");
        assertEquals("654321", employee.getEmployeeId());
    }

    @Test
    void getName() {
        assertEquals("John", employee.getName());
    }

    @Test
    void setName() {
        employee.setName("Jane");
        assertEquals("Jane", employee.getName());
    }

    @Test
    void getDepartment() {
        assertEquals("IT", employee.getDepartment());
    }

    @Test
    void setDepartment() {
        employee.setDepartment("HR");
        assertEquals("HR", employee.getDepartment());
    }

    @Test
    void getPayRate() {
        assertEquals(100, employee.getPayRate());
    }

    @Test
    void setPayRate() {
        employee.setPayRate(120);
        assertEquals(120, employee.getPayRate());
    }

    @Test
    void getHoursWorked() {
        assertEquals(40, employee.getHoursWorked());
    }

    @Test
    void setHoursWorked() {
        employee.setHoursWorked(50);
        assertEquals(50, employee.getHoursWorked());
    }

    @Test
    void getRegularHours() {
        assertEquals(40, employee.getRegularHours());
    }

    @Test
    void getOvertimeHours() {
        assertEquals(0, employee.getOvertimeHours());
    }

    @Test
    void getTotalPay() {
        assertEquals(4000, employee.getTotalPay());
    }

    @Test
    void punchIn() {
        employee.punchIn(10);
        assertEquals(10, employee.getStartTime());
    }

    @Test
    void punchOut() {
        employee.punchOut(11);
        assertEquals(51, employee.getHoursWorked());
    }
}