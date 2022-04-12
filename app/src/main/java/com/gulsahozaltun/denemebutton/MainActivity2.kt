package com.gulsahozaltun.denemebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.gulsahozaltun.denemebutton.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    private lateinit var adapter:OnBoardingAdapter
    private lateinit var list:ArrayList<OnBoardingModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main2)

        val c1=OnBoardingModel("Yeni Ürunler","yeni")
        val c2=OnBoardingModel("İndirimler","firsat")
        val c3=OnBoardingModel("Uygulama hakkında","hakkında")
        list= ArrayList()
        list.add(c1)
        list.add(c2)
        list.add(c3)
        adapter=OnBoardingAdapter(this,list)
        setUpIndicators()
        setCurrentIndicators(0)
        binding.viewPager.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicators(position)
            }
        })
        binding.pagerBinding=adapter
    }

    private fun setUpIndicators(){
        val indicators= arrayOfNulls<ImageView>(adapter.itemCount)
        val layoutParams:LinearLayout.LayoutParams= LinearLayout.LayoutParams(WRAP_CONTENT,WRAP_CONTENT)
            layoutParams.setMargins(8,0,8,0)
            for(i in indicators.indices){
                indicators[i]= ImageView(applicationContext)
                indicators[i]?.apply {
                    this.setImageDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.onboarding_indicator_inactive
                        )
                    )
                    this.layoutParams=layoutParams
                }
                binding.indicatorContainer.addView(indicators[i])
            }
    }

    private fun setCurrentIndicators(index:Int){
        val childCount=binding.indicatorContainer.childCount
        for(i in 0 until childCount){
            val imageView=binding.indicatorContainer[i] as ImageView
            if(i == index){
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.onboarding_indicator_active
                    )
                )

                }else{
                    imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            R.drawable.onboarding_indicator_inactive
                        )
                    )
            }
            }
        }
    }
