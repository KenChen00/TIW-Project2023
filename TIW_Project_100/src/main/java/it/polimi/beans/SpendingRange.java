package it.polimi.beans;

public class SpendingRange {

		private String codeSeller;
		private String id;
		private float maxQty;
		private float minQty;
		private float cost;	
		
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
		
		public float getMaxQty() {
			return maxQty;
		}
		
		public void setMaxQty(float maxQty) {
			this.maxQty = maxQty;
		}
		
		public float getMinQty() {
			return minQty;
		}
		
		public void setMinQty(float minQty) {
			this.minQty = minQty;
		}
		
		public float getCost() {
			return cost;
		}
		
		public void setCost(float cost) {
			this.cost = cost;
		}
		
		

}
