package com.comsats.lifelines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;

import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import com.comsats.lifelines.databinding.ActivityPracticeFocusBinding;

public class practice extends AppCompatActivity {

    ActivityPracticeFocusBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityPracticeFocusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.focus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.button1.requestFocus(View.FOCUS_DOWN);
            }
        });

        binding.editTextTextPersonName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                binding.editTextTextPersonName.setText("Focused state Changed..");
            }
        });


    }




}