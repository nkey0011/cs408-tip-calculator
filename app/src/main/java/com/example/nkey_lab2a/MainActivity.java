package com.example.nkey_lab2a;

import androidx.appcompat.app.AppCompatActivity;
import java.text.*;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nkey_lab2a.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    TextView output;
    EditText bill, tip, people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // takes user's total bill input and converts to tangible number
                bill = binding.billInput;
                String user_bill = bill.getText().toString();
                float amt_bill = Float.parseFloat(user_bill);

                // takes user's tip input as whole number
                tip = binding.tipInput;
                String user_tip = tip.getText().toString();
                float amt_tip = Float.parseFloat(user_tip);

                // takes user's people input
                people = binding.peopleInput;
                String user_people = people.getText().toString();
                int amt_people = Integer.parseInt(user_people);

                // converts tip input into a decimal amount
                float tip_value = amt_tip / 100;

                /* adds tip to the final bill and divides by amount of people
                to get the price for each person*/
                double final_bill = (amt_bill + tip_value)/amt_people;

                NumberFormat money_format = NumberFormat.getCurrencyInstance();
                String output = money_format.format(final_bill);

                binding.result.setText("Total Per Person: " + output);
            }
        });

    }
}