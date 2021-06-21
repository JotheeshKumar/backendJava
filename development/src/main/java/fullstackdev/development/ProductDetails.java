package fullstackdev.development;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductDetails {
	private long id;
	private String productName;
	private String supplierName;

	private LinkedList<Long> idList = new LinkedList<Long>();
	private LinkedList<String> pName = new LinkedList<String>();
	private LinkedList<String> sName = new LinkedList<String>();

	public void setId(long id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	void products() {
		idList.add(id);
		pName.add(productName);
		sName.add(supplierName);

	}

	void productsDisp() {
		int size = idList.size();
		System.out.println("ProductDetails :");
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("Product_Id =" + idList.get(i) + ", Product_Name =" + pName.get(i) + ", Supplier_Name="
					+ sName.get(i));
		}
	}

	void productsDispOne(long d) {
		int size = idList.size();
		for (int i = 0; i <= size - 1; i++) {
			if (idList.get(i) == d) {
				System.out.println("Product_Id =" + idList.get(i) + ", Product_Name =" + pName.get(i) + ", Supplier_Name="
						+ sName.get(i));
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ProductDetails pd = new ProductDetails();
		Scanner sc = new Scanner(System.in);

		System.out.println("How many products you want to enter:");
		int num = sc.nextInt();
		long i;
		for (i = 1; i <= num; i++) {
			System.out.println("Enter Product Id : ");
			 pd.setId((Long)sc.nextLong());
			//pd.setId(i);
			// Thread.sleep(5000);
			System.out.println("Enter productName : ");
			 pd.setProductName(sc.next());
		//	pd.setProductName("prod1" + i);
			// Thread.sleep(5000);
			System.out.println("Enter supplierName : ");
			pd.setSupplierName(sc.next());
			//pd.setSupplierName("Sup1" + i);
			// Thread.sleep(5000);
			pd.products();

		}
		System.out.println("Enter 1 to diplay all products \n Enter 2 display search product");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			pd.productsDisp();
			break;
		case 2:
			System.out.println("Enter the Product ID:");
			long kd = sc.nextInt();
			pd.productsDispOne(kd);
			break;

		}

	}

}
