package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

    public class jsonuniversity
    {
        public static void main(String[] args)
        {
            String jsonData = """
                        {
                           "university": "ABC University",
                           "location": "City XYZ",
                           "courses": [
                             {
                               "course_name": "Computer Science",
                               "duration": "4 years",
                               "professors": [
                                 {
                                   "name": "Professor A",
                                   "age": 40,
                                   "specialization": "Algorithms"
                                 },
                                 {
                                   "name": "Professor B",
                                   "age": 35,
                                   "specialization": "Database Systems"
                                 }
                               ],
                               "students": [
                                 {
                                   "name": "Alice",
                                   "age": 20,
                                   "semester": 6
                                 },
                                 {
                                   "name": "Bob",
                                   "age": 22,
                                   "semester": 8
                                 }
                               ]
                             },
                             {
                               "course_name": "Electrical Engineering",
                               "duration": "5 years",
                               "professors": [
                                 {
                                   "name": "Professor C",
                                   "age": 45,
                                   "specialization": "Power Systems"
                                 },
                                 {
                                   "name": "Professor D",
                                   "age": 38,
                                   "specialization": "Control Systems"
                                 }
                               ],
                               "students": [
                                 {
                                   "name": "Charlie",
                                   "age": 19,
                                   "semester": 3
                                 },
                                 {
                                   "name": "David",
                                   "age": 21,
                                   "semester": 4
                                 }
                               ]
                             }
                           ]
                         }
                    """;

            JSONObject universityData = new JSONObject(jsonData);

            // Task 1
            String universityName = universityData.getString("university");
            String location = universityData.getString("location");
            System.out.println("University: " + universityName);
            System.out.println("Location: " + location);


            // Task 2
            JSONArray coursesArray = universityData.getJSONArray("courses");
            System.out.println("\nCourse Details:");
            for (int i = 0; i < coursesArray.length(); i++)
            {
                JSONObject course = coursesArray.getJSONObject(i);
                String courseName = course.getString("course_name");
                String duration = course.getString("duration");
                System.out.println(courseName + ": " + duration);
            }



            // Task 3
            System.out.println("\nAverage age of professors for each course:");
            for (int i = 0; i < coursesArray.length(); i++)
            {
                JSONObject course = coursesArray.getJSONObject(i);
                JSONArray professors = course.getJSONArray("professors");

                int totalAge = 0;
                for (int j = 0; j < professors.length(); j++)
                {
                    JSONObject professor = professors.getJSONObject(j);
                    int age = professor.getInt("age");
                    totalAge += age;



                }
                double averageAge = (double) totalAge / professors.length();
                String courseName = course.getString("course_name");
                System.out.println(courseName + ": " + averageAge);

            }


            // Task 4
            System.out.println("\nAverage age of students for each course:");
            for (int i = 0; i < coursesArray.length(); i++)
            {
                JSONObject course = coursesArray.getJSONObject(i);
                JSONArray students = course.getJSONArray("students");
                int totalAge = 0;
                for (int j = 0; j < students.length(); j++)
                {
                    JSONObject student = students.getJSONObject(j);
                    int age = student.getInt("age");
                    totalAge += age;
                }
                double averageAge = (double) totalAge / students.length();
                String courseName = course.getString("course_name");
                System.out.println(courseName + ": " + averageAge);
            }


            // Task 5
            System.out.println("\nProfessors specializing in Algorithms:");
            for (int i = 0; i < coursesArray.length(); i++)
            {
                JSONObject course = coursesArray.getJSONObject(i);
                JSONArray professors = course.getJSONArray("professors");
                for (int j = 0; j < professors.length(); j++)
                {
                    JSONObject professor = professors.getJSONObject(j);
                    String specialization = professor.getString("specialization");
                    if (specialization.equals("Algorithms"))
                    {
                        String professorName = professor.getString("name");
                        System.out.println(professorName);
                    }
                }
            }

            // Task 6: Find and print the name(s) of the student(s) who are in the highest semester for each course
            System.out.println("\nStudent(s) in the highest semester for each course:");
            for (int i = 0; i < coursesArray.length(); i++)
            {
                JSONObject course = coursesArray.getJSONObject(i);
                JSONArray students = course.getJSONArray("students");
                int maxSemester = Integer.MIN_VALUE;
                for (int j = 0; j < students.length(); j++)
                {
                    JSONObject student = students.getJSONObject(j);
                    int semester = student.getInt("semester");
                    maxSemester = Math.max(maxSemester, semester);
                }
                for (int j = 0; j < students.length(); j++)
                {
                    JSONObject student = students.getJSONObject(j);
                    int semester = student.getInt("semester");
                    if (semester == maxSemester)
                    {
                        String studentName = student.getString("name");
                        System.out.println(studentName + " (Course: " + course.getString("course_name") + ")");
                    }
                }
            }
        }
    }


