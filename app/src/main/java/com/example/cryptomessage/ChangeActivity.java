package com.example.cryptomessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cryptomessage.Model.User;
import com.google.android.material.button.MaterialButton;

public class ChangeActivity extends AppCompatActivity {

    Button aes,des,md5,rsa,twofish;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change);

        aes = findViewById(R.id.aes);
        des = findViewById(R.id.des);
        md5 = findViewById(R.id.md5);
        rsa = findViewById(R.id.rsa);
        twofish = findViewById(R.id.twofish);
        final Class<User> user = User.class;



        aes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChangeActivity.this,AESMainActivity.class);
                startActivity(intent);
            }
        });
    }
}