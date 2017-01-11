package com.example.lenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstName, secondName, email, phone;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = (EditText) findViewById(R.id.et_fname);
        secondName = (EditText) findViewById(R.id.et_sname);
        email = (EditText) findViewById(R.id.et_email);
        phone = (EditText) findViewById(R.id.et_phone);
        submitButton = (Button) findViewById(R.id.bt_submit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                User user = new User();
                user.setFirstName(firstName.getText().toString());
                user.setSecondName(secondName.getText().toString());
                user.setEmail(email.getText().toString());
                user.setPhone(phone.getText().toString());

                intent.putExtra("userData", user);
                startActivity(intent);
            }
        });
    }
}
