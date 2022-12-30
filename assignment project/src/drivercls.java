import ece1.*;
import ece2.*;
import ece3.*;
import ece4.*;
import ece5.*;
public class drivercls {
public static void main(String[]args) {
	ece1.testcls t1;
	t1=new ece1.testcls();
	t1.setEmpid(101);
	t1.setEname("mikey");
	t1.setDesignation("developer");
	
	ece2.testcls t2;
	t2=new ece2.testcls();
	t2.setEmpid(102);
	t2.setEname("levi");
	t2.setDesignation("developer");
	
	ece3.testcls t3;
	t3=new ece3.testcls();
	t3.setEmpid(101);
	t3.setEname("stark");
	t3.setDesignation("developer");

	ece4.testcls t4;
	t4=new ece4.testcls();
	t4.setEmpid(101);
	t4.setEname("ash");
	t4.setDesignation("developer");
	
	ece5.testcls t5;
	t5=new ece5.testcls();
	t5.setEmpid(101);
	t5.setEname("naruto");
	t5.setDesignation("developer");
	
	System.out.println("empid:"+t1.getEmpid());
	System.out.println("empname:"+t1.getEname());
	System.out.println("designation:"+t1.getDesignation());
	
	System.out.println("empid:"+t2.getEmpid());
	System.out.println("empname:"+t2.getEname());
	System.out.println("designation:"+t2.getDesignation());
	
}
}
