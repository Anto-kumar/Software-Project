package com.example.unitconverterandroid;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;

import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<com.example.unitconverterandroid.MainActivity> activityActivityScenarioRule = new ActivityScenarioRule<com.example.unitconverterandroid.MainActivity>(com.example.unitconverterandroid.MainActivity.class);

    @Before
    public void setUp() {
        Intents.init();
    }

    @After
    public void tearDown() {
        Intents.release();
    }

    @Test
    public void testCurrencyButtonIntent() {
        onView(withId(R.id.currency)).perform(click());
        intended(hasComponent(CurrencyConverter.class.getName()));
    }

    @Test
    public void testLengthButtonIntent() {
        onView(withId(R.id.length)).perform(click());
        intended(hasComponent(LengthConverter.class.getName()));
    }

    @Test
    public void testWeightButtonIntent() {
        onView(withId(R.id.weight)).perform(click());
        intended(hasComponent(WeightConverter.class.getName()));
    }

    @Test
    public void testTemperatureButtonIntent() {
        onView(withId(R.id.temperature)).perform(click());
        intended(hasComponent(TemperatureConverter.class.getName()));
    }

    @Test
    public void testAreaButtonIntent() {
        onView(withId(R.id.area)).perform(click());
        intended(hasComponent(AreaConverter.class.getName()));
    }

    @Test
    public void testBmiButtonIntent() {
        onView(withId(R.id.bmi)).perform(click());
        intended(hasComponent(BMIConverter.class.getName()));
    }
}
