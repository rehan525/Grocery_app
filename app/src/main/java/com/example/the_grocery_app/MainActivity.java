package com.example.the_grocery_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    MyAdapter adapter;

    List<Item> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);


        itemList=new ArrayList<>();
        Item item1=new Item(R.drawable.fruit,"Fruits","Fresh fruits from the garden");
        Item item2= new Item(R.drawable.vegitables,"Vegetable","Delicious Vegetables");
        Item item3=new Item(R.drawable.bread,"bread","All Types of Bread");
        Item item4=new Item(R.drawable.beverage,"Beverages","pepsi,cola,thumbsup");
        Item item5=new Item(R.drawable.milk,"Milk","Fresh Milk");
        Item item6=new Item(R.drawable.popcorn,"popcorn","Popcorn,Donut and cakes");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);



        LinearLayoutManager LayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(LayoutManager);

        adapter=new MyAdapter(itemList);
        recyclerView.setAdapter(adapter);

    }
}