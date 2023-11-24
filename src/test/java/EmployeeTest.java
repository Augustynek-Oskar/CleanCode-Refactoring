import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getTotalSalary() {
        Employee employee = new Employee("Jan", "Kowalski", 30, 3000, 500);
        float result = employee.getTotalSalary();
        Assertions.assertEquals(3500, result);
    }

    @Test
    void getBaseSalary() {
        Employee employee = new Employee("Jan", "Kowalski", 30, 3000, 500);
        float result = employee.getBaseSalary();
        Assertions.assertEquals(3000, result);
    }

    @Test
    void getBonus() {
        Employee employee = new Employee("Jan", "Kowalski", 30, 3000, 500);
        float result = employee.getBonus();
        Assertions.assertEquals(500, result);
    }

    @Test
    void getShortDescriptionOfEmployee() {
        Employee employee = new Employee("Jan", "Kowalski", 30, 3000, 500);
        String result = employee.getShortDescriptionOfEmployee();
        Assertions.assertEquals("Employee name: Jan Kowalski", result);
    }

    @Test
    void getLongDescriptionOfEmployee() {
        Employee employee = new Employee("Jan", "Kowalski", 30, 3000, 500);
        String result = employee.getLongDescriptionOfEmployee();
        Assertions.assertEquals("Employee details: Jan Kowalski is 30", result);
    }
}