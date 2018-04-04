package com.github.nekdenis.featurelevel2;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.nekdenis.featurelevel2.databinding.ActivityLevel2Binding;


public class Level2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLevel2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_level2);
        Level2 user = new Level2();
        binding.setUser(user);
    }
}
