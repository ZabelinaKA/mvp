package com.trateg.basemvp.home

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.trateg.basemvp.BaseFragment
import com.trateg.basemvp.SecondFragment.SecondFragment
import com.trateg.basemvp.util.FragMan


abstract class HomePresenter(var mView: HomeContract.View?) :
    HomeContract.Presenter {

    companion object{
        const val KEY_TITLE: String = "KEY_TITLE"
        var mFragmentCount = 0
        fun newInstance(args: Bundle? = null): BaseFragment {
            val fragment = HomeFragment()
            args?.let { fragment.arguments = it }
            return fragment
        }
    }


    override fun onDestroy() {
        mView = null
        mFragmentCount--
    }

    override fun addFragment() {
        mFragmentCount++
        val instance = newInstance(Bundle() )
        FragMan.addFragment(instance)
    }

}