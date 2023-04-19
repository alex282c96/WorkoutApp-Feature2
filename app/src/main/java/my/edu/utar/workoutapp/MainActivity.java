package my.edu.utar.workoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgBack;
    CardView cardChest;
    CardView cardShoulder;
    CardView cardAbs;
    CardView cardBiceps;
    CardView cardTriceps;
    CardView cardBack;
    CardView cardQuadriceps;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        InitView();
        InitOnClickEvent();
    }

    private void InitOnClickEvent() {
        imgBack.setOnClickListener(this);
        cardChest.setOnClickListener(this);;
        cardShoulder.setOnClickListener(this);;
        cardAbs.setOnClickListener(this);;
        cardBiceps.setOnClickListener(this);;
        cardTriceps.setOnClickListener(this);;
        cardBack.setOnClickListener(this);
        cardQuadriceps.setOnClickListener(this);;
    }

    private void InitView() {
        imgBack=findViewById(R.id.back_pressed);
        cardChest=findViewById(R.id.chest);
        cardShoulder=findViewById(R.id.shoulder);;
        cardAbs=findViewById(R.id.abs);;
        cardBiceps=findViewById(R.id.biceps);;
        cardTriceps=findViewById(R.id.triceps);;
        cardBack=findViewById(R.id.back);;
        cardQuadriceps=findViewById(R.id.quadriceps);;
    }

    @Override
    public void onClick(View v) {
        // Handle the button click event here
        switch (v.getId()) {
            case R.id.back_pressed:
                finish();
                break;
            case R.id.chest:
                startActivity(new Intent(MainActivity.this,ChestActivity.class));
                break;
            case R.id.shoulder:
                startActivity(new Intent(MainActivity.this,ShoulderActivity.class));
                break;
            case R.id.abs:
                startActivity(new Intent(MainActivity.this,AbsActivity.class));
                break;
            case R.id.biceps:
                startActivity(new Intent(MainActivity.this,BicepsActivity.class));
                break;
            case R.id.back:
                startActivity(new Intent(MainActivity.this,BackActivity.class));
                break;
            case R.id.triceps:
                startActivity(new Intent(MainActivity.this,TricepsActivity.class));
                break;
            case R.id.quadriceps:
                startActivity(new Intent(MainActivity.this,LegActivity.class));
                break;
        }
    }
}