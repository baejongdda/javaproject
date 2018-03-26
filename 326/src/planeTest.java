
class plane {
	private String model;
	private int sit;
	private String plmk;

	private String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	private int getSit() {
		return sit;
	}

	private void setSit(int sit) {
		this.sit = sit;
	}

	private String getPlmk() {
		return plmk;
	}

	private void setPlmk(String plmk) {
		this.plmk = plmk;
	}

	public plane() {
	}

	public plane(String m, int s, String pl) {
		model = m;
		sit = s;
		plmk = pl;
	}

}

public class planeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plane p = new plane();
plane p1=new plane();
System.out.println("제작사는:"+m);
		
	}

}
