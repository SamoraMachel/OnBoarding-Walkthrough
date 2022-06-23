package com.example.onboardingwalkthrough

import android.content.Intent
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetView

class MainActivity : AppCompatActivity() {


    lateinit var secondActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        secondActivity = findViewById(R.id.button)

        TapTargetView.showFor(
            this,
            TapTarget.forView(secondActivity, "This is a button", "You will be redirected to the second activity")
                .outerCircleColor(R.color.teal_non_opaque)
                .targetCircleColor(R.color.white)
                .titleTextSize(18)
                .titleTextColor(R.color.white)
                .descriptionTextSize(14)
                .descriptionTextColor(R.color.black)
                .textTypeface(Typeface.SANS_SERIF)
                .dimColor(R.color.black)
                .drawShadow(false)
                .cancelable(true)
                .tintTarget(true)
                .transparentTarget(true)
                .targetRadius(70),
            object : TapTargetView.Listener() {
                override fun onTargetClick(view: TapTargetView?) {
                    super.onTargetClick(view)
                    val i = Intent(applicationContext, SecondActivity::class.java)
                    startActivity(i)
                    finish()
                }
            }
        )

    }
}