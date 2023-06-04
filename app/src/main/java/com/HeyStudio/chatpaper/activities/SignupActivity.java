package com.HeyStudio.chatpaper.activities;

import static com.google.android.material.color.utilities.MaterialDynamicColors.onBackground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.HeyStudio.chatpaper.R;
import com.HeyStudio.chatpaper.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {
    private ActivitySignupBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivitySignupBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());
       setListener();
    }
    private void setListener() {
    binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}