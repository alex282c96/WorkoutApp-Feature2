package my.edu.utar.workoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class TricepsActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);
        getSupportActionBar().hide();

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        PageAdapter pageAdapter = new PageAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        pageAdapter.addFragment(new Triceps1(),"Narrow-grip dips");
        pageAdapter.addFragment(new Triceps2(),"Reverse-grip barbell bench press");
        pageAdapter.addFragment(new Triceps3(),"Barbell floor press");
        pageAdapter.addFragment(new Triceps4(),"One-arm dumbbell overhead triceps extension");
        viewPager.setAdapter(pageAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // Handle swipe event
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Not needed for swipe event
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // Not needed for swipe event
            }
        });

        ImageView imageView = findViewById(R.id.back_pressed);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

}