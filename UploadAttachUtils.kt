package RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR

//  ===========================  FILE´S NAME: =======================================
/*
    //        Uri.parse(audioAttachment.url)
//        val fileName = audioAttachment.name ?: ""
//    list1.forEach{
//        Text(text = (imageUri?.path).toString())
//    }
 */
// ==================================================================================

//  =======================  FILE´S ABERTURA TIPO A: ================================
/*

//    val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
//        /**
//         * It's possible to limit the types of files by mime-type. Since this
//         * app displays pages from a PDF file, we'll specify `application/pdf`
//         * in `type`.
//         * See [Intent.setType] for more details.
//         */
//        type = "application/pdf"
//
//        /**
//         * Because we'll want to use [ContentResolver.openFileDescriptor] to read
//         * the data of whatever file is picked, we set [Intent.CATEGORY_OPENABLE]
//         * to ensure this will succeed.
//         */
//        addCategory(Intent.CATEGORY_OPENABLE)
//    }
//    startActivityForResult(intent, OPEN_DOCUMENT_REQUEST_CODE)
*/
// ==================================================================================

//  =======================  URI ================================
/*
fun nameFile(uriNew: Uri){
//        uriNew.userInfo
}
//            if (uri != null) {
//
////                Log.i("Anexo", "Conteúdo 2--> ${uri.authority?.length}")
//
//                val displayName: String = OpenableColumns.DISPLAY_NAME
////                imageUri.OpenableColumns.DISPLAY_NAME
//
////                Log.i("Anexo", "Display Name: $displayName")
//
////                var displayName = get
////                Log.i("Anexo", "Conteúdo 1--> ${imageUri.}")
////                Log.i("Anexo", "Conteúdo 22222--> ${imageUri?.path}")
//
//                var teste2 = imageUri?.path
////                Log.i("Anexo", "Conteúdo TESTE 2--> ${teste2}")
//
//                var teste3 = teste2?.lastIndexOf('/')
////                Log.i("Anexo", "Conteúdo TESTE 3--> ${teste3}")
//
//                var teste5 = imageUri?.queryParameterNames
//                Log.i("Anexo", "Conteúdo TESTE 5--> ${teste5}")
//
//                Log.i("Anexo", "Conteúdo 3--> ${uri.userInfo}")
//                Log.i("Anexo", "Conteúdo 4--> ${uri.toString()}")
//                Log.i("Anexo", "Conteúdo 5--> ${uri.encodedAuthority}")
//                Log.i("Anexo", "Conteúdo 6--> ${uri.encodedFragment}")
//                Log.i("Anexo", "Conteúdo 6--> ${uri.userInfo.}")

//                val cursor: Cursor = query(uri, null, null, null, null)
//                val cursorr: Cursor? = null
//                var testeeee = cursorr?.columnNames?.get(0)
//
//                if (cursorr != null) {
//                    var result = cursorr.getColumnIndex(OpenableColumns.DISPLAY_NAME)
//                }

//                var filename = if(uri.path?.last("/"))
//                var cursor: Cursor
//                cursor = getContentResolver().query(uri, new String[]{
//                    MediaStore.Images.ImageColumns.DISPLAY_NAME
//                }, null, null, null);
//            }

fun getFileName(uri: Uri){
    var result: String? = null
    if (uri.scheme == "content") {
        val cursor: Cursor = getFileName(uri)
//        val cursor: Cursor = query(uri, uri, null, null, null)

        Log.i("An", "Conteúdo 3--> ${cursor}")

        try {
            if (cursor != null && cursor.moveToFirst()) {
//                result = cursor.getString(cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME))
            }
        } finally {
            cursor.close()
        }
    }
    if (result == null) {
        result = uri.path
        val cut = result!!.lastIndexOf('/')
        if (cut != -1) {
            result = result.substring(cut + 1)
        }
    }
    return result
}
 */
//https://code.luasoftware.com/tutorials/android/android-get-filename-of-uri-or-path/
// ==================================================================================

//    ====================== MENU DE SELEÇÃO DOS TIPOS DE ANEXOS ====================
//Button ícons - https://developer.android.com/jetpack/compose/layouts/material
//    ===============================================================================

// ================== CHAMADA MÚLTIPLA ==============================================
//        rememberLauncherForActivityResult(contract = ActivityResultContracts.GetMultipleContents()) { uri ->

// ================ OUTRAS OPÇÕES COM BITMAP ========================================
/*

//                val source = ImageDecoder.createSource(context.contentResolver, it)
//                bitmap.value = ImageDecoder.decodeBitmap(source)

//
//            bitmap.value?.let { btm ->
//                Image(
//                    bitmap = btm.asImageBitmap(),
//                    contentDescription = null,
//                    modifier = Modifier
//                        .size(400.dp)
//                        .padding(20.dp)
//                )
//            }

 */

//====================== TIPOS DE ARQUIVOS ==========================================
/*
//            All datas images

//            launcher.launch("image/*")

//            JPEG, PNG e PDF:
//            launcher.launch("image/jpeg")
//            launcher.launch("image/*")
//            launcher.launch("image/png")
//            launcher.launch("application/pdf")

//            launcher.launch("image/png","image/jpeg")
 */
