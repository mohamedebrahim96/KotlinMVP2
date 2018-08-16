package com.vacuum.mvp2

class MainPresenterImpl(var main:MainView?,var geetquote:GetQuoteInteractor) :MainPresenter,GetQuoteInteractor.OnFinishedListener {






    override fun onFinished(string: String) {
        if (main != null)
            main?.setQuote(string)
            main?.hideProgress()

    }

    override fun onButtonClick() {
        if(main == null)
            main?.showProgress()

        geetquote.getNextQuote(this)
    }

    override fun onDestroy() {
        main = null
    }


}