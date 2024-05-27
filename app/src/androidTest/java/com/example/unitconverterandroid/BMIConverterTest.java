package com.example.unitconverterandroid;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class BMIConverterTest {

    @Rule
    public ActivityScenarioRule<BMIConverter> activityRule =
            new ActivityScenarioRule<>(BMIConverter.class);

    @Test
    public void testBMICalculation() {
        // Input weight
        onView(withId(R.id.weight)).perform(clearText(), typeText("70"));

        // Input height in feet
        onView(withId(R.id.height)).perform(clearText(), typeText("5.9"));

        // Click on the calculate button
        onView(withId(R.id.bmibutton)).perform(click());

        // Check if the result is displayed correctly
        onView(withId(R.id.bmiresult)).check(matches(withText("BMI: 21.65")));
    }
}
