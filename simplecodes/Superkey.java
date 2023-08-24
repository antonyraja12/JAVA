class SuperKey{
		
	void info(){
	System.out.println("This in superkey info");


}
	}
class Subkey extends SuperKey{
	void info(){
	System.out.println("This in subkey info");
	
}
void show(){
	info();
	super.info();
}

public static void main(String args[]){
	Subkey s=new Subkey();
	s.show();
}
}