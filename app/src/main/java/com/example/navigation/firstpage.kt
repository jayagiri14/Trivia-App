package com.example.navigation


import android.text.Layout.Alignment
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun firstpage(navigationtosecondpage:()->Unit){
    var showDialog1 by remember {
        mutableStateOf(false)
    }
    var showDialog2 by remember {
        mutableStateOf(false)
    }
    var showDialog3 by remember {
        mutableStateOf(false)
    }
    var showDialog4 by remember {
        mutableStateOf(false)
    }

    Column {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth().border(2.dp, Color.Black).background(Color.Gray), horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Trivia Game",  fontWeight = FontWeight.Bold, fontSize = 35.sp
            )
        }




        //question 1
        Row(modifier = Modifier
            .padding(50.dp)
            .fillMaxWidth(),horizontalArrangement = Arrangement.Center) {
            Text(text = "1.What is India's capital",  fontWeight = FontWeight.Bold, fontSize = 27.sp, modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center)
        }
        //options
        Row(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
            Button(onClick = { showDialog1=true }) {
                Text(text = "1)Delhi", fontSize = 26.sp,modifier = Modifier.fillMaxWidth().padding(20.dp))

            }
            if(showDialog1){
                AlertDialog(onDismissRequest = { showDialog1=false }, title ={ Text(text = "You are correct🎉🎉", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)},confirmButton = { /*TODO*/ })
            }
        }
        Row(modifier = Modifier.fillMaxWidth().padding(20.dp)){
            Button(onClick = { showDialog2=true },Modifier.wrapContentSize()) {
                Text(text = "2)Mumbai",fontSize = 26.sp,modifier = Modifier.fillMaxWidth().padding(20.dp))
            }
            if(showDialog2){
                AlertDialog(onDismissRequest = { showDialog2=false }, title ={ Text(text = "Wrong answer😔,Try again", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)},confirmButton = { /*TODO*/ })
            }
        }
        Row(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
            Button(onClick = { showDialog3=true },Modifier.wrapContentSize()) {
                Text(text = "3)Chennai",fontSize = 26.sp,modifier = Modifier.fillMaxWidth().padding(20.dp))
            }
            if(showDialog3){
                AlertDialog(onDismissRequest = { showDialog3=false }, title ={ Text(text = "Wrong answer😔,Try again", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)},confirmButton = { /*TODO*/ })
            }
        }
        Row(modifier = Modifier.fillMaxWidth().padding(20.dp)){
            Button(onClick = { showDialog4=true },Modifier.wrapContentSize()) {
                Text(text = "4)Kolkata",fontSize = 26.sp,modifier = Modifier.fillMaxWidth().padding(20.dp))
            }
            if(showDialog4){
                AlertDialog(onDismissRequest = { showDialog4=false }, title ={ Text(text = "Wrong answer😔,Try again", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)},confirmButton = { /*TODO*/ })
            }
        }

        //navigate
        Row{
            Button(onClick = { navigationtosecondpage()}, colors = ButtonDefaults.buttonColors(Color.Magenta)) {
                Text(text = "Next question")
                Icon(Icons.Default.ArrowForward, contentDescription = " ")
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun firstpagepreview(){
    firstpage ({})
}