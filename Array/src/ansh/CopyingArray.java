package ansh;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] copyFrom = {'a','b','t','e','j','a','n','s','h'};
		
		char[] copyTo= new char[7];
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        System.out.println(String.valueOf(copyTo));
	}

}

