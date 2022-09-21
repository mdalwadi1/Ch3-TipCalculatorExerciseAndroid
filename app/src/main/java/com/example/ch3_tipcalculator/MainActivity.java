package com.example.ch3_tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDisplayButton();
    }

    private void initDisplayButton() {
        Button displayButton1 = findViewById(R.id.buttonFifteenPercent);
        Button displayButton2 = findViewById(R.id.buttonEighteenPercent);
        Button displayButton3 = findViewById(R.id.buttonTwentyPercent);

        displayButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editBillAmount);
                TextView textDisplay = findViewById(R.id.textTipAndTotal);
                String nameToDisplay = editName.getText().toString();

                //Double.parseDouble = takes the bill amount (already a double) and
                //parses it so a new double (bill) is initialized to do calculations w/
                Double bill = Double.parseDouble(nameToDisplay);
                Double tip = 0.15 * bill;
                bill = bill + tip;
                Resources res = getResources();
                String displayString = "Tip: " + tip + "  Bill: " + bill;
                textDisplay.setText(displayString);
            }
        });

        displayButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editBillAmount);
                TextView textDisplay = findViewById(R.id.textTipAndTotal);
                String nameToDisplay = editName.getText().toString();
                Double bill = Double.parseDouble(nameToDisplay);
                Double tip = 0.18 * bill;
                bill = bill + tip;
                Resources res = getResources();
                String displayString = "Tip: " + tip + "  Bill: " + bill;
                textDisplay.setText(displayString);
            }
        });

        displayButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editName = findViewById(R.id.editBillAmount);
                TextView textDisplay = findViewById(R.id.textTipAndTotal);
                String nameToDisplay = editName.getText().toString();
                Double bill = Double.parseDouble(nameToDisplay);
                Double tip = 0.20 * bill;
                bill = bill + tip;
                Resources res = getResources();
                String displayString = "Tip: " + tip + "  Bill: " + bill;
                textDisplay.setText(displayString);
            }
        });
    }
}