package com.vacuum.mvp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),MainView {
    private var presenter : MainPresenterImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenterImpl(this, GetQuoteInteractorImpl())

        button.setOnClickListener { presenter?.onButtonClick() }
    }









    override fun showProgress() {
        progressBar.visibility = View.VISIBLE
        textView.visibility = View.INVISIBLE
    }

    override fun hideProgress() {
        progressBar.visibility = GONE
        textView.visibility = VISIBLE
    }


    override fun setQuote(string: String) {
        textView.setText(string)
    }




    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }





}
