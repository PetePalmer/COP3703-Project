package COP3703.MovieDatabase.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_balances")
public class customer_balances {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int RecordId;
	
	@Column(name="UserName")
	private String userName;
	
	@Column(name = "OutstandingFees")
	private float OutstandingFees;
	
	@Column(name="StoreCredit")
	private float StoreCredit;
	
	@Column(name="Discount")
	private String Discount;

	public int getRecordId() {
		return RecordId;
	}

	public void setRecordId(int recordId) {
		RecordId = recordId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		userName = userName;
	}

	public float getOutstandingFees() {
		return OutstandingFees;
	}

	public void setOutstandingFees(float outstandingFees) {
		OutstandingFees = outstandingFees;
	}

	public float getStoreCredit() {
		return StoreCredit;
	}

	public void setStoreCredit(float storeCredit) {
		StoreCredit = storeCredit;
	}

	public String getDiscount() {
		return Discount;
	}

	public void setDiscount(String discount) {
		Discount = discount;
	}

}
