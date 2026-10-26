package examples;
	class Library{
		private String Title;
		private String Author;
		private boolean isAvailable;
		
		public String getTitle() {
			return Title;
		}
		public String getAuthor() {
			return Author;
		}
		public boolean GetAvailable() { 
			return isAvailable;
		}
		public void setAvailable(boolean isAvailable) {
			this.isAvailable=isAvailable;
		}
		public void setTitle(String Title) {
			this.Title=Title;
		}
		public void setAuthor(String Author) {
			this.Author=Author;
		}
	}
public class Question_No1 {
	
	public static void main(String[] args) {
		Library L1=new Library();
		L1.setTitle("NOVEL");
		L1.setAuthor("DAVID COOPERFIELD");
		L1.setAvailable(true);
		System.out.println("Book Title Is: "+L1.getTitle()+"\n"+"Written By: "+L1.getAuthor()+"\n"+"Is it Avaiable: "+L1.GetAvailable());
	}

}
