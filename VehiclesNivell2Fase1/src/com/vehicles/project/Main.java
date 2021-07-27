package com.vehicles.project;

import java.util.*;
import java.util.Scanner;

public class Main {

	static Scanner lector = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		
		System.out.println("¿Quin tipus de vehicle vols? \n1. Un cotxe\n2. Una moto\n3. Un camió");
		int eleccio = lector.nextInt();
		lector.nextLine();
		
		if(eleccio==1) {
			
			System.out.println("Escriu la matrícula del cotxe: ");
			String matriculaCotxe = lector.nextLine();
			
			System.out.println("Escriu la marca del cotxe: ");
			String marcaCotxe = lector.nextLine();
			
			System.out.println("Específica el color del cotxe: ");
			String colorCotxe = lector.nextLine();
			
			Car car = new Car(matriculaCotxe, marcaCotxe, colorCotxe);
			
			System.out.println("Possar les rodes del davant!");
			Wheel rodaDavant = demanarRoda();
			
			System.out.println("Possar les rodes del darrere!");
			Wheel rodaDarrere = demanarRoda();
			
			List<Wheel> rodesDavant = new ArrayList<>();
			rodesDavant.add(rodaDavant);
			rodesDavant.add(rodaDavant);
			
			List<Wheel> rodesDarrere = new ArrayList<>();
			rodesDarrere.add(rodaDarrere);
			rodesDarrere.add(rodaDarrere);
			
			car.addWheels(rodesDavant, rodesDarrere);
			
			System.out.println(car.toString());
			
		}else if(eleccio==2) {
			
			System.out.println("Escriu la matrícula de la moto: ");
			String matriculaMoto = lector.nextLine();
			
			System.out.println("Excriu la marca de la moto: ");
			String marcaMoto = lector.nextLine();
			
			System.out.println("Específica el color de la moto: ");
			String colorMoto = lector.nextLine();
			
			Bike bike = new Bike(matriculaMoto, marcaMoto, colorMoto);
			
			System.out.println("Possar les rodes del davant!");
			Wheel rodaDavant = demanarRoda();
			
			System.out.println("Possar les rodes del darrere!");
			Wheel rodaDarrere = demanarRoda();
			
			bike.addWheels(rodaDavant, rodaDarrere);
			
			System.out.println(bike.toString());
			
		}else if(eleccio==3){
			
			System.out.println("Excriu la matrícula del camió: ");
			String matriculaCamio = lector.nextLine();
			
			System.out.println("Escriu la marca del camió: ");
			String marcaCamio = lector.nextLine();
			
			System.out.println("Específica el color del camió: ");
			String colorCamio = lector.nextLine();
			
			Truck truck = new Truck(matriculaCamio, marcaCamio, colorCamio);
			
			System.out.println("Quantes rodes té el camió: 4, 6, 8, 10 o 12 ?");
			
			int rodesTotalsCamio = lector.nextInt();
			lector.nextLine();
			
			List<Wheel> rodesCamio = new ArrayList<>();
			
			System.out.println("Escriu la marca i diàmetre de les rodes: ");
			
			for(int i=0;i<rodesTotalsCamio/2;i++) {
				
				System.out.println("Escriu un parell de rodes " + (i+1));
				Wheel roda = demanarRoda();
				rodesCamio.add(roda);
				rodesCamio.add(roda);
			}
			
			truck.addWheels(rodesCamio);
			
			System.out.println("Nombre correcte de rodes: " + truck.suitableNumberOfWheels());
                        
                        System.out.println(truck.toString());
			
		}else{
			System.err.println("Nomès hi ha tres opcions: [1 -> Cotxe | 2 -> Moto | 3 -> Camió]");
		}
		
		lector.close();
	}
	
	public static Wheel demanarRoda() throws InvalidWheelDiameterException {
		
		Wheel roda;
		
		System.out.println("Escriu la marca de la roda: ");
		String marcaRoda = lector.nextLine();
		
		System.out.println("Escriu el diàmetre de la roda: ");
		double diametreRoda = lector.nextDouble();
		lector.nextLine();
		
		roda = new Wheel(marcaRoda, diametreRoda);
		
		return roda;
	}
}


   