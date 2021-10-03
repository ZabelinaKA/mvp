package com.trateg.basemvp.main

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.trateg.basemvp.BaseFragment
import com.trateg.basemvp.BasePresenter
import com.trateg.basemvp.BaseView

interface MainContract {
    interface Presenter: BasePresenter {
        fun onViewCreated(isRestored: Boolean)
        fun onBackPressed()
        fun onSaveInstanceState(outState: Bundle)
        fun onRestoreInstanceState(savedInstanceState: Bundle)
    }

    interface View: BaseView<Presenter> {
        fun getFragmentHolderId(): Int
        fun getMainFragmentManager(): FragmentManager
        fun getBottomNavigation(): BottomNavigationView
        fun finishActivity()
    }
}
