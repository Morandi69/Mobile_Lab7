package com.example.mobile_lab7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var login:EditText
    private lateinit var password:EditText
    private lateinit var signinButton:Button
    private lateinit var forgotPass:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signinButton=findViewById(R.id.button_signin)
        login=findViewById(R.id.loginText)
        password=findViewById(R.id.passwordText)
        forgotPass=findViewById(R.id.forgotText)
        signinButton.setOnClickListener{
            if(login.text.toString()==getString(R.string.true_login)&&password.text.toString()==getString(R.string.true_pass)){
                Toast.makeText(this,"sign in completed",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Incorrect login or password",Toast.LENGTH_LONG).show()
            }
        }
        forgotPass.setOnClickListener {
            Toast.makeText(this,"Login: ${getString(R.string.true_login)}, Pass: ${ getString(R.string.true_pass)}",Toast.LENGTH_SHORT).show()
        }
    }
}