package com.ibay.janrafael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editName, editAge, editGender;
    Button btnSave, btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText)findViewById(R.id.editName);
        editAge = (EditText)findViewById(R.id.editAge);
        editGender = (EditText)findViewById(R.id.editGen);
        btnSave = (Button)findViewById(R.id.save);
        btnSearch = (Button)findViewById(R.id.search);

    }
}
