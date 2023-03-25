package ds;

public class Stringrec1 {

	public static void main(String[] args) {
	String a = "my name is atul kumar";
	 

String[] words = a.split(" ");
String rev = "";
for(int i = 0; i<words.length;i++){
	String word = words[i];
	String revword = "";
	for(int j = word.length()-1;j>=0;j--) {
		revword = revword+word.charAt(j);
	}
	rev = rev+revword+" ";
}
System.out.println(rev);
}
		}


