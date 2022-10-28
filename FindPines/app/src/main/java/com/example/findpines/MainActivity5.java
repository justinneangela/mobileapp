package com.example.findpines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items = new ArrayList<item>();
        items.add(new item("Jollibee", "Fast-food restaurant", R.drawable.jollibee));
        items.add(new item("Jollibee", "Fast-food restaurant", R.drawable.jollibee));
        items.add(new item("Jollibee", "Fast-food restaurant", R.drawable.jollibee));
        items.add(new item("Jollibee", "Fast-food restaurant", R.drawable.jollibee));
        items.add(new item("Jollibee", "Fast-food restaurant", R.drawable.jollibee));
        items.add(new item("Jollibee", "Fast-food restaurant", R.drawable.jollibee));
        items.add(new item("Jollibee", "Fast-food restaurant", R.drawable.jollibee));
        items.add(new item("Jollibee", "Fast-food restaurant", R.drawable.jollibee));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}