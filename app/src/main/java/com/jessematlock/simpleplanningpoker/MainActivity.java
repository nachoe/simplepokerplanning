package com.jessematlock.simpleplanningpoker;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        Button btn = (Button)view;
        String display = "display_number";
        Intent intent = new Intent(view.getContext(), DisplayNumberActivity.class);
        intent.putExtra(display, btn.getText());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
