package com.example.viewpager2app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.pager);
        ArrayList<CarModel> cars = new ArrayList<>();
        cars.add(new CarModel("Car 1",R.drawable.car_image1));
        cars.add(new CarModel("Car 2",R.drawable.car_image2));
        cars.add(new CarModel("Car 3",R.drawable.car_image3));
        cars.add(new CarModel("Car 4",R.drawable.car_image4));
        cars.add(new CarModel("Car 5",R.drawable.car_image5));
        cars.add(new CarModel("Car 6",R.drawable.car_image6));
        cars.add(new CarModel("Car 7",R.drawable.car_image7));
        cars.add(new CarModel("Car 8",R.drawable.car_image8));
        cars.add(new CarModel("Car 9",R.drawable.car_image9));
        cars.add(new CarModel("Car 10",R.drawable.car_image10));

        PagerAdapter adapter = new PagerAdapter(this);
        adapter.setCars(cars);
        viewPager.setAdapter(adapter);
    }
}