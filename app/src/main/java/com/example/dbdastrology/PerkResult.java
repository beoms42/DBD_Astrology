package com.example.dbdastrology;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;
import java.util.HashMap;

public class PerkResult extends AppCompatActivity {
    ImageView perks_1;
    ImageView perks_2;
    ImageView perks_3;
    ImageView perks_4;

    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        perks_1 = findViewById(R.id.perks_1);
        perks_2 = findViewById(R.id.perks_2);
        perks_3 = findViewById(R.id.perks_3);
        perks_4 = findViewById(R.id.perks_4);

        resultView = findViewById(R.id.textResult2);

        int redCount = 0;
        int blueCount = 0;
        int purpleCount = 0;
        int greenCount = 0;

        HashMap<String, String> perkMap = ((ZombleAlive)getApplication()).getPerksMap();
        ArrayList<String> perkList = ((ZombleAlive)getApplication()).getPerks();

        for(int i = 0; i <= 3; i++) {
            String categoryPerk = perkMap.get(perkList.get(i).toString()+"_category_option");
            if(categoryPerk.equals("red")) {
                redCount++;
            }

            if(categoryPerk.equals("blue")) {
                blueCount++;
            }

            if(categoryPerk.equals("purple")) {
                purpleCount++;
            }

            if(categoryPerk.equals("green")) {
                greenCount++;
            }

            resultView.setText("RedCount : "+redCount+"\n blueCount :"+blueCount+"\n purpleCount :"+purpleCount+"\n greenCount :"+greenCount);
        }
    }

}