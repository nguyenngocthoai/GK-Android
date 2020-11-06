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

public class AdapterL extends RecyclerView.Adapter<AdapterL.ViewHolder> {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<ItemL> list;
    sendData listener;

    public AdapterL(Context context, ArrayList<ItemL> list) {
        this.context = context;
        this.list = list;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterL.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_item_l,parent,false);
        return new ViewHolder(view,this);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterL.ViewHolder holder, int position) {
        //gán giá trị, holer tượng trưng cho 1 phần tử của recycle
        ItemL itemL = list.get(position);
        holder.img.setImageResource(itemL.getAnh());
        holder.tv.setText(itemL.getTen());
        //bắt sự kiện
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener = (sendData)context;
                listener.send(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {//Ánh xạ
        ImageView img;
        TextView tv;
        AdapterL adapterL;

        public ViewHolder(@NonNull View itemView,AdapterL adap) {
            super(itemView);
            img = itemView.findViewById(R.id.imageViewL);
            tv = itemView.findViewById(R.id.textViewL);
            adapterL = adap;
        }
    }
}
