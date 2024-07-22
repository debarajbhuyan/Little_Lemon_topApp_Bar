package mata.devraj.littlelemontopappbar

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope

@Composable
fun DrawerPanel(scaffoldState: ScaffoldState, scope: CoroutineScope) {
    List(10) {Text("Item $it", modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp))}
    IconButton(onClick = { }) {
        Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Exit")
    }
}