package com.gulsahozaltun.denemebutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.andrognito.pinlockview.IndicatorDots
import com.gulsahozaltun.denemebutton.databinding.CuiindicatorDotsBinding
import com.gulsahozaltun.denemebutton.databinding.PinlockViewBinding

class PinLockIndicators:ConstraintLayout {
    private lateinit var binding: CuiindicatorDotsBinding
    constructor(context: Context):super(context){
        initLayout()
    }
    constructor(context: Context, attrs: AttributeSet):super(context,attrs){
        initLayout()
    }

    constructor(context: Context, attrs: AttributeSet, defStylrAttr:Int):super(context,attrs,defStylrAttr){
        initLayout()
    }



    fun initLayout(){
        removeAllViews()
        binding= CuiindicatorDotsBinding.inflate(LayoutInflater.from(context),this,true)
        binding.indicatorDots.indicatorType= IndicatorDots.IndicatorType.FILL_WITH_ANIMATION

    }
}