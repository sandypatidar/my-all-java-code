class WapperInt {
	public static void main(String[] args) {
		//Integer i = new Integer("two");
		Integer j = new Integer("2");
		//System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
}

class WapperFloat {
	public static void main(String[] args) {
		Float f1 = new Float(10.5f);
		Float f2 = new Float("10.5f");
		Float f3 = new Float(10.5);
		System.out.println("f1 = "+f1);
		System.out.println("f2 = "+f2);
		System.out.println("f3 = "+f3);
	}
}

class WapperChar {
	public static void main(String[] args) {
		Character ch = new Character('a');
		//Character ch = new Character("a"); /invalid
		System.out.println("ch = "+ch);

	}
}

class WapperBoolean {
	public static void main(String[] args) {
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(false);
		//Boolean b3 = new Boolean(True);//invalid
		//Boolean b4 = new Boolean(durga);//invalid
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println();
		System.out.println();

		Boolean x = new Boolean("yes");
		Boolean y = new Boolean("no");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println(x.equals(y));
		System.out.println();
		System.out.println();

		Boolean z = new Boolean("no");
		Boolean u = new Boolean("TRUE");
		Boolean v = new Boolean("True");
		Boolean w = new Boolean("true");//case insensitive (allow True tRue trUe truE all possible)
		System.out.println("u = "+u);
		System.out.println("v = "+v);
		System.out.println("w = "+w);
		System.out.println("z = "+z);
		System.out.println(w.equals(z));
	}
}

/*

* utility method of wrapper class 
-- valueOf() 
-- xxxValue()
-- parseXxx()
-- toString()

1----> 
valueOf() >> every wrapper class except Character class contain this method to create wrapper object for given string
## public static wrapper valueOf(String s)
## public static wrapper valueOf(String s, int radix) >> only applicable for -byte -short -int -long
## public static wrapper valueOf(primitive p) >> all wrapper class contain this method 
@@ Primitive/String >>> valueOf() >>> wrapper class

2---->
xxxValue() >> we can use this method for to get primitive for the given wrapper object 

3---->
## public static primitive parseXxx(String s,int radix)
@@ the allowed range of radix is : 2 to 36
@@ String >>> parseXxx() >>> primitive

4---->
@@ wrapper class >>> toString() >>> string
## public static String toString(primitive p,int radix);
@@ only two class contain this method --Integer --Lang

## public static String toBinaryString(primitive p)
## public static String toOctalString(primitive p)
## public static String toHexString(primitive p)

