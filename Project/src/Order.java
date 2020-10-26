
public class Order {

	private int orderId;
	private int supplierId;
	private int componentId;
	private int quantity;
	private boolean fulfilled;

	public Order(int supplierId, int componentId, int quantity) {
		this.setSupplierId(supplierId);
		this.setComponentId(componentId);
		this.setQuantity(quantity);
		this.setFulfilled(false);
		this.setOrderId(this.generateId());
	}

	public int getOrderId() {
		return this.orderId;
	}

	public int getSupplierId() {
		return this.supplierId;
	}

	public int getComponentId() {
		return this.componentId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public boolean getFullfilled() {
		return this.fulfilled;
	}

	public void setOrderId(int id) {
		this.orderId = id;
	}

	public void setSupplierId(int id) {
		this.supplierId = id;
	}

	public void setComponentId(int id) {
		this.componentId = id;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
		// throw error
	}

	public void setFulfilled(boolean fulfilled) {
		this.fulfilled = fulfilled;
	}
	
	public String toString() {
		//toString
		String output = "";
		
		return output;
	}

	private int generateId() {
		int id = 0;

		return id;
	}
}
