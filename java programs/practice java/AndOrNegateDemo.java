import java.util.function.*;
import java.util.*;
class AndOrNegateDemo{
	public static void main(String[] args) {
		int[] x ={0,5,10,20,15,25,30,35};
		Predicate<Integer> p1 = n->n%2==0; 
		Predicate<Integer> p2 = n->n>10;
		System.out.println("the number which are even and greter then 10:");
		for (int x1 :x ) {
		 	if(p1.and(p2).test(x1)){
		 		System.out.println(x1);}} 
		System.out.println("the number which are even or greater then 10:");
		for (int x1 :x ) {
		 	if(p1.or(p2).test(x1)){
		 		System.out.println(x1);}}
        System.out.println("the number which are  even:");
		for (int x1 :x ) {
		 	if(p1.test(x1)){
		 		System.out.println(x1);}}  
		System.out.println("the number which are not even:");
		for (int x1 :x ) {
		 	if(p1.negate().test(x1)){
		 		System.out.println(x1);}}}}