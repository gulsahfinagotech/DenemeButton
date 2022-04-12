package com.gulsahozaltun.denemebutton

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.gulsahozaltun.denemebutton.databinding.CustomButtonBinding

class CustomButton : ConstraintLayout {
    private lateinit var mBinding: CustomButtonBinding
    private var buttonColor = Color.GREEN
    private var buttonText = "Ekle"
    constructor(context: Context) : super(context) {
        initLayout()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initLayout()
    }

    constructor(context: Context, attrs: AttributeSet, defStylrAttr: Int) : super(context,
        attrs,
        defStylrAttr) {
        initLayout()
    }

    fun initLayout() {
        removeAllViews()
        mBinding = CustomButtonBinding.inflate(LayoutInflater.from(context), this, true)
        setTextColor(buttonColor)
          setTitle(buttonText)
    }

    fun setTextColor(color: Int) {
        mBinding.button.setBackgroundColor(color)
    }

    fun setTitle(title: String?) {
        mBinding.button.setText(title)
    }

}

/*
class CustomButton: RelativeLayout {
    private lateinit var mBinding: CustomButtonBinding


    constructor(context: Context):super(context){
        initLayout()
    }
    constructor(context: Context,attrs:AttributeSet):super(context,attrs){
        initLayout()
    }

    constructor(context: Context,attrs:AttributeSet,defStylrAttr:Int):super(context,attrs,defStylrAttr){
        initLayout()
    }

    fun initLayout(){
        removeAllViews()
        mBinding= DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.custom_button,this,true
        )
        mBinding.button.setBackgroundColor(Color.YELLOW)
        mBinding.button.setPadding(55,55,55,55)
    }



}*/
