package com.example.mealrater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MealRaterDialog.MealRaterDialogListener {

    private TextView rating;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rating = findViewById(R.id.ratingField);
        Button rateButton = findViewById(R.id.rateMealButton);
        rateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText restaurant = findViewById(R.id.restaurantField);
                EditText dish = findViewById(R.id.dishField);

                if (restaurant.getText().toString().length() > 0 && dish.getText().toString().length() > 0) {
                    DialogFragment mealRaterDialog = new MealRaterDialog();
                    mealRaterDialog.setCancelable(true);
                    mealRaterDialog.show(getSupportFragmentManager(), "Meal Rater Dialog");
                }
            }
        });
    }

    @Override
    public void onPositiveButtonClick(int standard) {
        switch (standard) {
            case 0:
                rating.setText("* * * * *");
                break;
            case 1:
                rating.setText("* * * *");
                break;
            case 2:
                rating.setText("* * *");
                break;
            case 3:
                rating.setText("* *");
                break;
            case 4:
                rating.setText("*");
                break;
        }
    }

    @Override
    public void onNegativeButtonClick() {

    }
}