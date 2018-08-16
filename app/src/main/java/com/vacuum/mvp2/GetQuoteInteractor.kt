package com.vacuum.mvp2

open interface GetQuoteInteractor {
    interface OnFinishedListener{
        fun onFinished(string: String)
    }

    fun getNextQuote(onFinishedListener: OnFinishedListener)

}