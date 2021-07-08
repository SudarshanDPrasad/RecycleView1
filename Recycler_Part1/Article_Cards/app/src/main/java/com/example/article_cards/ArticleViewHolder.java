package com.example.article_cards;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {

    private ImageView mivImage;
    private TextView mtvName;
    private TextView mtvTitle;

    public ArticleViewHolder(@NonNull View itemView) {
        super(itemView);
            iniviews(itemView);
    }

    private void iniviews(View itemView) {
        mivImage = itemView.findViewById(R.id.ivImage);
        mtvName = itemView.findViewById(R.id.tvName);
        mtvTitle = itemView.findViewById(R.id.tvTitle);

    }

    public void setData(Article article) {
        mtvTitle.setText(article.getTitle());
        mtvName.setText(article.getName());
        mivImage.setBackgroundResource(article.getImage());
    }
}
