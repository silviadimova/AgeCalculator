package com.calculator.robots;


import com.calculator.MainActivity;
import com.calculator.R;
import androidx.test.rule.ActivityTestRule;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;


public class HomeScreenRobot {

    private ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class, false, false);

    public void launchScreen() {
        testRule.launchActivity(null);
    }

    public void enterValidDateAndFormat(String date){
        onView(withId(R.id.formDate)).perform(typeText(date));
    }

    public void tapOnCalculateMyAgeButton(){
        onView(withId(R.id.formButton)).perform(click());
    }

    public  void checkCorrectResultsDisplayed(){
        onView(withId(R.id.formResult )).check(matches(isDisplayed())).check(matches(withText("Your age is: 29")));
    }

    public void checResultsNotDisplayed(){
        onView(withId(R.id.formResult)).check(matches(not(isDisplayed())));
    }

    public void checkTitleDisplayed() {
        onView(withId(R.id.formTitle)).check(matches(isDisplayed()));
    }

    public void checkDateInputDisplayed() {
        onView(withId(R.id.formDate)).check(matches(isDisplayed()));
    }

    public void checkCalculateAgeButtonDisplayed() {
        onView(withId(R.id.formButton)).check(matches(isDisplayed()));
    }
}
