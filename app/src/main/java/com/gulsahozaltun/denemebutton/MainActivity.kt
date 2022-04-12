package com.gulsahozaltun.denemebutton

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.gulsahozaltun.denemebutton.databinding.ActivityMainBinding
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var button:CustomButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button=this
        button= CustomButton(this)
        button.setTextColor(12)
        getHardwareId(this)

    }
    fun getHardwareId(context: Context): String? {
        val value= Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID)
        Toast.makeText(this,value.toString(), Toast.LENGTH_SHORT).show()
        Log.e("DENEME",value.toString())
        return value

    }



}