package com.jumpstart.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jumpstart.R;
import com.jumpstart.recycler_model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by burger on 10/6/2015.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    private List<Category> mItems = new ArrayList<Category>();
    int currPosition;

    public CardAdapter() {
        super();

    }

    public CardAdapter(List<Category> items) {
        mItems = items;
    }

    public void addCategory(Category category) {
        if (category == null) {
            return;
        }

        mItems.add(category);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.category_cardview, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Category cat = mItems.get(i);
        viewHolder.txtCatName.setText(cat.getCatName());
        viewHolder.txtCatContent.setText(cat.getContent());



        viewHolder.imgCatImage.setImageResource(cat.getIcon());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public ImageView imgFavorite;
        public ImageView imgCatImage;
        public TextView txtCatName;
        public TextView txtCatContent;


        public ViewHolder(View itemView) {
            super(itemView);
            imgFavorite = (ImageView)itemView.findViewById(R.id.imgFavorite);
            imgCatImage = (ImageView)itemView.findViewById(R.id.imgCatImage);
            txtCatName  = (TextView)itemView.findViewById(R.id.txtCatName);
            txtCatContent  = (TextView)itemView.findViewById(R.id.txtCatContent);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent storeintent = new Intent();

            //create new intent obj
            // pass category name / cat id to intent
            // start activity
        }
    }
}