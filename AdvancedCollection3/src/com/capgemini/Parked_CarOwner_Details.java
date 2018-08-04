package com.capgemini;

public class Parked_CarOwner_Details {
	private String ownerName;
	private String carModel;
	private int carNO;
	private int ownerMobileNo;
	private String ownerAddress;

	public Parked_CarOwner_Details(String ownerName, String carModel, int carNO, int ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}

	/**
	 * @chandrika
	 */
//Getters
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @return the carModel
	 */
	public String getCarModel() {
		return carModel;
	}

	/**
	 * @return the carNO
	 */
	public int getCarNO() {
		return carNO;
	}

	/**
	 * @return the ownerMobileNo
	 */
	public int getOwnerMobileNo() {
		return ownerMobileNo;
	}

	/**
	 * @return the ownerAddress
	 */
	public String getOwnerAddress() {
		return ownerAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
//toString is used to display the object
	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNO=" + carNO
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}

}
