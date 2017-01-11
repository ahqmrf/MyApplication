package com.example.lenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        content = (TextView) findViewById(R.id.tv_content);

        User user = (User) getIntent().getParcelableExtra("userData");

        String contentText = user.getFirstName() + "\n\n"
                + user.getSecondName() + "\n\n"
                + user.getEmail() + "\n\n"
                + user.getPhone();

        content.setText(contentText);
    }
}
