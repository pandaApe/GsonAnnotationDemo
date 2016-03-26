package com.pandaape.gsonannotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView tvResults;

    private int switchFlag = 1;


    public void exposeTest(View view) {

        People people = new People();
        people.setObjectId("1");
        people.setAge(18);
        people.setName("XiaoMing");
        people.setSex("男");
        people.setUpdateDate(new Date());

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();

        Gson gson = gsonBuilder.create();
        String jsonStr = new Gson().toJson(people);

        People p = gson.fromJson(jsonStr, People.class);

        String logStr = "Java 实例：\n" + people + "\n不加注解时的JSON:\n" + jsonStr + "\n\n加注解后的JSON:\n" + gson.toJson(people) + "\n\n加注解后进行反序列化:\n" + p;
        Log.d(MainActivity.class.getSimpleName() + "--> ", logStr);
        tvResults.setText(logStr);
    }

    public void versionTest(View view) {

        Student student = new Student();
        student.setName("HanMeiMei");
        student.setScore(60);
        student.setStNo("001");
        student.setStudentNo("001");

        GsonBuilder gsonBuilder = new GsonBuilder();
        String versionStr;
        if (switchFlag > 0) {
            gsonBuilder.setVersion(0.2);
            versionStr = "0.2";
            ((Button) view).setText("Versioning 0.4");
        } else {
            versionStr = "0.4";
            gsonBuilder.setVersion(0.4);
            ((Button) view).setText("Versioning 0.2");
        }

        switchFlag *= -1;

        Gson gson = gsonBuilder.create();

        String jsonStr = "Student实例的各属性值：\n" + student + "\n不加注解的JSON:\n" + new Gson().toJson(student) + "\n\n" + versionStr + " 版本JSON:\n" + gson.toJson(student);

        tvResults.setText(jsonStr);
    }

    public void SerializedNameTest(View view) {

        Car car = new Car();
        car.setBrand("BMW");
        car.setEngineModel("bt7320xe");

        String jsonStr = "Car实例中各属性的值：\n" + car + "\n\n加注解后JSON:\n" + new Gson().toJson(car);
        tvResults.setText(jsonStr);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvResults = (TextView) findViewById(R.id.tvDisplay);
    }
}
