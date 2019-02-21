import java.util.Scanner;
public class MainClass  {

	public static void main(String[] args)
	{
		
		/*Duck md = new MallardDuck();
		md.display();
		
		Duck rhd = new RedHeadDuck();
		rhd.display();
		
		Duck rd = new RubberDuck();
		rd.display();
		
		Duck dd = new DecoyDuck();
		dd.display();
		*/
		
	System.out.println("Choose the duck ...");
	System.out.println("1) Mallard Duck ...");
	System.out.println("2) Red Head Duck ...");
	System.out.println("3) Rubber Duck ...");
	System.out.println("4) Decoy Duck ...");
	int duck=0,temp=0;
	boolean cont = true;
	while(true)
	{
	Scanner sc = new Scanner(System.in);
	duck = sc.nextInt();
	switch(duck)
	{
	case 1:
		Duck md = new MallardDuck();
		md.display();
		break;
	case 2:
		Duck rhd = new RedHeadDuck();
		rhd.display();
		break;
	case 3:
		Duck rd = new RubberDuck();
		rd.display();
		break;
	case 4:
		Duck dd = new DecoyDuck();
		dd.display();
		break;
	default:
		System.out.println("Choose the duck from above list ...");
	}
	System.out.println("Do you want to Continue 0/1 ...");
	Scanner sc1 = new Scanner(System.in);
	temp = sc1.nextInt();
	if(temp == 0)
	{
		break;
	}
	System.out.println("Choose the duck ...");
	
	}
	}

}
