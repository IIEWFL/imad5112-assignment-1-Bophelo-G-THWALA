package com.example.historyagecalculatorapp

import android.icu.util.Output
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



val CurrentYear = findViewById<EditText>(R.id.CurrentYear).text
            val YearofBirth = findViewById<EditText>(R.id.YearofBirth).text
            var Answer = findViewById<EditText>(R.id.Answer).text
            val AgeResult = findViewById<TextView>(R.id.AgeResult)




            val CalculateButton = findViewById<Button>(R.id.CalculateButton)

            CalculateButton.setOnClickListener {
                val Answer = CurrentYear.toString().toDouble() - YearofBirth.toString().toDouble()

                AgeResult.text = "Your age is ${Answer.toString()}"

            //Check if this 'if' statement is true
                if (Answer < 20) {
                print("Your age is too low")

            }else if (Answer > 100) {
                print("Your age is too high") }
//check if this 'when' statement is true
                when(Answer.toString()) {

                "33" -> print("Your age is ${Answer.toString()}, same age as Jesus Christ," +
                       "Son of God who died for the world's sins")
                               "35" -> print("Your age is ${Answer.toString()}, " +
                                       "same age as Wolfgang Mozart, an austrian Composer")

                "39" -> print("Your age is ${Answer.toString()},same as Martin Luther King Jr., " +
                        "an american minister and activist")

                "51" -> print("Your age is ${Answer.toString()}, same age as Napoleon Bonaparte," +
                        "the former Emperor of France ")

                "52" -> print("Your age is ${Answer.toString()}, same age as William Shakespeare, " +
                           "an english playwright and poet")

                "56" -> print("Your age is ${Answer.toString()}, same age as Abraham Lincoln, " +
                           "the 16th president of the United States")

                "67" -> print("Your age is ${Answer.toString()},same age as Leonardo da Vinci, " +
                           "an italian polymath and inventor")

                "74" -> print("Your age is ${Answer.toString()},same age as Joseph Stalin, " +
                           "the leader of the Soviet Union")

                "78" -> print("Your age is ${Answer.toString()}, same age as Mahatma Gandhi, " +
                           "an Indian lawyer and activist")

                "96" -> print("Your age is ${Answer.toString()}, same age as Queen Elizabeth II, " +
                           "the former Queen of England")

                }


























































