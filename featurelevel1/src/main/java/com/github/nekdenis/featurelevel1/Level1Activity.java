package com.github.nekdenis.featurelevel1;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.nekdenis.featurelevel1.databinding.ActivityLevel1Binding;


public class Level1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLevel1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_level1);
        Level1 user = new Level1();
        binding.setUser(user);
    }
}
