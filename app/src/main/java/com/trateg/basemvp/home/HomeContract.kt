package com.trateg.basemvp.home

import com.trateg.basemvp.BasePresenter
import com.trateg.basemvp.BaseView


interface HomeContract{
    interface Presenter: BasePresenter {
        fun onViewCreated()
        fun addFragment()
    }

    interface View: BaseView<Presenter> {
    }
}