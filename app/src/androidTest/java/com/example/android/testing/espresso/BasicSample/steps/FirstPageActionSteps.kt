package com.example.android.testing.espresso.BasicSample.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.clearText
import com.example.android.testing.espresso.BasicSample.Helper.getText
import com.example.android.testing.espresso.BasicSample.Helper.tap
import com.example.android.testing.espresso.BasicSample.Helper.typeText
import com.example.android.testing.espresso.BasicSample.assertIsViewDisplayed
import com.example.android.testing.espresso.BasicSample.pages.ChangeTextPage
import org.junit.Assert

object FirstPageActionSteps {

    fun changeTextActionStep(text : String){
        ChangeTextPage.TextInputField.typeText(text)
    }

    fun tapChangeTextButton(){
        ChangeTextPage.ChangeTextBtn.tap()
    }

    fun openActivityAndChangeTextAction(){

        ChangeTextPage.ActivityChangeTextBtn.tap()
    }

    fun clearTextAction(){
        onView(ChangeTextPage.TextInputField).perform(clearText())
    }

    fun firstPageTextValidator(text : String){
        Assert.assertEquals(ChangeTextPage.TextViewField.getText(), text)
    }

}