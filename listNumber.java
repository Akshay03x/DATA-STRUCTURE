public class listNumber{
	public static void main(String[] args) {
		DS ds1=new DS();
		DS ds2=new DS(10,ds1);
		DS ds3=new DS(20,ds2);
		DS ds4=new DS(30,ds3);
		DS ds5=new DS(40,ds4);
		DS ds6=new DS(50,ds5);
		ds6.print();


	}
}
class DS{
	int a;
	DS prev;

	public DS(){
				a=0;
	}
	public DS(int a, DS prev){
		this.a=a;
		this.prev=prev;
	}
	public void print(){
		if(prev!=null){
			System.out.println(a+"\n&& prev a="+prev.a+"\n&& prev a="+prev.prev.a+"\n&& prev a="+prev.prev.prev.a+"\n&& prev a="+prev.prev.prev.prev.a+"\n&& prev a="+prev.prev.prev.prev.prev.a);
		}
	}
}