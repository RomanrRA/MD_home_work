package com.example.md1l1homework.homeWork6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.md1l1homework.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<String> list;

    public MyAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_hw6_main, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            initView();
        }

        private void initView() {
            textView = itemView.findViewById(R.id.text_view);
            imageView = itemView.findViewById(R.id.image_view);
        }

        public void bind(int position) {
            textView.setText(list.get(position));
            switch (position % 4) {
                case 0:
                    imageView.setImageResource(R.drawable.fruits1);
                    break;
                case 1:
                    imageView.setImageResource(R.drawable.fruits2);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.fruits3);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.fruits4);
                    break;
            }

        }
    }
}
