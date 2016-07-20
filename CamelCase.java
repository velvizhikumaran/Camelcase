# Camelcase

public class CamelCase {

	public static void main(String[] args) {
		String s1="hai how are you";
		String a[]=s1.split("\\s");
		for(int i=0;i<a.length;i++){
			char c[]=a[i].toCharArray();
			String s2=Character.toString(c[0]);
			String s3=s2.toUpperCase();
			for(int j=1;j<c.length;j++){
				s3=s3+c[j];
			}
			System.out.print(s3+" ");
					}
		}
}
