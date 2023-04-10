package it.polimi.models;

public class SpendingRange {

		private String codeSeller;
		private String id;
		private float rangeMax;
		private float rangeMin;
		private float cost;
		private int quantity;
		
		public String getCodeSeller() {
			return codeSeller;
		}
		
		public void setCodeSeller(String codeSeller) {
			this.codeSeller = codeSeller;
		}
		
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		public float getRangeMax() {
			return rangeMax;
		}
		
		public void setRangeMax(float rangeMax) {
			this.rangeMax = rangeMax;
		}
		
		public float getRangeMin() {
			return rangeMin;
		}
		
		public void setRangeMin(float rangeMin) {
			this.rangeMin = rangeMin;
		}
		
		public float getCost() {
			return cost;
		}
		
		public void setCost(float cost) {
			this.cost = cost;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		

}
