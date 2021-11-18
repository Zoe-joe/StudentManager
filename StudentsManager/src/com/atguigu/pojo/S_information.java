package com.atguigu.pojo;

public class S_information {
    private Integer id;
    private String studentID;
    private String username;
    private String  sex;
    private String  major;
    private String  grade;
    private String  number;
    private String  email;
    private String  address;
    private String  img="static/img/default.png";

    public S_information() {
    }

    public S_information(Integer id, String studentID, String username, String sex, String major, String grade, String number, String email, String address, String img) {
        this.id = id;
        this.studentID = studentID;
        this.username = username;
        this.sex = sex;
        this.major = major;
        this.grade = grade;
        this.number = number;
        this.email = email;
        this.address = address;
        if(this.img!=null && !"".equals(this.img)) {
            this.img = img;
        }
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
        if(this.img!=null && !"".equals(this.img)) {
            this.img = img;
        }
    }

    @Override
    public String toString() {
        return "S_information{" +
                "id=" + id +
                ", studentID='" + studentID + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
