package com.example.we_part;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {

    private TextView mtvName;
    private TextView mtvAge;
    private TextView mtvRollNo;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        iniviews(itemView);

    }

    private void iniviews(View itemview) {
        mtvName = itemview.findViewById(R.id.tvName);
        mtvAge = itemview.findViewById(R.id.tvAge);
        mtvRollNo = itemview.findViewById(R.id.tvRollNo);
    }

    public void setData(Student student) {
        mtvName.setText(student.getName());
        mtvRollNo.setText(student.getRollNo());
        mtvAge.setText(student.getAge()+ " ");
    }
}
