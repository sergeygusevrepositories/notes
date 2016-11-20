package com.example.sergey.notes.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sergey.notes.R;

public class AddNoteActivity extends AppCompatActivity {

    public static Intent newInstance (Context context) {
        return new Intent(context, AddNoteActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_text);
    }
}
