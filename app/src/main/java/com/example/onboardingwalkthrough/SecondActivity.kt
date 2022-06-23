package com.example.onboardingwalkthrough

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetSequence
import com.getkeepsafe.taptargetview.TapTargetView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button6)
        val fab : FloatingActionButton = findViewById(R.id.floatingActionButton)



        TapTargetSequence(this)
            .targets(
                TapTarget.forView(button2, "Button 2", "This is button 1")
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
                    .targetRadius(60),
                TapTarget.forView(button3, "Button 3", "This is button 3")
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
                    .targetRadius(60),
                TapTarget.forView(button4, "Button 4", "This is button 4")
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
                    .targetRadius(60),
                TapTarget.forView(button5, "Button 5", "This is button 5")
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
                    .targetRadius(60),
                TapTarget.forView(fab, "Floating Action Button", "This is a Floating Action Button")
                    .outerCircleColor(R.color.Red)
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
                    .targetRadius(60)
            ).listener(object : TapTargetSequence.Listener {
                override fun onSequenceFinish() {
                    Toast.makeText(applicationContext, "Sequence Finished", Toast.LENGTH_SHORT).show()
                }

                override fun onSequenceStep(lastTarget: TapTarget?, targetClicked: Boolean) {
                    Toast.makeText(applicationContext, "GREAT", Toast.LENGTH_SHORT).show()
                }

                override fun onSequenceCanceled(lastTarget: TapTarget?) {
                }
            }).start()
    }
}