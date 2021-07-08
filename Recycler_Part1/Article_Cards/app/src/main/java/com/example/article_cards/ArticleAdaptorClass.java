package com.example.article_cards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArticleAdaptorClass extends RecyclerView.Adapter<ArticleViewHolder> {
    private ArrayList<Article> articleArrayList;

    public ArticleAdaptorClass(ArrayList<Article> articleArrayList) {
        this.articleArrayList = articleArrayList;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.article_layout,parent,false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {

        Article article = articleArrayList.get(position);
        holder.setData(article);

    }

    @Override
    public int getItemCount() {
        return articleArrayList.size();
    }
}
