package com.gulsahozaltun.denemebutton

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.gulsahozaltun.denemebutton.databinding.CuiinputTextViewBinding

class CUIInputTextView: ConstraintLayout {
    private lateinit var binding: CuiinputTextViewBinding
    private var hint="Ad Soyad"
    private var textColor = Color.YELLOW
    private var textSize=20f

    constructor(context: Context):super(context){
        initLayout()
    }
    constructor(context: Context, attrs: AttributeSet):super(context,attrs){
        initLayout()
    }
    constructor(context: Context, attrs: AttributeSet, defStylrAttr:Int):super(context,attrs,defStylrAttr){
        initLayout()
    }
    private fun initLayout() {
        removeAllViews()
        binding= CuiinputTextViewBinding.inflate(LayoutInflater.from(context),this,true)
        setTextColor(textColor)
        setTextSize(textSize)
        binding.inputLayout.hint=hint
        inputBoxDesign()

    }
    fun setTextSize(size:Float){
        binding.inputEditText.setTextSize(size)
    }
    fun setTextColor(color: Int) {
        binding.inputEditText.setTextColor(color)
    }
    fun inputBoxDesign(){
        binding.inputLayout.boxStrokeColor= Color.BLUE
        binding.inputLayout.setBoxCornerRadii(55f,55f,55f,55f)
    }
}