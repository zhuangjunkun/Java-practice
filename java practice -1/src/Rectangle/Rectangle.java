package Rectangle;

public class Rectangle {
	private float height;
	private float width;

	public Rectangle(float height,float width){
		this.height=height;
		this.width=width;
	}
	
	public float square(){
		return height*width;
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle(3.5f, 2.0f);
		System.out.println(r.square());
	
		
}
}
