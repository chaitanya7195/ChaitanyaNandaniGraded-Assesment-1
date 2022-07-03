package gradedAssesment1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment ad=new AdminDepartment();
		HrDepartment hr=new HrDepartment();
		TechDepartment tc=new TechDepartment();
		
		System.out.println("welcome to "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
     	System.out.println(ad.getWorkDeadline());
     	System.out.println(ad.isTodayAHoliday());
        System.out.println();
		
		System.out.println("welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		System.out.println("welcome to "+tc.departmentName());
		System.out.println(tc.getTodaysWork());
		System.out.println(tc.getWorkDeadline());
		System.out.println(tc.getTechStackInformation());
		System.out.println(tc.isTodayAHoliday());

	}

}
