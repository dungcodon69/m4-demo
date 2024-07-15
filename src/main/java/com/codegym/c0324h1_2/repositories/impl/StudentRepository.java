package com.codegym.c0324h1_2.repositories.impl;

import com.codegym.c0324h1_2.models.Student;
import com.codegym.c0324h1_2.repositories.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1L, "haiTT","QN", 9.0f));
        students.add(new Student(2L, "haiTT2","QN", 9.0f));
        students.add(new Student(3L, "haiTT3","QN", 9.0f));

    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        student.setId(students.get(students.size()-1).getId() + 1);
        students.add(student);
    }

    @Override
    public Student findStudentById(Long id) {
        for (Student s: students){
            if (s.getId() == id) return s;
        }
        return null;
    }

    @Override
    public void updateById(Long id, Student student) {
        Student s = findStudentById(id);
        s.setName(student.getName());
        s.setAddress(student.getAddress());
        s.setScore(student.getScore());
    }
}
