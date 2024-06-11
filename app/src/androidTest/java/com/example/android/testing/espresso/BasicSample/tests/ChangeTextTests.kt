package com.example.android.testing.espresso.BasicSample.tests

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.data.ConstantData
import com.example.android.testing.espresso.BasicSample.steps.FirstPageActionSteps
import com.example.android.testing.espresso.BasicSample.steps.NewActivitySteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkChangeTextButtonFunctional(){
        with(FirstPageActionSteps){
            changeTextActionStep(ConstantData.firstName)
            tapChangeTextButton()
            firstPageTextValidator(ConstantData.firstName)
        }
    }

    @Test
    fun checkNewActivityFunctional(){
        with(FirstPageActionSteps){
            changeTextActionStep(ConstantData.movieName)
            tapChangeTextButton()
            firstPageTextValidator(ConstantData.movieName)
            clearTextAction()
            changeTextActionStep(ConstantData.differentMovieName)
            openActivityAndChangeTextAction()
        }
        with(NewActivitySteps){
            newActivityTextValidator(ConstantData.differentMovieName)
        }
    }

}