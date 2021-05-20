package com.example.quizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity() {

    private var mCurrentPosition : Int = 1
    private var mQuestionList: ArrayList<Question> ?= null
    private var mSelectedOptionPosition : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mQuestionList = Constants.getQuestions()
        Log.i("Questions Size","${mQuestionList!!.size}")

        val currentPosition = 1
        val question : Question?= mQuestionList!![currentPosition-1]

        progressBar.progress = currentPosition
        tv_progress.text = "$currentPosition/" + progressBar.max

        tv_question.text = question!!.question
        tv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour

        setQuestion()

    }
    private fun setQuestion(){
        mCurrentPosition = 1
        val question = mQuestionList!![mCurrentPosition-1]

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition/" + progressBar.max

        tv_question.text = question!!.question
        tv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }


}