class Parameter {
	int a,b;
	Parameter (){
	int a=10;
	int b=12;
	System.out.println(" Hi this is constructor");
	}
		void dis( Parameter p){
			System.out.println("A ="+ p.a + "B ="+p.b);
		
			}
		void get(){
			dis(this);
			}
	public static void main(String args[]){
	
		Parameter p=new Parameter ();
		p.get();
	}

}