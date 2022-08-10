package jc.ac.it_college.std.s21016.pbl_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jc.ac.it_college.std.s21016.pbl_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}

    //戻るボタン
    //後ほどサブ画面に書く
    /*binding.backButton.setOnClickListener {
        finish()
    }*/