package com.trateg.basemvp.profile

import com.trateg.basemvp.BasePresenter
import com.trateg.basemvp.BaseView


interface ProfileContract{
    interface Presenter: BasePresenter {
        fun onViewCreated()
        fun addFragment()
    }

    interface View:
        BaseView<Presenter> {
    }
}