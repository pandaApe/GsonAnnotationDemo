package com.pandaape.gsonannotationdemo;

import com.google.gson.annotations.Expose;

import java.util.Date;

/**
 * Description:
 *
 * @Author: PandaApe.
 * @CreatedAt: 26/3/16 00:37.
 * @Email: whailong2010@gmail.com
 */
public class People {

    @Expose(serialize = false, deserialize = false)
    private String objectId;

    @Expose
    private String name;

    @Expose(serialize = true, deserialize = false)
    private String sex;

    @Expose(serialize = false, deserialize = true)
    private int age;

    private Date updateDate;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append("objectId=").append(getObjectId()).append("\n");
        sb.append("name=").append(getName()).append("\n");
        sb.append("sex=").append(getSex()).append("\n");
        sb.append("age=").append(getAge()).append("\n");
        sb.append("updateDate=").append(getUpdateDate()).append("\n");

        return sb.toString();
    }
}
