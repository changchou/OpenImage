package com.jikexueyuan.openimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView imageView = new ImageView(this);
        setContentView(imageView);

        try {
            imageView.setImageURI(getIntent().getData());
        }catch (Exception ex){
            Toast.makeText(this, "不能打开图片", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
