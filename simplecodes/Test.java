class Test {
	int a,b;
	Test(int a,int b){
	this.a=a;
	this.b=b;
	
	}
	public void dis(){
	System.out.println("A="+ a + "B="+ b);
	}
	public static void main(String args[]){
	Test t=new Test(10,85);
	t.dis();
}		
}