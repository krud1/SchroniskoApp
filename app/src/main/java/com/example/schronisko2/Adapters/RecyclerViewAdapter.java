package com.example.schronisko2.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.schronisko2.Fragments.AnimalListFragment;
import com.example.schronisko2.Objects.AnimalObject;
import com.example.schronisko2.R;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    onClick activity;
    RecyclerView recyclerView;
    ArrayList<AnimalObject> animalObjects;

    public interface onClick {
        void onItemClick(int i);
    }

    public RecyclerViewAdapter(Context context, ArrayList<AnimalObject> animalObjects, RecyclerView recyclerView){
        this.activity = (onClick) context;
        this.animalObjects = animalObjects;
        this.recyclerView = recyclerView;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        MaterialCardView card;
        TextView tvName, tvAge, tvSex;

        public ViewHolder(@NonNull View itemView)  {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_Image);
            card = itemView.findViewById(R.id.card);
            tvName = itemView.findViewById(R.id.tv_Name);
            tvAge = itemView.findViewById(R.id.tv_Age);
            tvSex = itemView.findViewById(R.id.tv_Sex);

            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    activity.onItemClick(animalObjects.indexOf(itemView.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animal_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(animalObjects.get(position));
        holder.tvName.setText(animalObjects.get(position).getName());
        holder.tvAge.setText(animalObjects.get(position).getAge());
        holder.tvSex.setText(animalObjects.get(position).getSex());
        if(animalObjects.get(position).getPhoto_path().equals("bilusia1")){
            holder.imageView.setImageResource(R.drawable.bilusia1);
        }
        else if(animalObjects.get(position).getPhoto_path().equals("kiera1")){
            holder.imageView.setImageResource(R.drawable.kiera1);

        }else if(animalObjects.get(position).getPhoto_path().equals("lucynka1")){
            holder.imageView.setImageResource(R.drawable.lucynka1);

        }else if(animalObjects.get(position).getPhoto_path().equals("mela")){
            holder.imageView.setImageResource(R.drawable.mela);

        }else if(animalObjects.get(position).getPhoto_path().equals("cytrynka1")){
            holder.imageView.setImageResource(R.drawable.cytrynka1);
        }
    }
    @Override
    public int getItemCount() {
        return animalObjects.size();
    }
}
