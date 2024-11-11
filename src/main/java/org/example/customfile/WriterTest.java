package org.example.customfile;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WriterTest {

    public static void main(String[] args) throws IOException {
        // 将 System.out 传入 PrintWriter，使其可以输出到控制台
        Writer writer = new PrintWriter(System.err);

        // 使用 Writer 写入内容
        writer.write("This is written to the console using PrintWriter.\n");
        writer.write("Hello, Console!");
        writer.flush(); // 确保内容立即输出

    }
}
