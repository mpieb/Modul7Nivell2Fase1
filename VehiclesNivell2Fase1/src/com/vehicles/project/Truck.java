
package com.vehicles.project;

import java.util.List;

public class Truck extends Vehicle{

	public Truck(String plate, String brand, String color) throws InvalidPlateException {
		super(plate, brand, color);
		
	}
	public void addWheels(List<Wheel> truckWheels) throws Exception {
		
		if (truckWheels.size()<4 || truckWheels.size()>12)
			throw new InvalidNumberOfTruckWheelsException();
		
		for(Wheel wh: truckWheels) this.wheels.add(wh);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		
		if (wheels.size() != 2)
			throw new Exception("Ha de possar les rodes per parelles!");

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("La roda esquerra no coincideix amb la roda dreta!");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	
	@Override
	public boolean suitableNumberOfWheels() {
		
		boolean corrrectNumber = false;
		
		if (wheels.size()==4 || wheels.size()== 6 ||wheels.size()== 8 ||wheels.size()== 10 ||wheels.size()== 12)  corrrectNumber = true;
		
		return corrrectNumber;
	}
        
        @Override
	public String toString() {
		return "Truck [plate=" + plate + ", brand=" + brand +
                        ", color=" + color + ", wheels=" + wheels + "]";
	}

}

    

