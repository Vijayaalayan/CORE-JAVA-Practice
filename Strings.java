
public class Strings {
	public static void main(String arg[]) {
		//charAt function
		String s1 = "Welcome";
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i)+" ");
		}
		
		System.out.println();
		
		
		//String to ASCII conversion		
		byte b[] = s1.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
		//String to character array
		char[] ch=s1.toCharArray();  
		for(int i=0;i<ch.length;i++){  
		System.out.print(ch[i]);  
		}  
		
		//to join with the delimiter
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);  
		
		//return boolean if the string contains the element -true or else - false
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));  
		
		String concat = "Hello";
		concat = concat.concat(" world");
		System.out.println(concat);
		
		boolean check = concat.endsWith("ld");
		System.out.println(check);
		
		
		//Substring
		System.out.println(s1.substring(2,4));
		System.out.println(s1.substring(2));
		
		//Split method
		String split = "Hello How are you";
		String splits[] = split.split(" ");
		for(String w : splits) {
			System.out.println(w);
		}
		
		//trim
		String s2 ="  hello java string   ";  
        System.out.println(s2.length());  
        System.out.println(s2); //Without trim()  
        String tr = s2.trim();  
        System.out.println(tr.length());  
        System.out.println(tr); 
        
        //valueof converts any datattype to string
        int data = 15;
        String value = String.valueOf(data);
        System.out.println(value);
        
        //indexof retunr the index of the position
        String index = "Hello World";
        int index1 = index.indexOf("el");
        System.out.println(index1);
        int index2 = index.indexOf("o",5);
        System.out.println(index2);
        
        StringBuilder sb=new StringBuilder("Hello");  
        sb.replace(1,5,"Java");  
        System.out.println(sb);
	}
}
