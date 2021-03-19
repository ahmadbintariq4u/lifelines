package com.comsats.lifelines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.comsats.lifelines.databinding.ActivityPracticeBinding;

public class practice extends AppCompatActivity {

    ActivityPracticeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPracticeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }




}