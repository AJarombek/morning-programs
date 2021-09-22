/**
 * https://leetcode.com/problems/employee-importance/
 * @author Andrew Jarombek
 * @since 9/22/2021
 */

import java.util.*;

public class EmployeeImportance {
    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        for (Employee employee : employees) {
            employeeMap.put(employee.id, employee);
        }

        Deque<Employee> queue = new ArrayDeque<>();
        queue.addLast(employeeMap.get(id));

        int importance = 0;

        while (queue.size() > 0) {
            Employee employee = queue.removeFirst();
            importance += employee.importance;

            for (int employeeId: employee.subordinates) {
                queue.addLast(employeeMap.get(employeeId));
            }
        }

        return importance;
    }
}
