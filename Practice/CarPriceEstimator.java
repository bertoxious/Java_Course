class CarPriceEstimator{

		double getSalePrice(String makeAndModel, int yearManufactured, double milesDriven,
		int airbagsCount, boolean hasAbs, boolean hasEbd, boolean hasRearCameraView, boolean hasAutoAC,
		boolean hasAccidentHistory){

		double salesPrice = getPrice(makeAndModel, yearManufactured);
		if (yearManufactured < 2020){
			salesPrice = (salesPrice*100000) - (2020-yearManufactured) * 1000000;
			salesPrice = salesPrice / 100000;
		}
		return salesPrice;
	}

	private double getPrice(String makeAndModel, int yearManufactured){
		if (makeAndModel.equalsIgnoreCase("range rover sport")){
			return 211.01;
		}
		else if (makeAndModel.equalsIgnoreCase("range rover velar")){
			return 75.82;
		}
		else if (makeAndModel.equalsIgnoreCase("range rover autobiography")){
			return 211.42;
		}
		else if (makeAndModel.equalsIgnoreCase("range rover evoque")){
			return 64.12;
		}
		return 00.00;
	}
	public static void main(String [] args){

		CarPriceEstimator c = new CarPriceEstimator();
		double SalesPrice = c.getSalePrice("range rover sport", 2012, 200000.0,2, true, false, true, false, false);
		System.out.println("The sales price of the car would be :: " + SalesPrice);
	}
}