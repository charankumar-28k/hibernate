package com.example.main;

import java.util.Scanner;

import com.example.dao.StudentDAO;
import com.example.entity.Student;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Student Management System =====");

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        Student student = new Student(
                id,
                name,
                age,
                department
        );

        StudentDAO studentDAO = new StudentDAO();

        studentDAO.saveStudent(student);

        scanner.close();

        System.out.println("====================================");
        System.out.println("Program completed.");
    }
}