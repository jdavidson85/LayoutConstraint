package com.example.layoutconstraint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CalendarView is constrained to the top and start of the parent.
        //ImageView is constrained below CalendarView and to the end of CalendarView.
        //TextClock is constrained to the top and end of the parent.
        //ProgressBar is constrained to the bottom and start of the parent.
        //RatingBar is constrained to the bottom and end of the parent.
    }
}