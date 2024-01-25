package U2;

public class Book {
	public String isbn;
	public String autor;
	public String titulo;
	public String editorial;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book l1= new Book(); 
	l1.setTitulo("Don quijote de la mancha");
	System.out.println(l1.getTitulo());	

//	public String toString() {
//		return "Book [isbn="autor" 
//	}
	
	
	}

}
