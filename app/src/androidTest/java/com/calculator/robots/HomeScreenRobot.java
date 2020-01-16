package com.calculator.robots;


import androidx.appcompat.app.AppCompatActivity;
import androidx.test.rule.ActivityTestRule;


public class HomeScreenRobot {

    public void launchScreen(ActivityTestRule<? extends AppCompatActivity> activityTestRule) {
        activityTestRule.launchActivity(null);
    }

}