//            Personalizado com array NÃO EXECUTOU
//            launcher.launch(
//                arrayOf(
//                    "image/png",
//                    "image/jpeg",
//                    "application/pdf"
//                ).toString()
//            )
//            launcher.launch(
//                arrayOf(
//                    (".pdf"), "application/pdf"
//                ).toString()
//            )
//            launcher.launch("audio/*")
*/

 */
 /*
//@Preview
//@Composable
fun AttachList(){
    var attach1 = SnapshotStateList<String>()
    Log.i("Attach", "Lista original: ${attach1}")

    attach1.add("Imagem00000")
    attach1.add("Imagem11111")
    attach1.add("Imagem22222")

    Log.i("Attach", "Lista atualizada 1: ${attach1[0]} ")
    Log.i("Attach", "Lista atualizada 2: ${attach1[1]} ")
    Log.i("Attach", "Lista atualizada 3: ${attach1[2]} ")


//    Log.i("Attach", "Lista INICIALIZADA: $attach1")

    attach1.remove("Imagem11111")

    Log.i("Attach", "Lista atualizada 4 - COM REMOÇÃO: ${attach1[0]} ")
    Log.i("Attach", "Lista atualizada 5 - COM REMOÇÃO: ${attach1[1]} ")
//    Log.i("Attach", "Lista atualizada 3: ${attach1[2]} ")

//    Log.i("Attach", "Lista COM REMOÇÃO: $attach1")

}
*/
/*
//    val resourcesProvider = ResourcesProvider(LocalContext.current.resources)
//    var attachList = SnapshotStateList<String>()
//    Log.i("NovoAtt", "Lista 2 original: ${attachList2.size}")
//    attachList.add("Imagem00000")
//    attachList.add("PDF11111")
//    attachList.add("Photo22222")
*/
 */

//====================== FILE - OUTROS MÉTODOS ==========================================
/*
//Log.i("AnexoFinal", "PASTA--> $path1")
//            val path1 = uri?.path
//            val finalNa = File(nameFileeee.path).name
//            Log.i("AnexoFinal", "FINAL NAME--> $finalNa")
//            val fullLocalNameFile = uri.toString()
////            Log.i("AnexoFinal", "Conteúdo X--> $fullLocalNameFile")
//
//            val nameFile = Uri.parse(fullLocalNameFile)
//            val finalName = File(nameFile.path).name

/*
@Preview
@ExperimentalMaterialApi
@Composable
fun AttachFileClass() {
    val sheetState = rememberBottomSheetState(
//        initialValue = BottomSheetValue.Collapsed
        initialValue = BottomSheetValue.Expanded
    )
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )
    val scope = rememberCoroutineScope()


    val launcher =
        rememberLauncherForActivityResult(
            contract = ActivityResultContracts.GetContent()
        ) { uri ->


//            val file = File("$path/filename")

//            Endereço URI do caminho do arquivo selecionado

//            var name: File = File(uri?.path)
            var name: File = File(uri?.path).normalize()

            val n = File(uri?.path)
            n.exists()
            n.isDirectory
            n.isFile
            n.isAbsolute

            val nn: File = File(uri?.path).normalize()
            nn.exists()
            nn.isDirectory
            nn.isFile
            nn.isAbsolute


//            Uri.fromFile(name)
//            Uri.parse(name)

//            isFileExist()

//            var nameFileOrDir = name.name
///TENTAR CHAMAR UMA FUNÇÃO EM JAVA

//            Toast.makeText(LocalContext.current, "Result: ${name.normalize()}", Toast.LENGTH_LONG).show()

          if(name.exists()) {
              Log.i("ATTACH", "NAME.EXIST = ${name.exists()}")
              var absolutePath = name.absolutePath

              Log.i("ATTACH", "NAME.ISFILE = ${name.isFile}")

              Log.i("ATTACH", "NAME.ISDIRECTORY = ${name.isDirectory}")

              Log.i("ATTACH", "NAME.LENGHT = ${name.length()}")

              Log.i("ATTACH", "NAME.ABSOLUTE-FILE = ${name.absoluteFile}")
          }

        }


    BottomSheetScaffold(
        scaffoldState = scaffoldState,
//        topBar = {
//            Text(text = "MENU")
//        },
        sheetContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
//                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Anexar",
                    fontSize = 24.sp,
                    color = Color.Gray
                )
//                Text(
//                    text = "Tirar foto",
//                    fontSize = 30.sp,
//                    color = Color.White
//                )
                Text(
                    text = "Escolher foto",
                    fontSize = 30.sp,
                    color = Color.White,

                    modifier = Modifier.clickable {
                        scope.launch {
                            var typeChoose = AttachTypes(0)
                            launcher.launch(typeChoose)
                        }
                    }
                )
                Text(
                    text = "Buscar arquivos",
                    fontSize = 30.sp,
                    color = Color.White,

                    modifier = Modifier.clickable {
                        scope.launch {
                            launcher.launch(AttachTypes(1))
                        }
                    }
                )
                Text(
                    text = "Cancelar",
                    fontSize = 30.sp,
                    color = Color.White,

                    modifier = Modifier.clickable {
                        scope.launch {
                            sheetState.collapse()
                        }
                    }
                )
            }
        },

        sheetBackgroundColor = Color.LightGray,
        sheetPeekHeight = 0.dp

    ) {
        Box(Modifier.padding(it)) {
            Text(
                text = "BOX TEXT BODY",
                modifier = Modifier.clickable {
                    scope.launch {
//                    scaffoldState.bottomSheetState.expand()
                        sheetState.expand()
                        Log.i("SHEET", "AttachBottomSheet: $sheetState")
                    }
                })// Screen content
        }
    }
}

*/

 */