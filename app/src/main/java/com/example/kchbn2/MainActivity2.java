package com.example.kchbn2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageButton imageButton;
    TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView3 = findViewById(R.id.textView3);
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        double a = bundle.getDouble("Chiều cao");
        double b = bundle.getDouble("Cân nặng");
        String ketqua;
        if ((a/(b*b)) < 18.5) {
            ketqua = "Kết quả: Underweight(Gầy)";
            textView3.setText(ketqua);
        } else if ((a/(b*b)) < 25) {
            ketqua = "Kết quả: Normal weight(Cân nặng bình thường)";
            textView3.setText(ketqua);
        } else if ((a/(b*b)) < 30) {
            ketqua = "Kết quả: Overweight(Thừa cân)";
            textView3.setText(ketqua);
        } else if ((a/(b*b)) < 35) {
            ketqua = "Kết quả: Obese class(Béo phì)";
            textView3.setText(ketqua);
        } else {
            ketqua = "Kết quả: Extremely obese(Béo phì nặng)";
            textView3.setText(ketqua);
        }
    }
}