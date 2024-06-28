
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Blue1
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                    MyApp()

        }
    }
}

@Composable
fun MyApp() {
    Column(
       modifier = Modifier
           .fillMaxSize()
           .background(Color(0xFF0096FF)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        SignUpScreen()
        Spacer(modifier = Modifier.height(10.dp))

        LoginScreen()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen() {
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text ="Sign Up", fontSize = 25.sp , color = Color.Black , fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(30.dp))


        OutlinedTextField(value = "", onValueChange =  {},
            label = { Text("Name") },
            maxLines = 1,
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF0096FF),
                unfocusedBorderColor = Color(0xFF0096FF),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)

        )
                    OutlinedTextField(value = "", onValueChange =  {},
            label = { Text("Email") },
            maxLines = 1,
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF0096FF),
                unfocusedBorderColor = Color(0xFF0096FF),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)

        )
        OutlinedTextField(value = "", onValueChange =  {},
            label = { Text("Password") },
            maxLines = 1,
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF0096FF),
                unfocusedBorderColor = Color(0xFF0096FF),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)

        )
        Spacer(modifier = Modifier.height(70.dp))
        Button(
            onClick = {},

            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            colors=ButtonDefaults.buttonColors(
                containerColor = Color(0xFF0096FF)
            )
        ) {
            Text("Sign up ")
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),



            ) {Spacer(modifier =Modifier.height(150.dp ))}
            Text(
                modifier = Modifier.padding(5.dp),
                text ="Already have an account?",
                color= Color.Black,
                fontSize = 16.sp,
            )
        Text(  modifier = Modifier.padding(5.dp),
            text ="Log in",
            color= Color.Blue,
            fontSize = 16.sp,)

        }
           }




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Log IN", fontSize = 25.sp, color = Color.Black , fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(value = "", onValueChange =  {},
            label = { Text("Email") },
            maxLines = 1,
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF0096FF),
                unfocusedBorderColor = Color(0xFF0096FF),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)

        )
        OutlinedTextField(value = "", onValueChange =  {},
            label = { Text("Password") },
            maxLines = 1,
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF0096FF),
                unfocusedBorderColor = Color(0xFF0096FF),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start=0.dp,end = 180.dp),

            ) {
            Checkbox(checked = false, onCheckedChange = {})
            Text("remember me")
        }
        Spacer(modifier = Modifier.height(70.dp))
        Button(
            onClick = {},

            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
                colors=ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF0096FF)
                )
        ) {
            Text("log in ")
        }
          Spacer(modifier =Modifier.height(20.dp) )
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),



            ) {Spacer(modifier =Modifier.height(150.dp ))}
            Text(
                modifier = Modifier.padding(5.dp),
                text = " Don't have an account?",
                color = Color.Black,
                fontSize = 16.sp,
            )
            Text( modifier = Modifier.padding(5.dp),
               text = "Sign up ",
               color = Color.Blue,
               fontSize = 16.sp,)
        }
    }
@Preview(showBackground = true)
@Composable
fun SignUpPreview(){
    SignUpScreen()
}
@Preview(showBackground = true)
@Composable
fun LoginPreview(){
    LoginScreen()
}