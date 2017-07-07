package tw.alan.myproject.lab;

public class LabTestEx1 {

	public static void main(String[] args) {
		int i = 1; 
		while(i <= 9){
			
			int j = 1;
			while(j <= 9){
				if ((i * j) < 10){
					System.out.print(i + "x" + j + "= " + (i * j) + "\t");
					//結果為個位數時,十位數空一格
				}else{
				
				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
				}
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
