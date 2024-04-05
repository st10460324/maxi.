@file:Suppress("DUPLICATE_LABEL_IN_WHEN")

package com.example.myApp

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myApp.R.*



class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    @SuppressLint("SetTextI18n", "MissingSuperCall", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, inset ->
            val systemBars = inset.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            inset


            //Heading of History App

        }
        /* Declarations */

        val generateButton = findViewById<Button>(id.generateButton)
        val clearButton = findViewById<Button>(id.clearButton)
        val numTextNumber = findViewById<EditText>(id.numTextNumber)
        val resultTextView = findViewById<TextView>(id.resultTextView)
        generateButton.setOnClickListener {

            /* if else statement */
            val age = numTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                resultTextView.text = "please enter a valid age"


            } else {

                if (age < 20 || age > 100) {
                    resultTextView.text = "please enter a valid age between 20 to 100"
                    numTextNumber.text.clear()
                } else {
                    /* 10 Dead Famous People I chose */
                    val result = when (age) {
                        95 -> "Nelson Mandela was a South African unit – apartheid activist and politician who served as the first president of South Africa from 1994 to 1999. He was the country's first black head of state and the first elected in a fully representative democratic election."
                        39 -> "Bob Marley was well known for reggae music Bob Marley went from being a pioneering but largely unknown reggae singer to an international superstar of an unprecedented popularity. "
                        50 -> "Michael Jackson was well known for his music, and he was the king of pop "
                        25 -> "Tupac Shakur was undoubtedly one of the greatest influences in hip hop culture. The legendary artist not only sold over 75 million records worldwide, but he was also known as an actor, activist, entertainer, poet, and passionate leader and he used thug life image to market himself so he could be able to connect with young males "
                        30 -> "Steve Biko was well known for being anti-apartheid activist. Ideologically an African nationalist and African socialist ,he was at the forefront of a grassroots anti-apartheid campaign known as the Black Consciousness Movement g a   "
                        76 -> "who is widely held to be one of the greatest and most influential scientists of all time. Best known for developing the theory of relativity   "
                        84 -> "Karl Benz is well known for being mechanical engineer who designed and in 1885 built the world’s first practical automobile to be powered by an internal-combustion engine "
                        75 -> "Alexander Graham Bell was well known for being an inventor, scientist and engineer who is credited with patenting the first practical telephone. "
                        84 -> "William Higinbotham was an American physicist . A member of the team that developed the first nuclear  bomb ,he later became a leader in the nonproliferation movement. He also has a place in the history of video games for his 1958 creation of Tennis for Two, the first interactive analog computer game and one of the first electronic games to use a graphical display. "
                        85 -> "Joseph Swan He is known as an independent early developer of a successful incandescent light bulb. "

                        else -> "No one Died at this age, try a different one!"

                    }
                    resultTextView.text = result

                }

            }
            clearButton.setOnClickListener {
                numTextNumber.text.clear()
                resultTextView.text = ""
            }


        }


    }

    }






