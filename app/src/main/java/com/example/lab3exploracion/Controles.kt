//AlertDialog
@Composable
fun AlertDialogExample() {
    var showDialog by remember { mutableStateOf(true) }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text("AlertDialog Title") },
            text = { Text("This is the body of the AlertDialog.") },
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    Text("OK")
                }
            }
        )
    }
}
//Card
@Composable
fun CardExample() {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 4.dp
    ) {
        Text("Card Content", modifier = Modifier.padding(16.dp))
    }
}
//Checkbox
@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }

    Row(Modifier.padding(8.dp)) {
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Text("Checkbox", modifier = Modifier.padding(start = 8.dp))
    }
}
//FloatingActionButton
@Composable
fun FloatingActionButtonExample() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text("+")
            }
        }
    ) {
        Text("FAB Example", Modifier.padding(16.dp))
    }
}
//Icon
@Composable
fun IconExample() {
    Icon(
        Icons.Default.Favorite,
        contentDescription = "Favorite",
        modifier = Modifier.padding(16.dp)
    )
}
//Image
@Composable
fun ImageExample() {
    Image(
        painter = painterResource(id = R.drawable.example_image),
        contentDescription = "Example Image",
        modifier = Modifier.fillMaxWidth()
    )
}
//ProgressBar
@Composable
fun ProgressBarExample() {
    CircularProgressIndicator(
        modifier = Modifier.padding(16.dp),
        progress = 0.75f
    )
}
//RadioButton
@Composable
fun RadioButtonExample() {
    var selected by remember { mutableStateOf(false) }

    Row(Modifier.padding(8.dp)) {
        RadioButton(
            selected = selected,
            onClick = { selected = !selected }
        )
        Text("RadioButton", modifier = Modifier.padding(start = 8.dp))
    }
}
//Slider
@Composable
fun SliderExample() {
    var value by remember { mutableStateOf(0.5f) }

    Slider(
        value = value,
        onValueChange = { value = it },
        modifier = Modifier.padding(16.dp)
    )
}
//Spacer
@Composable
fun SpacerExample() {
    Column {
        Text("Text 1")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Text 2")
    }
}
//Switch
@Composable
fun SwitchExample() {
    var checked by remember { mutableStateOf(false) }

    Row(Modifier.padding(8.dp)) {
        Switch(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Text("Switch", modifier = Modifier.padding(start = 8.dp))
    }
}
//TopAppBar
@Composable
fun TopAppBarExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("TopAppBar") },
                backgroundColor = MaterialTheme.colors.primary
            )
        }
    ) {
        Text("Content goes here", Modifier.padding(16.dp))
    }
}
//BottomNavigation
@Composable
fun BottomNavigationExample() {
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
                    label = { Text("Home") },
                    selected = selectedItem == 0,
                    onClick = { selectedItem = 0 }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = null) },
                    label = { Text("Favorites") },
                    selected = selectedItem == 1,
                    onClick = { selectedItem = 1 }
                )
            }
        }
    ) {
        Text("Bottom Navigation Example", Modifier.padding(16.dp))
    }
}
//Dialog
@Composable
fun DialogExample() {
    var showDialog by remember { mutableStateOf(true) }

    if (showDialog) {
        Dialog(onDismissRequest = { showDialog = false }) {
            Surface(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                color = MaterialTheme.colors.background
            ) {
                Text("This is a dialog", Modifier.padding(16.dp))
            }
        }
    }
}
//Divider
@Composable
fun DividerExample() {
    Column {
        Text("Above the Divider")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        Text("Below the Divider")
    }
}
//DropDownMenu
@Composable
fun DropDownMenuExample() {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Select an option") }

    Box(modifier = Modifier.padding(16.dp)) {
        Text(text = selectedOption, modifier = Modifier.clickable { expanded = true })

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(onClick = {
                selectedOption = "Option 1"
                expanded = false
            }) {
                Text("Option 1")
            }
            DropdownMenuItem(onClick = {
                selectedOption = "Option 2"
                expanded = false
            }) {
                Text("Option 2")
            }
        }
    }
}
//NavigationRail
@Composable
fun NavigationRailExample() {
    var selectedItem by remember { mutableStateOf(0) }

    NavigationRail {
        NavigationRailItem(
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text("Home") },
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 }
        )
        NavigationRailItem(
            icon = { Icon(Icons.Default.Favorite, contentDescription = null) },
            label = { Text("Favorites") },
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 }
        )
    }
}
//OutlinedTextFiled
@Composable
fun OutlinedTextFieldExample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Enter text") },
        modifier = Modifier.padding(16.dp)
    )
}
//Pager
// Necesitas añadir la dependencia de "accompanist-pager" para usar Pager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PagerExample() {
    val pagerState = rememberPagerState()

    HorizontalPager(
        count = 3,
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->
        Text("Page: $page", modifier = Modifier.fillMaxSize().padding(16.dp))
    }
}
//Snackbar
@Composable
fun SnackbarExample() {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.padding(16.dp)
    ) {
        Button(onClick = {
            coroutineScope.launch {
                scaffoldState.snackbarHostState.showSnackbar("This is a Snackbar")
            }
        }) {
            Text("Show Snackbar")
        }
    }
}
//TabRow
@Composable
fun TabRowExample() {
    var selectedTabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Tab 1", "Tab 2", "Tab 3")

    Column {
        TabRow(selectedTabIndex = selectedTabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = { Text(title) }
                )
            }
        }
        Text("Selected tab: ${tabs[selectedTabIndex]}", Modifier.padding(16.dp))
    }
}
