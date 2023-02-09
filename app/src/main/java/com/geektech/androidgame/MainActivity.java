package com.geektech.androidgame;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.geektech.androidgame.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initImage();

        binding.btnGame.setOnClickListener(view -> {
            initNav();
        });
    }

    private void initNav() {
        Intent intent = new Intent(this, GameOneActivity.class);
        startActivity(intent);
        finish();
    }

    private void initImage() {

        Glide.with(this).load("https://dailystorm.ru/media/images/2020/09/29/843a1336-4b8d-412c-a97d-d1369d440730.jpg").centerCrop().into(binding.imageOne);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/a/a5/Arnold_Schwarzenegger_by_Gage_Skidmore_3.jpg").centerCrop().into(binding.imageTwo);
        Glide.with(this).load("https://media.ed.edmunds-media.com/dodge/challenger/2022/oem/2022_dodge_challenger_coupe_gt_fq_oem_1_1280.jpg").centerCrop().into(binding.imageThird);
        Glide.with(this).load("https://avatars.mds.yandex.net/get-vertis-journal/4465444/Dodge-Challenger-1-1.jpg_1642323253986/orig").centerCrop().into(binding.imageFour);
    }

}