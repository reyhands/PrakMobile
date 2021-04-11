package com.example.tmovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecycleView mainRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> allCategoryList = new ArrayList<>();
        allCategoryList.add(new Category("Horror"));
        allCategoryList.add(new Category("Racing"));
        allCategoryList.add(new Category("Fighting"));

        setMainCategoryRecycler(allCategoryList);
    }

    private void setMainCategoryRecycler(List<Category> allCategoryList)
    {
        mainCategoryRecycler= findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecycleView = new MainRecycleView(this, allCategoryList);
    }
}