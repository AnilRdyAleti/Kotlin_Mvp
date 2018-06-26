package com.example.anilreddy.kotlin_mvp_android.mvp

open class BaseMvpPresenterImpl<V : BaseMvpView> : BaseMvpPresenter<V> {

    protected var mView: V? = null

    override fun detachView() {
        mView = null
    }

    override fun attachView(view: V) {
        mView = view
    }

}