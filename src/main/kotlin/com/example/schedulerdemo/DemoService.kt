package com.example.schedulerdemo

import org.springframework.stereotype.Service
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream


@Service
class DemoService {

    fun service() {
        val command: Array<String> = arrayOf("java", "-jar", "/Users/mrbluesky/CustomBatchFramework-0.0.1-SNAPSHOT.jar", "Work1")
        val processBuilder: ProcessBuilder = ProcessBuilder(*command)
        val process: Process = processBuilder.start()
        printStream(process)
    }

    @Throws(IOException::class, InterruptedException::class)
    fun printStream(process: Process) {
        process.waitFor()
        process.inputStream.use { psout -> copy(psout, System.out) }
    }

    @Throws(IOException::class)
    fun copy(input: InputStream, output: OutputStream) {
        val buffer = ByteArray(1024)
        var n = 0
        while (input.read(buffer).also { n = it } != -1) {
            output.write(buffer, 0, n)
        }
    }
}