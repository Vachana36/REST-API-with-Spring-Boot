package com.syntaxerror.Student.service;


public interface StudentService
{

    Iterable<Student> all();

    Student get( int studentId );

    void save( Student student );

    void delete( int studentId );
}