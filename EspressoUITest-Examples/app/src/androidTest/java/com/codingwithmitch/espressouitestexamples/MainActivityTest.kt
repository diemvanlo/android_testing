package com.codingwithmitch.espressouitestexamples

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test

import org.junit.Assert.*

class MainActivityTest {

    @Test
    fun test_is_activity_in_view() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_title_next_button() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(isDisplayed()))
        onView(withId(R.id.button_next_activity)).check(matches(isDisplayed()))

        onView(withId(R.id.button_next_activity)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun test_isTitleTextDisplayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title)).check(matches(withText(R.string.text_mainactivity)))
    }
}