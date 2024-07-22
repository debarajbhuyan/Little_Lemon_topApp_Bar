package mata.devraj.littlelemontopappbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
//    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior()
    androidx.compose.material3.TopAppBar(
        title = { Text("My App") },
//        scrollBehavior = scrollBehavior,
        actions = { // Place the Row within the 'actions' parameter
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = {
                }) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_hamburger_menu),
                        contentDescription = "Hamburger Menu",
                        modifier = Modifier.size(24.dp)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Little Lemon Logo",
                    modifier = Modifier
                        .fillMaxWidth(.5f)
                        .padding(horizontal = 20.dp)
                )
                IconButton(onClick = { /*TODO*/ }) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_cart),
                        contentDescription = "Cart",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTopAppBar() {
    TopAppBar()
}