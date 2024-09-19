// LazyColumn
@Composable
fun LazyColumnExample() {
    LazyColumn {
        items(10) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}

// LazyRow
@Composable
fun LazyRowExample() {
    LazyRow {
        items(10) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}

// Grid
@Composable
fun GridExample() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(8.dp)
    ) {
        items(10) { index ->
            Text("Item $index", modifier = Modifier.padding(8.dp))
        }
    }
}

// ConstraintLayout
@Composable
fun ConstraintLayoutExample() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (button, text) = createRefs()

        Button(onClick = {}, modifier = Modifier.constrainAs(button) {
            top.linkTo(parent.top, margin = 16.dp)
            start.linkTo(parent.start)
        }) {
            Text("Button")
        }

        Text("Hello Compose", modifier = Modifier.constrainAs(text) {
            top.linkTo(button.bottom, margin = 16.dp)
            start.linkTo(parent.start)
        })
    }
}

// Scaffold
@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Scaffold Example") }) },
        floatingActionButton = { FloatingActionButton(onClick = {}) { Text("+") } }
    ) {
        Text("Content goes here", modifier = Modifier.padding(16.dp))
    }
}

// Surface
@Composable
fun SurfaceExample() {
    Surface(
        modifier = Modifier.padding(16.dp),
        color = MaterialTheme.colors.primary
    ) {
        Text("Surface Example", modifier = Modifier.padding(16.dp))
    }
}

// Chip
@Composable
fun ChipExample() {
    Surface(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        color = Color.Gray
    ) {
        Text("Chip", modifier = Modifier.padding(8.dp))
    }
}

// BackdropScaffold
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BackdropScaffoldExample() {
    BackdropScaffold(
        scaffoldState = rememberBackdropScaffoldState(BackdropValue.Concealed),
        appBar = {
            TopAppBar(title = { Text("BackdropScaffold Example") })
        },
        backLayerContent = {
            Text("Back Layer Content", modifier = Modifier.padding(16.dp))
        },
        frontLayerContent = {
            Text("Front Layer Content", modifier = Modifier.padding(16.dp))
        }
    )
}

// FlowRow
@Composable
fun FlowRowExample() {
    FlowRow(
        modifier = Modifier.padding(8.dp),
        mainAxisSpacing = 8.dp,
        crossAxisSpacing = 8.dp
    ) {
        for (i in 1..10) {
            Text("Item $i", modifier = Modifier.padding(8.dp))
        }
    }
}

// FlowColumn
@Composable
fun FlowColumnExample() {
    FlowColumn(
        modifier = Modifier.padding(8.dp),
        mainAxisSpacing = 8.dp,
        crossAxisSpacing = 8.dp
    ) {
        for (i in 1..10) {
            Text("Item $i", modifier = Modifier.padding(8.dp))
        }
    }
}
