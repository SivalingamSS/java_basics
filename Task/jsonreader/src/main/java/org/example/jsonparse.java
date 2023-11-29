package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonparse
{
    public static void main(String[] args)
    {
        String jsonData = """
                {
                    "employees": [
                        {
                            "id": 1,
                            "name": "MichaelJohnson",
                            "department": "HR",
                            "salary": 50000
                        },
                        {
                            "id": 2,
                            "name": "JaneSmith",
                            "department": "Finance",
                            "salary": 60000
                        },
                        {
                            "id": 3,
                            "name": "JohnDoe",
                            "department": "IT",
                            "salary": 75000
                        }
                    ]
                }
                """;

        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray employeesArray = jsonObject.getJSONArray("employees");


        int totalSalary = 0;
        int highestSalary = Integer.MIN_VALUE;
        int lowestSalary = Integer.MAX_VALUE;
        String employeeWithHighestSalary = "";
        String employeeWithLowestSalary = "";
        StringBuilder sortedNames = new StringBuilder();

        for (int i = 0; i < employeesArray.length(); i++)
        {
            JSONObject empObject = employeesArray.getJSONObject(i);
            int salary = empObject.getInt("salary");
            totalSalary += salary;

            if (salary > highestSalary)
            {
                highestSalary = salary;
                employeeWithHighestSalary = empObject.getString("name");
            }

            if (salary < lowestSalary)
            {
                lowestSalary = salary;
                employeeWithLowestSalary = empObject.getString("name");
            }

            sortedNames.append(empObject.getString("name")).append(" ");
        }

        System.out.println("Total salary  all employees: " + totalSalary);
        System.out.println("Employee with  highest salary: " + employeeWithHighestSalary);
        System.out.println("Employee with  lowest salary: " + employeeWithLowestSalary);

        String[] namesArray = sortedNames.toString().trim().split(" ");
        java.util.Arrays.sort(namesArray);
        System.out.println("Names of all employees sorted alphabetically: " + String.join(" ,", namesArray));
    }
}
