package com.example.viewpager2app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.ViewHolder>{
    ArrayList<CarModel> cars = new ArrayList<>();
    private Context context;
    public PagerAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view_pager,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageViewCar.setImageResource(cars.get(position).getImage());
        holder.txtCarName.setText(cars.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewCar;
        private TextView txtCarName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewCar = itemView.findViewById(R.id.imageViewCar);
            txtCarName = itemView.findViewById(R.id.txtCarName);
        }
    }

    public void setCars(ArrayList<CarModel> cars) {
        this.cars = cars;
        notifyDataSetChanged();
    }
}
