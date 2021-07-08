package com.example.we_part;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intviews();
        buildStudentList();
        setRecylerView();
    }

    private void buildStudentList() {
        studentList = new ArrayList<>();
        Student student1 = new Student("Anush", 22, "EMP123");
        studentList.add(student1);
        Student student2 = new Student("Kunal", 25, "EMP126");
        studentList.add(student2);
        for (int i = 0; i < 13; i++) {
            Student student = new Student("XYZ" + i, 21, "EMP125");
            studentList.add(student);
        }
    }

    private void setRecylerView(){
        StudentAdaptorClass studentAdaptorClass = new StudentAdaptorClass(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdaptorClass);
    }

    private void intviews() {
        recyclerView = findViewById(R.id.recyclerview);

    }
}