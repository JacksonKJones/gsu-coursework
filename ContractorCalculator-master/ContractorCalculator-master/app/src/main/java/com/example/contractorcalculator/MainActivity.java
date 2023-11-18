package com.example.contractorcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClick();
    }

    private final double TAX_RATE = 0.05;

    private void buttonClick() {
        EditText laborInput = findViewById(R.id.laborField);
        EditText materialInput = findViewById(R.id.materialField);
        TextView subtotalOutput = findViewById(R.id.subtotalText);
        TextView taxOutput = findViewById(R.id.taxText);
        TextView totalOutput = findViewById(R.id.totalText);
        Button calculate = findViewById(R.id.calculateButton);

        calculate.setOnClickListener(view -> {
            double laborCost = Double.parseDouble(String.valueOf(laborInput.getText()));
            double materialCost = Double.parseDouble(String.valueOf(materialInput.getText()));
            double subtotal = laborCost + materialCost;
            double tax = subtotal * TAX_RATE;
            double total = subtotal + tax;

            DecimalFormat df = new DecimalFormat("0.##");

            subtotalOutput.setText(df.format(subtotal));
            taxOutput.setText(df.format(tax));
            totalOutput.setText(df.format(total));
        });
    }
}