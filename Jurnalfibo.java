package jurnal;


import java.util.Scanner;

public class Jurnalfibo {
        public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.print("Inputan: ");
		int n= a.nextInt();
		for(int i=1;i<=n;i++){
                    System.out.print(jun(i) + " ");
                }	
		System.out.println();
        }
	private static int jun(int n){
		int f;
		if(n==1 || n==2){
                    f=1;
                }
                else{
                    f = jun(n-1) + jun(n-2);
                }
		return f;
        }
}
    
