package com.HeyStudio.chatpaper.activities;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.HeyStudio.chatpaper.databinding.ActivitySignupBinding;

import java.util.regex.Pattern;

public class SignupActivity extends AppCompatActivity {
    private ActivitySignupBinding binding;
    private String encodedImage;
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

    private void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    private void signUp() {

    }
    private Boolean isValidSignUpDetails() {
        if(encodedImage == null){
            showToast("Select Profile Image");
            return false;
        }else if (binding.inputName.getText().toString().trim().isEmpty()) {
            showToast("Enter Name");
            return false;
        }else if(binding.inputEmail.getText().toString().trim().isEmpty()) {
            showToast("Enter Email");
            return false;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.getText().toString()).matches()) {
            showToast("Enter Valid Email");
        }else if (binding.inputPassword.getText().toString().trim().isEmpty()) {
            showToast("Enter Password");
            return false;
        }else if (binding.inputPasswordConfirm.getText().toString().trim().isEmpty()) {
            showToast("Confirm Your Password");
            return false;
        }else if (!binding.inputPassword.getText().toString().equals(binding.inputPasswordConfirm.getText().toString())) {
            showToast("Passwords Do Not Match");
            return false;
        }else{
            return true;
        }
        return null;
    }
}