package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapR extends RecyclerView.Adapter<AdapR.ViewHolder> {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<ItemL> list;

    public AdapR(Context context, ArrayList<ItemL> list) {
        this.context = context;
        this.list = list;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapR.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_item_r,parent,false);
        return new AdapR.ViewHolder(view,this);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapR.ViewHolder holder, int position) {
        //gán giá trị, holer tượng trưng cho 1 phần tử của recycle
        ItemL item = list.get(position);
        holder.img.setImageResource(item.getAnh());
        holder.tv.setText(item.getTen());
        //bắt sự kiện
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv;
        AdapR adapter;

        public ViewHolder(@NonNull View itemView,AdapR adap) {
            super(itemView);
            img = itemView.findViewById(R.id.imageViewR);
            tv = itemView.findViewById(R.id.textViewR);
            adapter = adap;
        }
    }
}
