package com.atguigu.pojo;

public class ScoreList {
    private Integer id;
    private String studentID;
    private String username;
    private String subject;
    private String major;
    private String grade;
    private String score;
    private String teacher;

    public ScoreList() {
    }

    public ScoreList(Integer id, String studentID, String username, String subject, String major, String grade, String score, String teacher) {
        this.id = id;
        this.studentID = studentID;
        this.username = username;
        this.subject = subject;
        this.major = major;
        this.grade = grade;
        this.score = score;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "ScoreList{" +
                "id=" + id +
                ", studentID='" + studentID + '\'' +
                ", username='" + username + '\'' +
                ", subject='" + subject + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", score='" + score + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}