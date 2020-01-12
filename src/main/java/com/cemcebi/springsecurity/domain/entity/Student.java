package com.cemcebi.springsecurity.domain.entity;

public class Student {

    private Long studentId;
    private String StudentName;

    public Student(Long studentId, String studentName) {
        this.studentId = studentId;
        StudentName = studentName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}
