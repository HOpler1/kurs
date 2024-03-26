package com.example.kurs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ar, R.string.argentina, R.string.argentinianPeso, R.string.argentinaC));
        list.add(new DataFlags(R.drawable.cn, R.string.china, R.string.chinaYuan, R.string.chinaC));
        list.add(new DataFlags(R.drawable.jp, R.string.japan, R.string.japaneseYen, R.string.japanC));
        list.add(new DataFlags(R.drawable.kr, R.string.korea, R.string.koreanWon, R.string.koreaC));

        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);
    }
}