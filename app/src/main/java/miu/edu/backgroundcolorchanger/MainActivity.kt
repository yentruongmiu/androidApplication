package miu.edu.backgroundcolorchanger

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import miu.edu.backgroundcolorchanger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    internal lateinit var layout: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            var color = (Math.random() * 16777215).toInt() or (0xFF shl 24)
            layout = findViewById(R.id.mainlayout)
            layout.setBackgroundColor(color)
        }
        binding.button2.setOnClickListener{
            var color = (Math.random() * 16777215).toInt() or (0xFF shl 24)
            it.setBackgroundColor(color)
        }
    }

}
