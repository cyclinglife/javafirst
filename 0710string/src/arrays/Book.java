package arrays;

public class Book {

		//저장하고자 하는 항목
		private String title;
		private String author;
		private String ispn;
		private int price;
		
	
		//접근자 항목
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getIspn() {
			return ispn;
		}
		public void setIspn(String ispn) {
			this.ispn = ispn;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		//디버깅을 위한 메소드
		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", ispn=" + ispn + ", price=" + price + "]";
		}
		
		//크기비교를 하는 메소드
		public int compareTo(Object o) {
			Book other = (Book)o;
			return this.price - other.price;
			
		}

	}

