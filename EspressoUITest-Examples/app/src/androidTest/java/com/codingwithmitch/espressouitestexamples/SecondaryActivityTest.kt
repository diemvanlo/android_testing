package com.codingwithmitch.espressouitestexamples

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class SecondaryActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivityInView() {
        onView(withId(R.layout.activity_secondary)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_title_backButton() {
        onView(withId(R.id.button_back)).check(matches(isDisplayed()))
    }
}