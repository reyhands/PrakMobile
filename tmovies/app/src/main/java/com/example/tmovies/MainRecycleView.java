package com.example.tmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MainRecycleView extends RecyclerView.Adapter<MainRecycleView.MainViewHolder>

{
    private Context context;
    private List<Category> allcategorylist;

    public MainRecycleView(Context context, List<Category> allcategorylist)
    {
        this.context = context;
        this.allcategorylist = allcategorylist;



    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(context).inflate(R.layout.main_recycler_row_item, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
            holder.JudulKategori
    }

    @Override
    public int getItemCount() {
        return allcategorylist.size();
    }

    public static final class MainViewHolder extends RecyclerView.ViewHolder
    {

        TextView JudulKategori;

        public MainViewHolder(@NonNull View ItemView)

        {
            super(ItemView);


            JudulKategori = ItemView.findViewById(R.id.cat_title);
        }


    }

}
