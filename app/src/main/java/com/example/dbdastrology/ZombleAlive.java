package com.example.dbdastrology;

import android.app.Application;

import java.util.ArrayList;
import java.util.HashMap;

public class ZombleAlive extends Application {

    // 영구적으로 앱이 살아있는동안 액티비티 하나를 살려서 편하게 쓰자.
    // 퍽 리스트 받아서 영구보관
    PerkArrayList perk = new PerkArrayList();
    ArrayList perkList = perk.getPerkList();
    HashMap<String, String> perkMap = perk.getPerkMap();

    // 안에 퍽을 뽑았으면  이름 여기에 저장
    String state3h = "";
    String state6h = "";
    String state9h = "";
    String state12h = "";

    //안에 퍽을 뽑았으면 카테고리 여기에 저장
    String cate3h = "";
    String cate6h = "";
    String cate9h = "";
    String cate12h = "";

    public ArrayList<String> getPerks() {
        return perkList;
    }
    public HashMap<String, String> getPerksMap(){ return perkMap; }
}
