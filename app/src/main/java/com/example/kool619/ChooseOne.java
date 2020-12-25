package com.example.kool619;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

public class ChooseOne extends AppCompatActivity {

    Button chef, customer, deliveryPerson;
    Intent intent;
    String type;
    ConstraintLayout bgimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);

        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim1), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim2), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim3), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim4), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim5), 3000);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.anim6), 3000);

        animationDrawable.setOneShot(false);
        animationDrawable.setEnterFadeDuration(850);
        animationDrawable.setExitFadeDuration(1600);

        bgimage = findViewById(R.id.back3);
        bgimage.setBackgroundDrawable(animationDrawable);
        animationDrawable.start();

        intent = getIntent();
        type = intent.getStringExtra("Home").toString().trim();

        chef = (Button)findViewById(R.id.chef);
        deliveryPerson = (Button)findViewById(R.id.delivery);
        customer = (Button)findViewById(R.id.customer);

        chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (type.equals("Email")){
                    Intent loginemail = new Intent(ChooseOne.this, Cheflogin.class);
                    startActivity(loginemail);
                    finish();
                }
                if (type.equals("Phone")){
                    Intent loginphone = new Intent(ChooseOne.this, Chefloginphone.class);
                    startActivity(loginphone);
                    finish();
                }
                if (type.equals("Signup")){
                    Intent register = new Intent(ChooseOne.this, ChefRegistration.class);
                    startActivity(register);
                }
            }
        });

    customer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (type.equals("Email")){
                Intent loginemailcust = new Intent(ChooseOne.this, Login.class);
                startActivity(loginemailcust);
                finish();
            }
            if (type.equals("Phone")){
                Intent loginphonecust = new Intent(ChooseOne.this, Loginphone.class);
                startActivity(loginphonecust);
                finish();
            }
            if (type.equals("Signup")){
                Intent registercust = new Intent(ChooseOne.this, Registration.class);
                startActivity(registercust);
            }
        }
    });

    deliveryPerson.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (type.equals("Email")){
                Intent loginemail = new Intent(ChooseOne.this, DeliveryLogin.class);
                startActivity(loginemail);
                finish();
            }
            if (type.equals("Phone")){
                Intent loginphone = new Intent(ChooseOne.this, DeliveryLoginphone.class);
                startActivity(loginphone);
                finish();
            }
            if (type.equals("Signup")){
                Intent registerdelivery = new Intent(ChooseOne.this, DeliveryRegistration.class);
                startActivity(registerdelivery);
            }
        }
    });






    }
}