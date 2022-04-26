package com.syntaxerror.Student.service.MYSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntaxerror.Student.repository.StudentRepository;
import com.syntaxerror.Student.service.StudentService;

@Service
public class StudentServiceMySQL
    implements StudentService
{

    private final StudentRepository studentsRepository;

    public StudentServiceMySQL( @Autowired StudentRepository studentsRepository )
    {
        this.StudentRepository = studentsRepository;
    }

    @Override
    public Iterable<Student> all()
    {
        return StudentRepository.findAll();
    }

    @Override
    public Student get( int studentId )
    {
        return StudentRepository.findById( studentId );
    }

    @Override
    public void save( Student student )
    {
        StudentRepository.save( student );
    }

    @Override
    public void delete( int studentId )
    {
        StudentRepository.deleteById( studentId );
    }
}