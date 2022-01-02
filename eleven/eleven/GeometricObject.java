package eleven;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**Construct a default geometric object.构造默认几何对象*/
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	/**Construct a geometric object with the specified color and filled value.构造具有指定颜色和填充值的几何对象*/
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled=filled;
	}
	/** Return color */
	public String getCo1or(){
		return color;
	}
	/** Set a new color*/
	public void setColor(String color) {
		this.color=color;
	}
	/** Return filled . Since filled is boolean ,its getter method is named isFilled */
	public boolean isFi11ed() {
		return filled ;
	}
	/** Set a new filled */
	public void setFilled ( boolean filled){
		this.filled = filled ;
	}
	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated ;
	}
	/** Return a string representation of this object.返回此对象的字符串表示形式 */
	public String toString(){
		return "created on "+dateCreated+"\ncolor: "+color+"and filled :"+filled;
	}
}
