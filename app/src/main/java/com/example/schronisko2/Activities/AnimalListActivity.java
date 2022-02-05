package com.example.schronisko2.Activities;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.schronisko2.Adapters.ImagePagerAdapter;
import com.example.schronisko2.Adapters.RecyclerViewAdapter;
import com.example.schronisko2.ApplicationClass;
import com.example.schronisko2.R;


public class AnimalListActivity extends FragmentActivity implements RecyclerViewAdapter.onClick {

    Fragment animalListFrag, animalDetailsFrag;
    FragmentManager fragmentManager;
    TextView tvName, tvAge, tvSex, tvDescription;

    ViewPager viewPager;
    ImagePagerAdapter imagePagerAdapter;
    static int[] bilusia = new int[]{R.drawable.bilusia1, R.drawable.bilusia2};
    static int[] mela = new int[]{R.drawable.mela};
    static int[] kiera = new int[]{R.drawable.kiera1, R.drawable.kiera2};
    static int[] cytrynka = new int[]{R.drawable.cytrynka1, R.drawable.cytrynka2, R.drawable.cytrynka3};
    static int[] lucynka = new int[]{R.drawable.lucynka1, R.drawable.lucynka2};
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);


        tvName = findViewById(R.id.tvName);
        tvAge = findViewById(R.id.tvAge);
        tvSex = findViewById(R.id.tvSex);
        tvDescription = findViewById(R.id.tvDescription);
        viewPager = findViewById(R.id.viewPager);

        fragmentManager = getSupportFragmentManager();
        animalListFrag = fragmentManager.findFragmentById(R.id.animalListFragment);
        animalDetailsFrag = fragmentManager.findFragmentById(R.id.animalDetailsFragment);
        fragmentManager.beginTransaction().show(animalListFrag).commit();

    }

    @Override
    public void onBackPressed() {
        fragmentManager.beginTransaction().hide(animalDetailsFrag).show(animalListFrag).commit();
    }

    @Override
    public void onItemClick(int i) {

        tvName.setText(ApplicationClass.animals.get(i).getName());
        tvAge.setText(ApplicationClass.animals.get(i).getAge());
        tvSex.setText(ApplicationClass.animals.get(i).getSex());
        tvDescription.setText(ApplicationClass.animals.get(i).getDescription());
        x = i;
        if(x == 0){
            imagePagerAdapter = new ImagePagerAdapter(this.getApplicationContext(), bilusia);
            viewPager.setAdapter(imagePagerAdapter);
        }
        if(x == 1){
            imagePagerAdapter = new ImagePagerAdapter(this.getApplicationContext(), mela);
            viewPager.setAdapter(imagePagerAdapter);
        }

        if(x == 2){
            imagePagerAdapter = new ImagePagerAdapter(this.getApplicationContext(), kiera);
            viewPager.setAdapter(imagePagerAdapter);
        }

        if(x == 3){
            imagePagerAdapter = new ImagePagerAdapter(this.getApplicationContext(), cytrynka);
            viewPager.setAdapter(imagePagerAdapter);
        }

        if(x == 4){
            imagePagerAdapter = new ImagePagerAdapter(this.getApplicationContext(), lucynka);
            viewPager.setAdapter(imagePagerAdapter);
        }
        fragmentManager.beginTransaction().hide(animalListFrag).show(animalDetailsFrag).commit();

    }
}