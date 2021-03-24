package com.comsats.miscellaneous;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.comsats.lifelines.databinding.ActivityFocusPracticeBinding;

public class FocusPractice  extends AppCompatActivity {

    ActivityFocusPracticeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityFocusPracticeBinding.inflate(getLayoutInflater());
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
