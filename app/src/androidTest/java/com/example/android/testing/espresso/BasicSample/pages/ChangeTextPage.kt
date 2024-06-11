package com.example.android.testing.espresso.BasicSample.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object ChangeTextPage {
    val TextInputField: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
    val ChangeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val ActivityChangeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.activityChangeTextBtn) }
    val TextViewField: Matcher<View> by lazy { ViewMatchers.withId(R.id.textToBeChanged) }
}