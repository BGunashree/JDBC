package com.xworkz.vehicle.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="vehicle_info")
@NamedQuery(name="findAll" ,query="select ve from VehicleEntity ve")
@NamedQuery(name="findAllByIdAndModelName" ,query="select ve from VehicleEntity ve where ve.id =:byId and ve.modelName =:byModelName")
@NamedQuery(name="findNameAndManufacturerById" ,query="select ve.modelName, ve.manufacturer from VehicleEntity ve where ve.id =:byId")
@NamedQuery(name="findNameAndManufacturerAndMileageAndEngineCapacity" ,query="select ve.modelName, ve.manufacturer ,ve.mileage,ve.engineCapacity from VehicleEntity ve where ve.id >:byId")
@NamedQuery(name="CountSeatingCapacity" ,query="select count(*) as COUNT  from VehicleEntity ve where ve.seatingCapacity >:byCap")

@NamedQuery(name="findModelNameByIdAndManufacturer" ,query="select ve.modelName from VehicleEntity ve where ve.id =:byId and ve.manufacturer =:byManufacturer")
@NamedQuery(name="findMileageByIdAndModelName" ,query="select ve.mileage from VehicleEntity ve where ve.id =:byId and ve.modelName =:byModelName")
@NamedQuery(name="findEngineCapacityByIdAndModelName" ,query="select ve.engineCapacity from VehicleEntity ve where ve.id =:byId and ve.modelName =:byModelName")
@NamedQuery(name="findFuelTypeByIdAndModelName" ,query="select ve.fuelType from VehicleEntity ve where ve.id =:byId and ve.modelName =:byModelName")
@NamedQuery(name="findDateIdAndModelName" ,query="select ve.manufactureDate from VehicleEntity ve where ve.id =:byId and ve.modelName =:byModelName")
@NamedQuery(name="findSeatingIdAndModelName" ,query="select ve.seatingCapacity from VehicleEntity ve where ve.id =:byId and ve.modelName =:byModelName")
@NamedQuery(name="findIsElectricByIdAndModelName" ,query="select ve.isElectric from VehicleEntity ve where ve.id =:byId and ve.modelName =:byModelName")

@NamedQuery(name="CountByManufacturerAndate", query="select count(*),ve.manufacturer, ve.manufactureDate from VehicleEntity ve group by ve.manufacturer" )

@NamedQuery(name="UpdateByModelName", query="update VehicleEntity ve set ve.engineCapacity =:Ec where ve.modelName =:byModelName")

@NamedQuery(name="UpdateByEngineNumberAndIsElectric", query="update VehicleEntity ve set ve.mileage =:newMileage where ve.engineNumber =:byEN and ve.isElectric =:byIsElectric")

@NamedQuery(name="deleteByNameAndManufacturer", query="delete from VehicleEntity ve where ve.modelName =:byModelName and ve.manufacturer =:byManufacturer")
public class VehicleEntity {
	
	@Id
	private int id;
	@Column(name="model_name")
	private String modelName;
	
	private String manufacturer;
	@Column(name="engine_number")
	private long engineNumber;
	private float mileage;
	@Column(name="engine_capacity")
	private double engineCapacity;
	@Column(name="is_electric")
	private boolean isElectric;
	@Column(name="fuel_type")
	private char fuelType;
	
	@Column(name="manufacture_date")
	private LocalDate manufactureDate;
	@Column(name="seating_capacity")
	private int seatingCapacity;
	public VehicleEntity() {
		super();
	}
	public VehicleEntity(int id, String modelName, String manufacturer, long engineNumber, float mileage,
			double engineCapacity, boolean isElectric, char fuelType,LocalDate manufactureDate, int seatingCapacity) {
		super();
		this.id = id;
		this.modelName = modelName;
		this.manufacturer = manufacturer;
		this.engineNumber = engineNumber;
		this.mileage = mileage;
		this.engineCapacity = engineCapacity;
		this.isElectric = isElectric;
		this.fuelType = fuelType;
		this.manufactureDate = manufactureDate;
		this.seatingCapacity = seatingCapacity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public long getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(long engineNumber) {
		this.engineNumber = engineNumber;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public boolean isElectric() {
		return isElectric;
	}
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	public char getFuelType() {
		return fuelType;
	}
	public void setFuelType(char fuelType) {
		this.fuelType = fuelType;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	@Override
	public String toString() {
		return "VehicleEntity [id=" + id + ", modelName=" + modelName + ", manufacturer=" + manufacturer
				+ ", engineNumber=" + engineNumber + ", mileage=" + mileage + ", engineCapacity=" + engineCapacity
				+ ", isElectric=" + isElectric + ", fuelType=" + fuelType + ", manufactureDate=" + manufactureDate
				+ ", seatingCapacity=" + seatingCapacity + "]";
	}
	
	
	
	

}
