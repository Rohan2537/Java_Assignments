/*	
	Create few instances of Car and add them to a collection. Have Car implements Comparable interface and override compareTo() to order them by ascending order of make of the Car. Observe the fact that you need to provide the order criteria in compareTo().
*/
package com.capgemini.basiccollections.model;

/**
 * 
 * @author Rohan Bhosale;
 * class CarUsingCompareTo implements Comparable along with overridden compareTo() method;
 */
public class CarUsingCompareTo implements Comparable<CarUsingCompareTo> {


		private String company;
		private String model;
		private int year;
		private double price;

/**
	 * parameterized constructor of class CarUsingCompareTo;
	 * @param company
	 * @param model
	 * @param year
	 * @param price
	*/	
	public CarUsingCompareTo(String company,String model,int year,double price) {
		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	
		public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	
	
	/**
	 *overridden method to display values of parameter; 
	 */
		@Override
	public String toString() {
		return "CarUsingCompareTo [company=" + company + ", model=" + model + ", year=" + year + ", price=" + price
				+ "]";
	}

	
		/**
		 *overridden method to check hashCode;
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((company == null) ? 0 : company.hashCode());
			result = prime * result + ((model == null) ? 0 : model.hashCode());
			return result;
		}

		/**
		 *overridden method to compare hashCode; 
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CarUsingCompareTo other = (CarUsingCompareTo) obj;
			if (company == null) {
				if (other.company != null)
					return false;
			} else if (!company.equals(other.company))
				return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
			return true;
		}

		/**
		 *overridden method to compare the objects; 
		 */
		@Override
		public int compareTo(CarUsingCompareTo object) {
			if(company == object.company ) {
				return this.company.compareTo(company);
			}
		}
        }

		
}
