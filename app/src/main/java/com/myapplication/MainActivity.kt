package com.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        wee02Variables()
    }
}

fun week02Functions() {
    println("week02 Functions")

    // fun greet(name : String) = "hello $name!"
    fun greet(name : String): String{
        return "hello $name!"
    }

    fun add(a : Int , b : Int) = a + b

    fun introduce(name: String , age: Int = 19){
        println("my name is $name and I'm $age years old")
    }

    println(greet("Kotlin"))
    println("Sum : ${add(5,-71)}")
    introduce("Park")
    introduce("Kim",29)

    println(greet("Android Developer"))
}

fun wee02Variables() {
    println("Week02 Variables")
/*
    val courseName = "Mobile Programming" // 상수

    var week = 1
    week = 2

    println("Course : $courseName")
    println("Course : $week")
*/
    val name : String = "Android"
    var version : Double = 8.1
    println("Hello $name $version")


    val age: Int = 24
    val height : Double = 173.3
    val isStudent : Boolean = true

    println("Age : $age, Height : $height, isStudent : $isStudent")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}