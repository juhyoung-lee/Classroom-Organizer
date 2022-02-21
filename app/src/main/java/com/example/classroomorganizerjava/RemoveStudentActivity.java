package com.example.classroomorganizerjava;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RemoveStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_student);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = "Page for removing students";

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.remove_student_textview);
        textView.setText(message);
    }
}