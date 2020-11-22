package Model;

public class CustomerBalance {

	public String userName;
	
	public float outstandingRentalFees;
	
	public float storeCredit;
	
	public String employeeDiscount;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getOutstandingRentalFees() {
		return outstandingRentalFees;
	}

	public void setOutstandingRentalFees(float outstandingRentalFees) {
		this.outstandingRentalFees = outstandingRentalFees;
	}

	public float getStoreCredit() {
		return storeCredit;
	}

	public void setStoreCredit(float storeCredit) {
		this.storeCredit = storeCredit;
	}

	public String getEmployeeDiscount() {
		return employeeDiscount;
	}

	public void setEmployeeDiscount(String employeeDiscount) {
		this.employeeDiscount = employeeDiscount;
	}
}
