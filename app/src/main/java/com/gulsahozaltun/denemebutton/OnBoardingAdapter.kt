package com.gulsahozaltun.denemebutton

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gulsahozaltun.denemebutton.databinding.CuionboardingScreenBinding

class OnBoardingAdapter(
    var mcontext: Context,
    var newsList: List<OnBoardingModel>,
): RecyclerView.Adapter<OnBoardingAdapter.PagerViewHolder>()  {

    inner class PagerViewHolder(pagerBinding:CuionboardingScreenBinding):RecyclerView.ViewHolder(pagerBinding.root){
        var pagerItems:CuionboardingScreenBinding
        init {
            this.pagerItems=pagerBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val layoutInflater = LayoutInflater.from(mcontext)
        val design = CuionboardingScreenBinding.inflate(layoutInflater,parent,false)
        return PagerViewHolder(design)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        var list=newsList.get(position)
        var view=holder.pagerItems
        view.listObj=list
    }

    override fun getItemCount(): Int {
        return newsList.size
    }


}