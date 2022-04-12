package com.gulsahozaltun.denemebutton

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.gulsahozaltun.denemebutton.databinding.CuitextViewBinding

class CUITextView: ConstraintLayout {
    private lateinit var binding: CuitextViewBinding
    private var textViewText="A Ödeme'ye Hoş Geldiniz"
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
        binding= CuitextViewBinding.inflate(LayoutInflater.from(context),this,true)
        setTextColor(textColor)
        setTextSize(textSize)
        binding.textView.setText(textViewText)
    }
    fun setTextSize(size:Float){
        binding.textView.setTextSize(size)
    }
    fun setTextColor(color: Int) {
        binding.textView.setTextColor(color)
    }
}