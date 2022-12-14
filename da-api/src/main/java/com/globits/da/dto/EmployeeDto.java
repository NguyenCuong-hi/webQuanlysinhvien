package com.globits.da.dto;


import com.globits.core.dto.BaseObjectDto;

import java.util.UUID;

public class EmployeeDto extends BaseObjectDto {
    private String code;
    private  String name;
    private String email;
    private String phone;
    private int age;
    private UUID provinceId;
    private UUID districtId;
    private UUID communeId;

    public EmployeeDto(EmployeeDto EmployeeEntity) {

    }
    public EmployeeDto()
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public UUID getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(UUID provinceId) {
        this.provinceId = provinceId;
    }

    public UUID getDistrictId() {
        return districtId;
    }
    public UUID getCommuneId(){
        return communeId;
    }

    public void setDistrictId(UUID districtId) {
        this.districtId = districtId;
    }

    public UUID getCommuneId(UUID uuid) {
        return communeId;
    }

    public void setCommuneId(UUID communeId) {
        this.communeId = communeId;
    }
    public String toString()
    {
        return "," + code+","+ name + "," + email + "," +phone +"," +age;
    }
}
