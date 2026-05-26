import OprPack.*;
import Mypack.*;
class access2Packs
{
	public static void main(String args[])throws Exception
	{
		PackArith a1=new PackArith();
		a1.inputdata();
		a1.caldata();
		
		OperationPackClass opc=new OperationPackClass();
		opc.getfact();
		opc.putfact();
		opc.sumnum();
	}
}