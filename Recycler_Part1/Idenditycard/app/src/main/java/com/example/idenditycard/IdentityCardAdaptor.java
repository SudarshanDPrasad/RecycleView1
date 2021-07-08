package com.example.idenditycard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IdentityCardAdaptor extends RecyclerView.Adapter<IdentitycardHolder> {
    private ArrayList<Identity> identitys;

    public IdentityCardAdaptor(ArrayList<Identity> identity) {
        this.identitys = identity;
    }

    @NonNull
    @Override
    public IdentitycardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new IdentitycardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IdentitycardHolder holder, int position) {
        Identity identity = identitys.get(position);
holder.setData(identity);
    }

    @Override
    public int getItemCount() {
        return identitys.size();
    }
}
