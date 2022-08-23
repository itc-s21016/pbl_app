package jc.ac.it_college.std.s21016.pbl_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import jc.ac.it_college.std.s21016.pbl_app.databinding.ActivityDetailsScreenBinding
import jc.ac.it_college.std.s21016.pbl_app.databinding.ActivityMainBinding

class DetailsScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mParent = ViewGroup.LayoutParams.MATCH_PARENT
        val wContent = ViewGroup.LayoutParams.WRAP_CONTENT

        val scrollView = ScrollView(this)
        scrollView.layoutParams = LinearLayout.LayoutParams(wContent,mParent )

        val imageView = ImageView(this)

        // drawableの画像を指定
        imageView.setImageResource(R.drawable.cat2)

        imageView.layoutParams = LinearLayout.LayoutParams(wContent,mParent)

        //戻るボタン
        binding.btBack.setOnClickListener {
            finish()
        }
    }


}