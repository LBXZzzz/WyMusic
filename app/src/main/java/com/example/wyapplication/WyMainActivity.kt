package com.example.wyapplication

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.common.BaseActivity
import com.example.wyapplication.databinding.ActivityMainBinding

class WyMainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutId: Int
        get() = R.layout.activity_main

    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNav()
    }

    private fun initNav() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_wy) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.btNavWy, navController)
    }


}