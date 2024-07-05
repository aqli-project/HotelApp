package com.example.hotelapp;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://scontent.cdninstagram.com/v/t51.29350-15/428485562_1158517325117565_6451082966418573791_n.jpg?stp=dst-jpg_e35&efg=eyJ2ZW5jb2RlX3RhZyI6ImltYWdlX3VybGdlbi4xMDgweDgxMC5zZHIuZjI5MzUwIn0&_nc_ht=scontent.cdninstagram.com&_nc_cat=109&_nc_ohc=YGukBSYCzxsQ7kNvgG0x5Eg&edm=APs17CUBAAAA&ccb=7-5&ig_cache_key=MzMwNTUwMDI4MDA1NjczNDcxOA%3D%3D.2-ccb7-5&oh=00_AYBJokfJJm84qMIfP4j4oX3KFkKbXnu0DOO-kR9WIw5CiA&oe=665BCEDA&_nc_sid=10d13b";
        Picasso.with(this).load(imageUrl).into(_imageView1);

    }
}