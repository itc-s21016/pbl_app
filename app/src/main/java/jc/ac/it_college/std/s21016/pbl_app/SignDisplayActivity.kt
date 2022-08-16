package jc.ac.it_college.std.s21016.pbl_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jc.ac.it_college.std.s21016.pbl_app.databinding.ActivitySignDisplayBinding

class SignDisplayActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}