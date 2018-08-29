package com.vacuum.mvp2

import android.os.Handler
import java.util.*

class GetQuoteInteractorImpl : GetQuoteInteractor {
    val arr = arrayOf("numberone","number two","number three","number four","number four","number four")

    override fun getnextquote(c: GetQuoteInteractor.onfinshedlistner) {
        Handler().postDelayed({c.onfinished(getrandom())},3000)
    }

    fun getrandom():String{
        val r  = Random()
        var x = r.nextInt(arr.size)
        return arr[x]
    }
}