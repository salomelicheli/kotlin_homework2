package com.example.android.testing.espresso.BasicSample.steps

import com.example.android.testing.espresso.BasicSample.Helper.getText
import com.example.android.testing.espresso.BasicSample.pages.NewActivityPage
import org.junit.Assert

object NewActivitySteps {
    fun newActivityTextValidator(text : String){
        Assert.assertEquals(NewActivityPage.TextView.getText(), text)
    }
}