package com.trateg.basemvp.settings

import com.trateg.basemvp.BasePresenter
import com.trateg.basemvp.BaseView


interface SettingsContract{
    interface Presenter: BasePresenter {
        fun onViewCreated()
        fun addFragment()
    }

    interface View:
        BaseView<Presenter> {
    }
}