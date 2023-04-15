package com.example.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<VB : ViewDataBinding> : AppCompatActivity() {

    protected abstract val layoutId: Int

    private var _binding: VB? = null

    protected val binding: VB get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDataBinding()
    }

    private fun initDataBinding() {
        _binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this
    }

}