package com.atguigu.pojo;

public class Root {
    private Integer id;
    private String rootID;
    private String username;
    private String number;
    private String email;
    private String img;

    public Root() {
    }

    public Root(Integer id, String rootID, String username, String number, String email, String img) {
        this.id = id;
        this.rootID = rootID;
        this.username = username;
        this.number = number;
        this.email = email;
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRootID() {
        return rootID;
    }

    public void setRootID(String rootID) {
        this.rootID = rootID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Root{" +
                "id=" + id +
                ", rootID='" + rootID + '\'' +
                ", username='" + username + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
