package com.gulsahozaltun.denemebutton

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import com.andrognito.pinlockview.PinLockListener
import com.gulsahozaltun.denemebutton.databinding.CuipinViewBinding

class CUIPinView : ConstraintLayout {
    private lateinit var binding: CuipinViewBinding
    val TAG = "PinLockView"

    constructor(context: Context) : super(context) {
        initLayout()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initLayout()
    }

    constructor(context: Context, attrs: AttributeSet, defStylrAttr: Int) : super(
        context,
        attrs,
        defStylrAttr
    ) {
        initLayout()
    }

    fun initLayout() {
        removeAllViews()

        binding = CuipinViewBinding.inflate(LayoutInflater.from(context), this, true)

/*        with(binding.pinView) {
            addTextChangedListener {
                @Override
                fun beforeTextChanged() {

                }

                @Override
                fun onTextChanged() {
                    //Log.d(TAG, "onTextChanged() called with: s = [" + s + "], start = [" + start + "], before = [" + before + "], count = [" + count + "]");
                }

                @Override
                fun afterTextChanged() {

                }
            }
        }*/


        binding.pinView.doAfterTextChanged {
                if(binding.pinView.text?.length==6){
                    var girilenVERİ=binding.pinView.text
                    Log.e("PİNVİEW VERİ",girilenVERİ.toString())
                    Toast.makeText(context,girilenVERİ,Toast.LENGTH_SHORT).show()
                }

        }

    }





}

