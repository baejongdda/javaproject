class Book {
	private String name;
	private String cate;
	private String auth;
	private int bkcd;


	private String getCate() {
		return cate;
	}

	private void setCate(String cate) {
		this.cate = cate;
	}

	private int getBkcd() {
		return bkcd;
	}

	void setBkcd(int bkcd) {
		this.bkcd = bkcd;
	}


	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private String getAuth() {
		return auth;
	}

	private void setAuth(String auth) {
		this.auth = auth;
	}
	private String getcate() {
		return cate;
	}

	void setcate(String cate){
this.cate=cate;
	}
	
}

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book book1=new Book();
	book1.setcate("comic");
	book1.setName("배종현");
	book1.setBkcd(00100);
	System.out.println("책이름은:"+book1.getName());
	}
}
	