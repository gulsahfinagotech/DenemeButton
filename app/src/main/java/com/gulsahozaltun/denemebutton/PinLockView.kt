package com.gulsahozaltun.denemebutton

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.andrognito.pinlockview.PinLockListener
import com.gulsahozaltun.denemebutton.databinding.PinlockViewBinding

class PinLockView:ConstraintLayout {
    private lateinit var binding:PinlockViewBinding
    private var mPinLockView: PinLockView? = null

    val TAG = "PinLockView"
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
        binding= PinlockViewBinding.inflate(LayoutInflater.from(context),this,true)
        with(binding.pinLockView){
            setPinLockListener(mPinLockListener)
            attachIndicatorDots(binding.indicatorDots)
        }

    }


    private val mPinLockListener: PinLockListener = object : PinLockListener {
        override fun onComplete(pin: String) {
            Log.d(TAG, "Pin complete: $pin")
                Toast.makeText(context,"tamamlandı",Toast.LENGTH_SHORT).show()
        }

        override fun onEmpty() {
            Log.d(TAG, "Pin empty")
        }

        override fun onPinChange(pinLength: Int, intermediatePin: String) {
            Log.d(TAG,
                "Pin changed, new length $pinLength with intermediate pin $intermediatePin")
        }
    }





}