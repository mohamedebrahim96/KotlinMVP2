package com.vacuum.mvp2

interface GetQuoteInteractor {
    interface onfinshedlistner{
        fun onfinished(s:String)
    }

    fun getnextquote(c: onfinshedlistner)

}




