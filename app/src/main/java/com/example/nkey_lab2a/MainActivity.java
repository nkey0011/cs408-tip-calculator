package com.example.nkey_lab2a;

import androidx.appcompat.app.AppCompatActivity;
import java.text.*;
import android.os.Bundle;
import android.view.View;
import com.example.nkey_lab2a.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}