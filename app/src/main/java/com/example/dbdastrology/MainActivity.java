package com.example.dbdastrology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView onClick3h;
    ImageView onClick6h;
    ImageView onClick9h;
    ImageView onClick12h;

    ImageView perk3h;
    ImageView perk6h;
    ImageView perk9h;
    ImageView perk12h;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 클릭 가능한 4가지 방향
        onClick3h = findViewById(R.id.onclick_3h);
        onClick6h = findViewById(R.id.onclick_6h);
        onClick9h = findViewById(R.id.onclick_9h);
        onClick12h = findViewById(R.id.onclick_12h);

        // 실제 표시되는 이미지뷰 4방향
        perk3h = findViewById(R.id.perk_3h);
        perk6h = findViewById(R.id.perk_6h);
        perk9h = findViewById(R.id.perk_9h);
        perk12h = findViewById(R.id.perk_12h);




        onClick3h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getApplicationContext(),PerkSelectOne.class);
                myIntent.putExtra("onclick_3h", "onclick_3h");
                startActivity(myIntent);
                finish();
            }
        });



    }


}