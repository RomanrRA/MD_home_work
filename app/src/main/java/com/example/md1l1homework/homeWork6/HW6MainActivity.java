package com.example.md1l1homework.homeWork6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.md1l1homework.R;

public class HW6MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view_hw6_main);

        initRecyclerView();
    }


    //ToDo Не понимаю почему не грузится. Падает с ошибкой
    //java.lang.RuntimeException: Canvas: trying to draw too large(147456000bytes) bitmap.
    //        at android.view.DisplayListCanvas.throwIfCannotDraw(DisplayListCanvas.java:260)
    //Смотрел  винете, пробовал сделать как предлагали. Не получилось. Подскажите что не так?
    private void initRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(this, new Data().getList());
        recyclerView.setAdapter(myAdapter);
//        recyclerView.addItemDecoration(new ItemDivider(this));
    }

}
