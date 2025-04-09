package me.santiagorodriguez.ecommerceapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import me.santiagorodriguez.ecommerceapp.ui.theme.EcommerceAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }) { Icon(Icons.Default.ArrowBack, contentDescription = null) } },

                )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 32.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                imageVector = Icons.Default.Person,
                contentDescription = "Register",
                modifier = Modifier.size(150.dp)
            )
            Text(
                text = "Registrar Usuario",
                fontSize = 24.sp,
                color = Color(0xFFFF99900),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text("Nombre completo")
                },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email",
                        tint = Color(0xFFFF9900)
                    )
                },
                shape = RoundedCornerShape(12.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text("Correo electronico")
                },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email",
                        tint = Color(0xFFFF9900)
                    )
                },
                shape = RoundedCornerShape(12.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text("Contraseña")
                },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Contraseña",
                        tint = Color(0xFFFF9900)
                    )
                },
                shape = RoundedCornerShape(12.dp)

            )

            Spacer(modifier = Modifier.height(24.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text("Confirmar Contraseña")
                },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Contraseña",
                        tint = Color(0xFFFF9900)
                    )
                },
                shape = RoundedCornerShape(12.dp)

            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF9900)
                ), modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) { Text("Iniciar Sesion", fontSize = 16.sp) }
            Spacer(modifier = Modifier.height(24.dp))

        }
    }


}


@Preview
@Composable
fun RegisterScreenPrevies() {
    EcommerceAppTheme {

        //RegisterScreen()
    }

}