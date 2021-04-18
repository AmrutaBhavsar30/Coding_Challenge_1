package educationCulture;

public class EducationSystem {

	
	
	public static void main(String args[])
	{
		Graduation gd=new Graduation();
		Engineering eg=new Engineering();
		ComputerScienceEngg cse=new ComputerScienceEngg();
		
		System.out.println("-------------method from Graduation class---------------------");
		gd.ageCritera();
		gd.hscPercentage();
		gd.streams();
		System.out.println("-------------***********************---------------------");
		System.out.println("\n");
		
		System.out.println("-------------method from Engineering class---------------------");
		eg.ageCritera();
		eg.hscPercentage();
		eg.streams();
		eg.typeOfEngineering();		
		System.out.println("-------------***********************---------------------");
		System.out.println("\n");
		
		
		System.out.println("-------------method from ComputerScienceEngg class---------------------");
		cse.ageCritera();
		cse.hscPercentage();
		cse.streams();
		cse.subjects();
		cse.typeOfEngineering();		
		System.out.println("-------------***********************---------------------");
		
	}
}



/*      OUTPUT
-------------method from Graduation class---------------------
for graduation minimun age critera for cadidate is 20 years
for graduation minimun 60% is critera
BCA, BBA, B.E.
-------------***********************---------------------


-------------method from Engineering class---------------------


for graduation minimun age critera for cadidate is 20 years
for graduation minimun 60% is critera
Computer Sciance, Information Technology, Electronics & Mechanical Engineering
Engineeing can be done as Regular as well as from distance learing
-------------***********************---------------------


-------------method from ComputerScienceEngg class---------------------


for graduation minimun age critera for cadidate is 20 years
To get admission for Computer Science Engineering HSC percentage should be minimun 65%
Computer Sciance, Information Technology, Electronics & Mechanical Engineering
Core Java, C sharp & Python are subjects offered in Computer Science Engineering
Engineeing can be done as Regular as well as from distance learing
-------------***********************---------------------

*/