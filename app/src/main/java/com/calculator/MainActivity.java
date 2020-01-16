package com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculateButton = findViewById(R.id.formButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAge();
            }
        });
    }

    private void calculateAge() {
        TextView dateView = findViewById(R.id.formDate);
        String dateAsString = dateView.getText().toString();
        if (dateAsString != null && !dateAsString.isEmpty()) {
            try {
                Date selectedDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateAsString);
                Calendar cal1 = Calendar.getInstance();
                Calendar cal2 = Calendar.getInstance();
                cal1.setTime(selectedDate);
                cal2.setTimeInMillis(System.currentTimeMillis());
                int diff = cal2.get(YEAR) - cal1.get(YEAR);
                if (cal1.get(MONTH) > cal2.get(MONTH) || (cal1.get(MONTH) == cal2.get(MONTH) && cal1.get(DATE) > cal2.get(DATE))) {
                    diff--;
                }
                TextView resultView = findViewById(R.id.formResult);
                resultView.setText("Your age is: " + diff);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
