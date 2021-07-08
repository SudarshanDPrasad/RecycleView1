package com.example.idenditycard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class IdentitycardHolder extends RecyclerView.ViewHolder {
    private TextView mtvName;
    private TextView mtvAge;
    private TextView mtvProfession;
    private ImageView mivImage;

    public IdentitycardHolder(@NonNull View itemView) {
        super(itemView);
        intidviews(itemView);
    }

    private void intidviews(View itemView) {
        mivImage = itemView.findViewById(R.id.ivImage);
        mtvAge = itemView.findViewById(R.id.tvAge);
        mtvName = itemView.findViewById(R.id.tvName);
        mtvProfession = itemView.findViewById(R.id.tvProfession);

    }

    public void setData(Identity identity) {
        mivImage.setBackgroundResource(identity.getImage());
        mtvProfession.setText(identity.getProfession());
        mtvName.setText(identity.getName());
        mtvAge.setText(identity.getAge());
    }
}
