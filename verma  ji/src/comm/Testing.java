package comm;

public class Testing {
  
	int aa,bb,cc;
	
	
	public void  setValue(int a,int b, int c){
		aa=a;
		bb=b;
		cc=c;
	}
	
	public int getValueAddition(){
		return aa+bb+cc;
	}

	public static void main(String ae[]){
		Testing t= new Testing();
		t.setValue(5, 9, 8);
		System.out.println("Result="+ t.getValueAddition());
		}
	
	
}
