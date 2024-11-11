package org.example.classreader1;

import org.springframework.asm.*;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@interface MetaAnnotation {
    String value() default "Meta";
}

@MetaAnnotation("Applied to CustomAnnotation")
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
    String value() default "Custom";
}

@CustomAnnotation("Annotated Class")
class AnnotatedClass {}



@Retention(RetentionPolicy.RUNTIME)  // 元注解 @Retention
@Target(ElementType.TYPE)  // 元注解 @Target
@interface MyAnnotation {
    String value() default "Hello, World!";
}

@MyAnnotation(value = "MyAnnotatedClass")
class MyAnnotatedClass {
    // class body
}

 class ASMExample {
    public static void main(String[] args) throws IOException {
        // 读取类字节码
        ClassReader classReader = new ClassReader("org.example.classreader1.MyAnnotatedClass");

        // 创建 ClassVisitor 对象来遍历字节码
        classReader.accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
                // 输出注解的描述符
                System.out.println("Found annotation descriptor: " + descriptor);

                // 获取 @MyAnnotation 元注解信息
                if ("LMyAnnotation;".equals(descriptor)) {
                    System.out.println("Found @MyAnnotation!");
                }

                // 访问注解的元数据（例如：Retention, Target）
                if ("Ljava/lang/annotation/Retention;".equals(descriptor)) {
                    System.out.println("Found @Retention annotation!");
                }

                if ("Ljava/lang/annotation/Target;".equals(descriptor)) {
                    System.out.println("Found @Target annotation!");
                }

                return super.visitAnnotation(descriptor, visible);
            }
        }, 0);
    }
}

