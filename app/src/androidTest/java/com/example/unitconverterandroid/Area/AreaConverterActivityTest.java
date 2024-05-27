package com.example.unitconverterandroid.Area;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.unitconverterandroid.R;

import org.junit.Rule;
import org.junit.Test;

public class AreaConverterActivityTest {

    @Rule
    public ActivityScenarioRule<com.example.unitconverterandroid.AreaConverter> activityActivityScenarioRule = new ActivityScenarioRule<com.example.unitconverterandroid.AreaConverter>(com.example.unitconverterandroid.AreaConverter.class);

    @Test
    public void testMSquareToCMSquareConversion() {
        onView(withId(R.id.input_value)).perform(typeText("10"), closeSoftKeyboard());
        onView(withId(R.id.m_square_to_cm_square)).perform(ViewActions.click());
        onView(withId(R.id.result)).check(matches(withText("100000.0")));
    }

    @Test
    public void testKMSquareToMSquareConversion() {
        onView(withId(R.id.input_value)).perform(typeText("1"), closeSoftKeyboard());
        onView(withId(R.id.km_square_to_m_square)).perform(ViewActions.click());
        onView(withId(R.id.result)).check(matches(withText("1000000.0")));
    }

    @Test
    public void testCMSquareToMSquareConversion() {
        onView(withId(R.id.input_value)).perform(typeText("10000"), closeSoftKeyboard());
        onView(withId(R.id.cm_square_to_m_square)).perform(ViewActions.click());
        onView(withId(R.id.result)).check(matches(withText("1.0")));
    }

}