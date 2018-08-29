package com.vacuum.mvp2

class MainPresenterImpl(var m:MainView?, var getQuoteInteractor:GetQuoteInteractor)
    :MainPresenter,GetQuoteInteractor.onfinshedlistner {

    override fun onfinished(s: String) {
        if (m!= null){
            m?.setQuote(s)
            m?.hideProgress()
        }
    }







    override fun ondestpy() {
        m = null
    }

    override fun onButtonClick() {
        if (m != null) {
            m?.showProgress()
        }
        getQuoteInteractor.getnextquote(this)
    }

}