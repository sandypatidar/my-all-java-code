class Bsss {

    public static void main(String[] args) {

        // String input = new String("abbdc");
        // String output = new String();

        // for (int i = 0; i < input.length(); i++) {
        //     for (int j = 0; j < output.length(); j++) {
        //         if (input.charAt(i) != output.charAt(j)) {
        //             output = output + input.charAt(i);
        //         }
        //     }
        // }

        // System.out.println(output);
        // 
     

     String string = "aabbccdefatafaz";

char[] chars = string.toCharArray();
Set<Character> charSet = new LinkedHashSet<Character>();
for (char c : chars) {
    charSet.add(c);
}

StringBuilder sb = new StringBuilder();
for (Character character : charSet) {
    sb.append(character);
}
System.out.println(sb.toString());

    }

}