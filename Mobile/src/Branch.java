public class Branch {
	private double length;
	private Structure struct;
	private double torque;
	
	public Branch(double length, Structure struct) {
		this.length = length;
		this.struct = struct;
	}
	
	public double getLength() {
		return length;
	}
	
	public Structure getStructure() {
		return struct;
	}
	
	public double torque() {
		this.torque = length * struct.getWeight();
		return this.torque;
	}
}
