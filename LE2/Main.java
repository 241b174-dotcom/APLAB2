/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args){
	    Child c1 = new Child();
	    c1.setName("A");
	    Child c2 = new Child();
	    c2.setName("B");
	    Child c3 = new Child();
	    c3.setName("C");
	    Child c4 = new Child();
	    c4.setName("D");
	    Child c5 = new Child();
	    c5.setName("E");
	    
	    Mother m = new Mother();
	    m.child[0]=c1;
	    m.child[1]=c2;
	    m.child[2]=c3;
	    m.child[3]=c4;
	    m.child[4]=c5;
	    m.show();
	    
	}
}
