package com.vacuum.mvp2

import android.os.Handler
import java.util.*

open class GetQuoteInteractorImpl:GetQuoteInteractor {


    private val arr = arrayListOf("Be yourself. everyone else is already taken.",
            "A room without books is like a body without a soul.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world.",
            "If you tell the truth, you don't have to remember anything.")


    override fun getNextQuote(onFinishedListener: GetQuoteInteractor.OnFinishedListener) {
        Handler().postDelayed({ onFinishedListener.onFinished(getRandomString()) }, 1200)
    }

    fun getRandomString():String {
        val ran = Random()
        val x = ran.nextInt(arr.size)
        return arr[x]
    }
}