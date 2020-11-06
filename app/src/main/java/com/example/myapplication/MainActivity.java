package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements sendData{

    RecyclerView r1,r2;
    ArrayList<ItemL> arrL,arr1,arr2,arr3;
    AdapterL adapterL;
    AdapR adapR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ recycle
        r1 = findViewById(R.id.rec1);
        r2 = findViewById(R.id.rec2);
        //tạo init cho arrL;
        arrL = new ArrayList<>();
        arrL.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arrL.add(new ItemL(R.drawable.dien_thoai_may_tinh_bang,"Điện thoại máy tính bảng"));

        //gắn adapter
        adapterL = new AdapterL(this,arrL);
        r1.setLayoutManager(new LinearLayoutManager(this));
        r1.setAdapter(adapterL);
        //
        arr1 = new ArrayList<>();
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));
        arr1.add(new ItemL(R.drawable.dien_gia_dung,"Điện gia dụng"));

        arr2 = new ArrayList<>();
        arr2.add(new ItemL(R.drawable.dien_thoai_may_tinh_bang,"Điện thoại máy tính bảng"));
        arr2.add(new ItemL(R.drawable.dien_thoai_may_tinh_bang,"Điện thoại máy tính bảng"));
        arr2.add(new ItemL(R.drawable.dien_thoai_may_tinh_bang,"Điện thoại máy tính bảng"));
        arr2.add(new ItemL(R.drawable.dien_thoai_may_tinh_bang,"Điện thoại máy tính bảng"));
        arr2.add(new ItemL(R.drawable.dien_thoai_may_tinh_bang,"Điện thoại máy tính bảng"));



        adapR = new AdapR(this,arr1);
        r2.setLayoutManager(new GridLayoutManager(this,3));
        r2.setAdapter(adapR);



    }


    @Override
    public void send(int index) {
        if(index==0)
            adapR = new AdapR(this,arr1);
        else
            adapR = new AdapR(this,arr2);

        r2.setLayoutManager(new GridLayoutManager(this,3));
        r2.setAdapter(adapR);
    }
}