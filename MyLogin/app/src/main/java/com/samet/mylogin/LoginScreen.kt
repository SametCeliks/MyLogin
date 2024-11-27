package com.samet.mylogin

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen(){

    var email by remember {
        mutableStateOf("")
    }

    var password by remember{
        mutableStateOf("")
    }
    

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Image(painter = painterResource(R.drawable.a), contentDescription = "Login image",
            modifier = Modifier.size(200.dp))

        Text(text = "Welcome Back",fontSize=28.sp,fontWeight=FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email=it
        }, label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password=it
        }, label = {
            Text(text = "Password")
        }, visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credential","Email:$email Password: $password")
        }){
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(32.dp))


        Text(text = "Forgot Password?", Modifier.clickable {


        })

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Or sign in with")
        Row (
            modifier = Modifier.fillMaxWidth().padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id=R.drawable.f), contentDescription = "Facebook", modifier = Modifier.size(60.dp).clickable {
                //Facebook clickable
            })

            Image(painter = painterResource(id=R.drawable.g), contentDescription = "Google", modifier = Modifier.size(60.dp).clickable {
                //Google clickable
            })

            Image(painter = painterResource(id=R.drawable.x), contentDescription = "X", modifier = Modifier.size(60.dp).clickable {
                //X clickable
            })
        }







    }


}