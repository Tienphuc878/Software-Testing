package st.prtc;

public class Calculator {
	int sum(int num1,int num2){
		return num1+num2;
	}
	int method2(boolean cond1, boolean cond2){
		boolean cond3 = false;
		
		if (cond1){
			return 1;
		} else if (cond2){
			return 2; 
		} else if (!cond1 && !cond3){
			return 3;
		}		
		return 0;
	}
}
