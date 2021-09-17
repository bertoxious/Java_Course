class CarPriceEstimator{

	public double getSalePrice(String makeAndModel, int yearManufactured, double milesDriven,
		int airbagsCount, boolean hasAbs, boolean hasEbd, boolean hasRearCameraView, boolean hasAutoAC,
		boolean hasAccidentHistory){


		double salePrice = getPrice(makeAndModel, yearManufactured);
		int currentYear = LocalDate.now().getYear();
		int ageOfCar = currentYear - yearManufactured + 1;
		System.out.println("Age of Car :: " + ageOfCar);

		// after depreciation
		System.out.println("Sales price after depreciation :: ", salesPrice);
		
	}

	private double getPrice(String makeAndModel, int yearManufactured){
		if (makeAndModel.equalIgnoreCase("ford ecosport")){
			return 20000.0;
		}
		else if (makeAndModel.equalsIgnoreCase("honda city")){
			return 25000.0;
		}
		else if (makeAndModel.equalsIgnoreCase("range rover velar")){
			return 50000.0;
		}
	}
	public static void main(String [] args){

		CarPriceEstimator c = new CarPriceEstimator();
		double SalesPrice = c.getSalePrice("ford ecosport", 2018, 200000.0,2, true, false, true, false, false);
	}
}