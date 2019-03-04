package com.example.miedadcanina;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView answerTest = (TextView) findViewById(R.id.answer_text);
        answerTest.setText("Tu edad canina es");
        ImageView dogImage = (ImageView) findViewById(R.id.dog_image);
        dogImage.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.perrito));
        final EditText myEdad = (EditText) findViewById(R.id.my_Edad);
        Button myButton = (Button)  findViewById(R.id.my_button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Edad = myEdad.getText().toString();
                int iEdad = Integer.parseInt(Edad);
                myEdad.setText("Tu edad canina es " + iEdad *6);
            }
        });
    }
}
