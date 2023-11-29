package org.example;/*
package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class jsonemployee {
    public static void main(String[] args) {
        String jsonData = """
                {
                  "employees": [
                    {
                      "name": "Alice",
                      "age": 30,
                      "department": "Sales",
                      "sales": [1500, 1200, 1800, 2000]
                    },
                    {
                      "name": "Bob",
                      "age": 25,
                      "department": "Marketing",
                      "sales": [1000, 900, 1200, 1400]
                    },
                    {
                      "name": "Charlie",
                      "age": 28,
                      "department": "Sales",
                      "sales": [2000, 2100, 1900, 1800]
                    },
                    {
                      "name": "David",
                      "age": 32,
                      "department": "Marketing",
                      "sales": [1100, 950, 1350, 1200]
                    }
                  ]
                }
                """;

        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray employeesArray = jsonObject.getJSONArray("employees");




        // Task a
        Map<String, Integer> departmentSales = new HashMap<>();

        for (int i = 0; i < employeesArray.length(); i++)
        {
            JSONObject empObject = employeesArray.getJSONObject(i);
            String department = empObject.getString("department");
            int[] sales = empObject.getJSONArray("sales").toList().stream().mapToInt(o -> (int) o).toArray();
            int totalSales = 0;
            for (int sale : sales)
            {
                totalSales += sale;
            }
            departmentSales.put(department, departmentSales.getOrDefault(department, 0) + totalSales);
        }
        System.out.println("Total Sales for each department:");
        for (Map.Entry<String, Integer> entry : departmentSales.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }




        // Task b

        int highestTotalSales = departmentSales.values().stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("\nEmployee(s) with the highest total sales:");

        for (int i = 0; i < employeesArray.length(); i++)
        {
            JSONObject empObject = employeesArray.getJSONObject(i);
            int[] sales = empObject.getJSONArray("sales").toList().stream().mapToInt(o -> (int) o).toArray();
            int totalSales = 0;

            for (int sale : sales)
            {
                totalSales += sale;
            }
            if (totalSales == highestTotalSales)
            {
                System.out.println(empObject.getString("name"));
            }
        }

        // Task c
        Map<String, Double> departmentAvgAge = new HashMap<>();
        Map<String, Integer> departmentCount = new HashMap<>();

        for (int i = 0; i < employeesArray.length(); i++)
        {
            JSONObject empObject = employeesArray.getJSONObject(i);
            String department = empObject.getString("department");
            int age = empObject.getInt("age");
            departmentAvgAge.put(department, departmentAvgAge.getOrDefault(department, 0.0) + age);
            departmentCount.put(department, departmentCount.getOrDefault(department, 0) + 1);
        }
        System.out.println("\nAverage age of employees in each department:");
        for (Map.Entry<String, Double> entry : departmentAvgAge.entrySet())
        {
            double avgAge = entry.getValue() / departmentCount.get(entry.getKey());
            System.out.println(entry.getKey() + ": " + avgAge);
        }


        // Task d
        Map<String, Double> departmentAvgSales = new HashMap<>();

        for (int i = 0; i < employeesArray.length(); i++)
        {
            JSONObject empObject = employeesArray.getJSONObject(i);
            String department = empObject.getString("department");
            int[] sales = empObject.getJSONArray("sales").toList().stream().mapToInt(o -> (int) o).toArray();
            int totalSales = 0;
            for (int sale : sales)
            {
                totalSales += sale;
            }
            double avgSales = (double) totalSales / sales.length;
            departmentAvgSales.put(department, Math.max(departmentAvgSales.getOrDefault(department, 0.0), avgSales));
        }
        double highestAvgSales = departmentAvgSales.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);

        System.out.println("\nEmployee(s) with the highest average sales:");
        for (int i = 0; i < employeesArray.length(); i++)
        {
            JSONObject empObject = employeesArray.getJSONObject(i);
            int[] sales = empObject.getJSONArray("sales").toList().stream().mapToInt(o -> (int) o).toArray();
            int totalSales = 0;
            for (int sale : sales)
            {
                totalSales += sale;
            }
            double avgSales = (double) totalSales / sales.length;
            if (avgSales == highestAvgSales) {
                System.out.println(empObject.getString("name"));
            }
        }
    }
}
*/
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class jsonemployee
{
    public static void main(String[] args)
    {
        String jsonData = """
                {
                  "employees": [
                    {
                      "name": "Alice",
                      "age": 30,
                      "department": "Sales",
                      "sales": [1500, 1200, 1800, 2000]
                    },
                    {
                      "name": "Bob",
                      "age": 25,
                      "department": "Marketing",
                      "sales": [1000, 900, 1200, 1400]
                    },
                    {
                      "name": "Charlie",
                      "age": 28,
                      "department": "Sales",
                      "sales": [2000, 2100, 1900, 1800]
                    },
                    {
                      "name": "David",
                      "age": 32,
                      "department": "Marketing",
                      "sales": [1100, 950, 1350, 1200]
                    }
                  ]
                }
                """;

        JSONObject jsonObject = new JSONObject(jsonData);
        JSONArray employees = jsonObject.getJSONArray("employees");

        // Task a) Calculate and print the total sales for each department
        Map<String, Integer> departmentSales = new HashMap<>();
       // Map<String, double> departments = new HashMap<>();

        for (int i = 0; i < employees.length(); i++)
        {
            JSONObject empObject = employees.getJSONObject(i);
            String department = empObject.getString("department");
            JSONArray salesArray = empObject.getJSONArray("sales");

            int totalSales = 0;
            for (int j = 0; j < salesArray.length(); j++)
            {
                totalSales += salesArray.getInt(j);
            }

            departmentSales.put(department, departmentSales.getOrDefault(department, 0) + totalSales);
        }

        System.out.println("Total sales for each department:");
        for (Map.Entry<String, Integer> entry : departmentSales.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Task b) Find and print the name(s) of the employee(s) with the highest total sales
        int highestTotalSales = departmentSales.values().stream().mapToInt(Integer::intValue).max().orElse(0);
       // double highestTotalSales = departments.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);

        System.out.println("\nEmployee(s) with the highest total sales:");
        for (int i = 0; i < employees.length(); i++)
        {
            JSONObject empObject = employees.getJSONObject(i);
            JSONArray salesArray = empObject.getJSONArray("sales");

            int totalSales = 0;
            for (int j = 0; j < salesArray.length(); j++)
            {
                totalSales += salesArray.getInt(j);
            }

            if (totalSales <= highestTotalSales)
            {
                System.out.println(empObject.getString("name"));
            }
        }

        // Task c) Calculate and print the average age of employees in each department
        Map<String, Integer> departmentEmployeeCount = new HashMap<>();
        Map<String, Integer> departmentTotalAge = new HashMap<>();
        for (int i = 0; i < employees.length(); i++)
        {
            JSONObject empObject = employees.getJSONObject(i);
            String department = empObject.getString("department");
            int age = empObject.getInt("age");

            departmentEmployeeCount.put(department, departmentEmployeeCount.getOrDefault(department, 0) + 1);
            departmentTotalAge.put(department, departmentTotalAge.getOrDefault(department, 0) + age);
        }

        System.out.println("\nAverage age of employees in each department:");
        for (Map.Entry<String, Integer> entry : departmentTotalAge.entrySet())
        {
            String department = entry.getKey();
            int totalAge = entry.getValue();
            int employeeCount = departmentEmployeeCount.getOrDefault(department, 1); // Avoid division by zero
            double averageAge = (double) totalAge / employeeCount;
            System.out.println(department + ": " + averageAge);
        }

        // Task d) Find and print the name(s) of the employee(s) with the highest average sales
        Map<String, Double> employeeAverageSales = new HashMap<>();
        for (int i = 0; i < employees.length(); i++)
        {
            JSONObject empObject = employees.getJSONObject(i);
            String name = empObject.getString("name");
            JSONArray salesArray = empObject.getJSONArray("sales");

            int totalSales = 0;
            for (int j = 0; j < salesArray.length(); j++)
            {
                totalSales += salesArray.getInt(j);
            }

            double averageSales = (double) totalSales / salesArray.length();
            employeeAverageSales.put(name, averageSales);
        }

        double highestAverage = employeeAverageSales.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);
        System.out.println("\nEmployee(s) with the highest average sales:");
        for (Map.Entry<String, Double> entry : employeeAverageSales.entrySet())
        {
            if (entry.getValue() == highestAverage)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
