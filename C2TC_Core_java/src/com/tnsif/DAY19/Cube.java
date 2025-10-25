//Program to demonstrate Functional Interface

package com.tnsif.DAY19;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}