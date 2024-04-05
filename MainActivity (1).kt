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

        val CurrentYear = findViewById<EditText>(R.id.CurrentYear).text


        val YearofBirth = findViewById<EditText>(R.id.YearofBirth).text


        val AgeResult = findViewById<TextView>(R.id.AgeResult)


        val CalculateButton = findViewById<Button>(R.id.CalculateButton)


        CalculateButton.setOnClickListener {
            val Answer = CurrentYear.toString().toDouble() - YearofBirth.toString().toDouble()


            AgeResult.text = "Your age is ${Answer.toString()}"

            // Check if these "if" statements are true
            if (Answer < 20) {
                AgeResult.text = "Your age ${Answer.toString()} is too low, " +
                        "please make sure you are 20 years old or older than 20."


            } else if (Answer > 100) {
                AgeResult.text = "Your age ${Answer.toString()} is too high, " +
                        "please make sure you are 100 years old or younger than 100."


            } else if (Answer == 25.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as Tupac Shakur, " +
                        "an american rapper."


            } else if (Answer == 33.0) {
                AgeResult.text = "Your age is ${Answer.toString()},same age as Jesus Christ, " +
                        "The Son Of God who died for the world's sins."


            } else if (Answer == 35.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, " +
                        "same age as Wolfgang Mozart, an austrian Composer."


            } else if (Answer == 39.0) {
                AgeResult.text =
                    "Your age is ${Answer.toString()},same age as Martin Luther King Jr.," +
                            "an american minister and activist."


            } else if (Answer == 41.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as Kobe Bryant, " +
                        "an american Basketball Player."


            } else if (Answer == 42.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as Elvis Presley, " +
                        "an american singer and actor. "


            } else if (Answer == 45.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as Freddie Mercury, " +
                        "a British singer and songwriter."


            } else if (Answer == 46.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as John F Kennedy, " +
                        "the 35th president of the United States."


            } else if (Answer == 51.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as " +
                        "Napoleon Bonaparte,the former Emperor of France. "


            } else if (Answer == 52.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as " +
                        "William Shakespeare, an english playwright and poet."


            } else if (Answer == 56.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as " +
                        "Abraham Lincoln, the 16th president of the United States."


            } else if (Answer == 67.0) {
                AgeResult.text = "Your age is ${Answer.toString()},same age as " +
                        "Leonardo da Vinci, an italian polymath and inventor."


            } else if (Answer == 78.0) {
                AgeResult.text = "Your age is ${Answer.toString()},same age as Mahatma Gandhi, " +
                        "an Indian lawyer and activist. "


            } else if (Answer == 84.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as " +
                        "Benjamin Franklin, one of the founding fathers of America."


            } else if (Answer == 95.0) {
                AgeResult.text = "Your age is ${Answer.toString()},same age as Nelson Mandela, " +
                        "a political freedom fighter against apartheid and " +
                        "became the first president of South Africa. "

            } else if (Answer == 98.0) {
                AgeResult.text = "Your age is ${Answer.toString()}, same age as Queen Elizabeth, " +
                        "the former Queen of England."
                }
            }

        }
    }





















































