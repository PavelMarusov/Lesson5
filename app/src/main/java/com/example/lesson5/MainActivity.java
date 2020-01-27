package com.example.lesson5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements IButtonFragment{
TextFragment textFragment = new TextFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeFragment(R.id.container,ButtonFragment.create(this));
        // khgkhgghfgfhjk
    }

public void changeFragment(int container, Fragment fragment){
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.replace(container,fragment);
    transaction.commit();
}


    @Override
    public void showTextFregment() {
        changeFragment(R.id.container2, textFragment);
    }

    @Override
    public void showButtonFragment() {
        textFragment.changeText("Hi");
    }
}
