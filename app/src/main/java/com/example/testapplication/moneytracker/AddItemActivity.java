package com.example.testapplication.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddItemActivity extends AppCompatActivity {

    private static final String TAG = "AddItemActivity";
    private EditText name;
    private EditText price;
    private ImageButton addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);
        setTitle( R.string.addItemHeader );

        name = findViewById( R.id.itemName );
        price = findViewById( R.id.itemPrice );
        addBtn = findViewById( R.id.itemAdd );

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i(TAG, "onTextChanged: " + s );
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = name.getText().toString();
            }
        });
    }
}
