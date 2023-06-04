package com.HeyStudio.chatpaper.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.HeyStudio.chatpaper.databinding.ActivitySigninBinding;

public class SigninActivity extends AppCompatActivity {
    private ActivitySigninBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textCreateNewAccount.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), SignupActivity.class)));
    }

}
