package com.codegym.c0324h1_2.services.impl;

import com.codegym.c0324h1_2.models.Student;
import com.codegym.c0324h1_2.repositories.IStudentRepository;
import com.codegym.c0324h1_2.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public void updateById(Long id, Student student) {
        studentRepository.updateById(id,student);
    }


}
