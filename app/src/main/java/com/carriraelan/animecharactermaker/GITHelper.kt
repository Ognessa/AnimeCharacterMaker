package com.carriraelan.animecharactermaker

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.Toast
import org.kohsuke.github.GitHub
import java.io.*
import java.net.URL
import java.util.concurrent.*

class GITHelper {

    @SuppressLint("ResourceType", "UseCompatLoadingForDrawables", "Recycle")
    fun getImgInThread(imgNameList: ArrayList<String>, context: Context): ArrayList<String> {
        val executor: ExecutorService = Executors.newFixedThreadPool(4)

        val future: Future<ArrayList<String>> = executor.submit(Callable<ArrayList<String>> {
            val list: ArrayList<String> = getXMLImages(imgNameList)
            return@Callable list
        })

        while (!future.isDone) {
            TimeUnit.MILLISECONDS.sleep(100)
        }

        return future.get()
    }

    /**
     * get text from file in repository
     */
    //TODO cannot use connection in main thread
    private fun getXMLImages(imgNameList: ArrayList<String>): ArrayList<String> {
        val imgList: ArrayList<String> = arrayListOf()
        val git: GitHub = GitHub.connectAnonymously()

        for (i in imgNameList) {
            val str = git
                .getUser("Ognessa")
                .getRepository("AnimeCharacterMakerContent")
                .getFileContent(i).downloadUrl
            val input: InputStream = URL(str).openStream()
            imgList.add(readFromInputStream(input))
        }
        return imgList
    }

    /**
     * Read all file and return all text from it
     */
    private fun readFromInputStream(inputStream: InputStream): String {
        var str: String = ""
        try {
            str = inputStream.bufferedReader().use(BufferedReader::readText).toString()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return str
    }

    fun getDrawables(list: ArrayList<String>, context: Context): ArrayList<Drawable> {
        val drawList: ArrayList<Drawable> = arrayListOf()
        for (i in list) {
            try {
                stringToDom(i, "/temp.xml", context)
                val d: Drawable? = Drawable.createFromPath(context.filesDir.toString() + "/temp.xml")
                drawList.add(d as Drawable)
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return drawList
    }

    /**
     * Write text to file (And crete this file if not exist)
     */
    fun stringToDom(xmlSource: String, filePath: String, context: Context) {
        val file = File(context.filesDir.toString() + filePath)
        if (!file.exists()) {
            file.createNewFile()
        }
        try {
            val writer = FileWriter(file)
            writer.append(xmlSource)
            writer.flush()
            writer.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}