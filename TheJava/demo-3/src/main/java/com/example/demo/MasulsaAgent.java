package com.example.demo;

import static net.bytebuddy.matcher.ElementMatchers.named;

import java.lang.instrument.Instrumentation;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

public class MasulsaAgent {

	public static void premain(String agentArgs, Instrumentation inst) {
		new AgentBuilder.Default()
			.type(ElementMatchers.any())
			.transform((builder, typeDescription, classLoader, javaModule) ->
		builder.method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))).installOn(inst);

	}
}
