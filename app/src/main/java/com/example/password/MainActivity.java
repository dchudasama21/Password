package com.example.password;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


import com.example.library.TogglePassword;

public class MainActivity extends AppCompatActivity {

    private EditText et_password;
    private ImageView img_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_password=findViewById(R.id.et_password);
        img_icon=findViewById(R.id.img_icon);

        img_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TogglePassword.Passcode(MainActivity.this,img_icon,et_password,R.drawable.ic_show_pass,R.drawable.ic_hide_pass);
            }
        });
    }
}