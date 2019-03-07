package ums.vo;

public class UserVo {
    String name;
    String pass;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserVo() {
    }

    public UserVo(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public UserVo(String name, String pass, Integer age) {
        this.name = name;
        this.pass = pass;
        this.age = age;
    }
}
