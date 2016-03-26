package com.pandaape.gsonannotationdemo;

import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;

/**
 * Description:
 *
 * @Author: PandaApe.
 * @CreatedAt: 26/3/16 21:57.
 * @Email: whailong2010@gmail.com
 */
public class Student {

    @Until(0.3)
    private String stNo;

    @Since(0.4)
    private String studentNo;

    private String name;

    private int score;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("stNo=").append(getStNo()).append(",\n");
        sb.append("studentNo=").append(getStudentNo()).append(",\n");
        sb.append("name=").append(getName()).append(",\n");
        sb.append("score=").append(getScore()).append(",\n");
        return sb.toString();
    }

    public String getStNo() {
        return stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}