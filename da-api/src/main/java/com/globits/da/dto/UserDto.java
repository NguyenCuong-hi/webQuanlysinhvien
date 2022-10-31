package com.globits.da.dto;

public class UserDto {
    private String code;
    private String name;
    private int age;

    public UserDto(String code, String name,int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }
    public UserDto()
    {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  String toString()
    {
        return code +","+ name +"," + age;
    }
}
