package permutation;

public class Rotater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rotater r = new Rotater();

	        System.out.println(r.rotateLeft("test", 0));
	        System.out.println(r.rotateRight("twesrt", 1));

	    }

	    private String rotateLeft(String value, int n) {
	        return value.substring(n) + value.substring(0, n);
	    }

	    private String rotateRight(String value, int n) {
	        return rotateLeft(value, value.length() - n);
	    }

}
