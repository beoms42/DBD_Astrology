package com.example.dbdastrology;

import android.app.Application;

import java.util.ArrayList;

public class ZombleAlive extends Application {

    // 영구적으로 앱이 살아있는동안 액티비티 하나를 살려서 편하게 쓰자.
    // 퍽 리스트 받아서 영구보관
    PerkArrayList perk = new PerkArrayList();
    ArrayList perkList = perk.getPerkList();

    public ArrayList<String> getPerks() {
        return perkList;
    }

}
