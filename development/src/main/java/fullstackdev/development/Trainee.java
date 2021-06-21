package fullstackdev.development;

import java.util.LinkedList;
import java.util.Scanner;

public class Trainee {
	private Integer employeeId;
	private String employeeName;
	static final String BATCH_CODE = "CHNFSD";
	int noEmp = 0;

	private LinkedList<Integer> employeeIdList = new LinkedList<Integer>();
	private LinkedList<String> employeeNameList = new LinkedList<String>();

	public Trainee() {
		System.out.println("enter the number of employee:");
		
	}

	public Trainee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId(int i) {
		return employeeIdList.get(i);
	}

	public String getEmployeeName(int i) {
		return employeeNameList.get(i);
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	void addList() {
		employeeIdList.add(employeeId);
		employeeNameList.add(employeeName);

	}

	void display() {
		int size = employeeIdList.size();
		for (int i = 0; i <= size - 1; i++) {
		System.out.println(
				"Trainee details: [EmployeeId: " + getEmployeeId(i) + ", EmployeeName: " + getEmployeeName(i) + ", Batch code"+ BATCH_CODE+" ]");
	}
	}

	void productsDispEmp(int d) {
		int size = employeeIdList.size();
		for (int i = 0; i <= size - 1; i++) {
			if (employeeIdList.get(i) == d) {
				System.out.println(
						"Trainee details: [EmployeeId: " + getEmployeeId(i) + ", EmployeeName: " + getEmployeeName(i) + ", Batch code"+ BATCH_CODE+" ]");
				}
		}

	}


	public static void main(String[] args) throws InterruptedException {
		Trainee emp = new Trainee();
		Scanner sc = new Scanner(System.in);
		int noEmploye = sc.nextInt();
		
		for (int i = 0; i <= noEmploye-1; i++) {
			System.out.println("Enter employee Id : ");
			int empIdIp = sc.nextInt();
			 Thread.sleep(1000);
			emp.setEmployeeId(empIdIp);
			
			System.out.println("Enter Employee Name : ");
			String nameLine = sc.next();
			Thread.sleep(1000);
			emp.setEmployeeName(nameLine);
			Thread.sleep(1000);
			emp.addList();

		}
		System.out.println("Enter 1 to diplay all employes \n Enter 2 display search employee");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			emp.display();
			break;
		case 2:
			System.out.println("Enter the employee ID:");
			int kd = sc.nextInt();
			Thread.sleep(1000);
			emp.productsDispEmp(kd);
			break;

		}

	}

	}


