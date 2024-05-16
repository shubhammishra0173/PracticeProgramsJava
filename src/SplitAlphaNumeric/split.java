package SplitAlphaNumeric;

public class split {
	 public static void main(String[] args) {
		 String str = "shu12@#dhy5%";
		
        String number = "";
        String letter = "";
        String SpecialChar ="";
        for (int i = 0; i < str.length(); i++) {
               char a = str.charAt(i);
               if (Character.isDigit(a)) {
                     number = number + a;

               } else if(Character.isAlphabetic(a)){
                     letter = letter + a;

               }
               else
               {
            	  SpecialChar =SpecialChar+a;
               }
        }
        System.out.println("Alphates in string:"+letter);
        System.out.println("Numbers in String:"+number);
        System.out.println(SpecialChar);

 }

}
