package com.jtecx.recyclerviewdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

public class MainActivity extends AppCompatActivity {

     public RecyclerView recyclerView;
    public RecyclerAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false ));
        recyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this).color(Color.BLUE).build());


        recyclerAdapter = new RecyclerAdapter(RecyclerData.getListData(), this);
        recyclerView.setAdapter(recyclerAdapter);



    }
}
