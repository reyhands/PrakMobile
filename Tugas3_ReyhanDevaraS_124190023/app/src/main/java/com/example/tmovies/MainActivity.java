package com.example.tmovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView Game;
    private ArrayList<GameModel> listGame = new ArrayList<>();
    @Override protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Game = findViewById(R.id.gamelist);
        Game.setHasFixedSize(true);
        listGame.addAll(GameData.getGameList());

        showRecyclerList();
    }

    private void showRecyclerList() {
            Game.setLayoutManager(new LinearLayoutManager(this));
            GameAdapter gameAdapter = new GameAdapter(this);
            gameAdapter.setGameModels(listGame);
            Game.setAdapter(gameAdapter);
    }






}