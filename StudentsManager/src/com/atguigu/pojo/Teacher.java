package com.atguigu.pojo;

public class Teacher {
    private Integer id;
    private String teacherID;
    private String username;
    private String sex;
    private String major;
    private String grade;
    private String number;
    private String email;
    private String address;
    private String img;
    private String teach;

    public Teacher() {
    }

    public Teacher(Integer id, String teacherID, String username, String sex, String major, String grade, String number, String email, String address, String img, String teach) {
        this.id = id;
        this.teacherID = teacherID;
        this.username = username;
        this.sex = sex;
        this.major = major;
        this.grade = grade;
        this.number = number;
        this.email = email;
        this.address = address;
        this.img = img;
        this.teach = teach;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherID='" + teacherID + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", img='" + img + '\'' +
                ", teach='" + teach + '\'' +
                '}';
    }
}
