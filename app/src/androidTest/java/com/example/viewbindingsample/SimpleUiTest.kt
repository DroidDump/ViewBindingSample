package com.example.viewbindingsample

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test


internal class SimpleUiTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun activityLaunches() {
        Espresso.onView(withText(R.string.hello_from_vb_activity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.onView(withText(R.string.hello_from_vb_bindfragment))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.onView(withText(R.string.hello_from_vb_inflatefragment))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}
