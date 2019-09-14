import java.util.*;
class patients
{
    Scanner in=new Scanner(System.in);
    String pid,pname,page;
    String pdoc,det="",doc="";
    void input()
    {
        
        System.out.println("Enter the patient ID:");
        pid=in.next();
        System.out.println("Enter the name of the patient:");
        pname=in.next();
        System.out.println("Enter the Age of the Patient:");
        page=in.next();
        System.out.println("Enter the Name of thre Doc Incharge:");
        doc=in.next();
    }
    void output()
    {
        if(det=="")
		det=in.next();
        if(det==pid)
        {
            System.out.println("name:"+pname);
            System.out.println("ID:"+pid);
            System.out.println("Age:"+page);
            System.out.println("Name of Doc:"+doc);
        }
    }
    void output1()
    {
	if(doc=="")
		doc=in.next();
        if(pdoc==doc)
		System.out.println("Name of the Patient:"+pname);
    }
}

class patientsdemo
{
	
	public static void main(String args[])
	{	Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of patients");
		n=in.nextInt();
		System.out.println("Enter the details");
		patients ob[]=new patients[n];
		for(int i=0;i<n;i++)
		{
			ob[i]=new patients();
			ob[i].input();
		}
		System.out.println("Enter the patient id whose details has to be accessed");
		
		for(int i=0;i<n;i++)
		{
			
			ob[i].output();
		}
		System.out.println("enter the name of the doctor:");
		
		for(int i=0;i<n;i++)
		{
			
			ob[i].output1();
		}
	}
	
}
