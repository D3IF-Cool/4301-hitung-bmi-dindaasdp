package org.d3if1013.hitungbmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        binding.button.setOnClickListener { hitungBmi() }
//    }
//
//    private fun hitungBmi() {
////        val berat = binding.beratEditText.text.toString().toFloat()
////        val tinggi = binding.tinggiEditText.text.toString().toFloat() / 100
////        val bmi = berat / (tinggi * tinggi)
//
//        val berat = binding.beratEditText.text.toString()
//        if (TextUtils.isEmpty(berat)) {
//            Toast.makeText(this, R.string.berat_invalid, Toast.LENGTH_LONG).show()
//            return
//        }
//
//        val tinggi = binding.tinggiEditText.text.toString()
//        if (TextUtils.isEmpty(tinggi)) {
//            Toast.makeText(this, R.string.tinggi_invalid, Toast.LENGTH_LONG).show()
//            return
//        }
//        val tinggiCm = tinggi.toFloat() / 100
//
//        val selectedId = binding.radioGroup.checkedRadioButtonId
//        if (selectedId == -1) {
//            Toast.makeText(this, R.string.gender_invalid, Toast.LENGTH_LONG).show()
//            return
//        }
//
//        val isMale = selectedId == R.id.priaRadioButton
//        val bmi = berat.toFloat() / (tinggiCm * tinggiCm)
//        val kategori = getKategori(bmi, isMale)
//
//        binding.bmiTextView.text = getString(R.string.bmi_x, bmi)
//        binding.kategoriTextView.text = getString(R.string.kategori_x, kategori)
//    }
//
//    private fun getKategori(bmi: Float, isMale: Boolean): String {
//        val stringRes = if (isMale){
//            when {
//                bmi < 20.5 -> R.string.kurus
//                bmi >= 27.0 -> R.string.gemuk
//                else -> R.string.ideal
//            }
//        } else {
//            when {
//                bmi < 18.5 -> R.string.kurus
//                bmi >= 25.0 -> R.string.gemuk
//                else -> R.string.ideal
//            }
//        }
//        return getString(stringRes)
//    }
}