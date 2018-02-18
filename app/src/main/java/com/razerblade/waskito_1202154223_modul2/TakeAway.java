package com.razerblade.waskito_1202154223_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void lestgo(View view) {
        startActivity(new Intent(this,DaftarMenu.class));
    }

    public void time(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "TimePicker");

    }

    public void Date(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "DatePicker");

    }
    public void processTimePickerResult(int hourOfDay, int minute) {
        // Convert time elements into strings.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // Assign the concatenated strings to timeMessage.
        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, "Time:" + timeMessage, Toast.LENGTH_SHORT).show();
    }
    public void processDatePickerResult(int year, int month, int day) {
        // The month integer returned by the date picker starts counting at 0
        // for January, so you need to add 1 to show months starting at 1.
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        // Assign the concatenated strings to dateMessage.
        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, "Date : " + dateMessage, Toast.LENGTH_SHORT).show();
    }
}
