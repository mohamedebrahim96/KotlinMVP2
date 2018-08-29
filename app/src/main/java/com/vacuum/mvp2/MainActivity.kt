package com.vacuum.mvp2

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(),MainView {


    var  presenter : MainPresenterImpl? = null
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenterImpl(this,GetQuoteInteractorImpl())
        button.setOnClickListener { presenter?.onButtonClick() }


    }
















    override fun showProgress() {

    }

    override fun hideProgress() {
    }

    override fun setQuote(string: String) {
    }
}