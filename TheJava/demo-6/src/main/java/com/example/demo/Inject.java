package com.example.demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// RunTime에 참조할 Annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {

}
