package com.rann.basic;

/**
 * Created by Lemonjing on 2018/7/18.
 * Github: Lemonjing
 */
import java.lang.reflect.InvocationTargetException;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;

public class ScriptEvaluatorDemo {

    public static void main(String[] args) throws CompileException, NumberFormatException, InvocationTargetException {

        ScriptEvaluator se = new ScriptEvaluator();

        se.cook(
                ""
                        + "static void method1() {\n"
                        + "    System.out.println(1);\n"
                        + "}\n"
                        + "\n"
                        + "method1();\n"
                        + "method2();\n"
                        + "\n"
                        + "static void method2() {\n"
                        + "    System.out.println(2);\n"
                        + "}\n"
        );

        se.evaluate(new Object[0]);
    }
}
