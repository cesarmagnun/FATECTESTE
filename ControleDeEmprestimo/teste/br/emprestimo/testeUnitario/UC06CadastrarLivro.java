package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;
import br.emprestimo.modelo.Emprestimo;



public class UC06CadastrarLivro {

	private static Livro livro;
	private static Usuario usuario;
	private static Emprestimo emprestimo;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = new Livro();
		
		livro.setIsbn("121212");
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		
		usuario = new Usuario();
		
		emprestimo = new Emprestimo();
		

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC06CadastrarLivro_com_isbn_valido_branco(){
		livro.setIsbn("");
	}
	
	@Test
	public void CT02UC06CadastrarLivro_com_isbn_valido_null(){
		livro.setIsbn(null);
	}

	@Test
	public void CT03UC06CadastrarLivro_com_isbn_valido(){
		assertEquals("121212", livro.getIsbn());
	}
	
	@Test
	public void CT04UC06CadastrarLivro_com_titulo_valido(){
		assertEquals("Livro A", livro.getTitulo());
	}
	
	@Test
	public void CT05UC06CadastrarLivro_com_autor_valido(){
		assertEquals("Fulano", livro.getAutor());
	}
	
	@Test
	public void CT06UC06CadastrarUsuario_com_ra_valido(){
		assertEquals("5465454", usuario.getRa());
	}

	@Test
	public void CT07UC06CadastrarUsuario_com_ra_nome(){
		assertEquals("Joao", usuario.getNome());
	}
	
	@Test
	public void CT08UC07CadastrarEmprestimo_com_livro_null(){
		emprestimo.setLivro(null);
	}
	
	@Test
	public void CT09UC08CadastrarEmprestimo_com_usuario_null(){
		emprestimo.setUsuario(null);
	}
	
	@Test
	public void CT08UC09CadastrarEmprestimo_com_livro_valido(){
		emprestimo.setLivro(livro);
	}
	
	@Test
	public void CT09UC10CadastrarEmprestimo_com_usuario_valido(){
		emprestimo.setUsuario(usuario);
	}
	
	
	@Test
	public void CT0xUC06CadastrarUsuario_com_ra_valido(){
		Object obj = new Object();
		usuario.equals(obj);
	}
	
	@Test
	public void CT0yUC06CadastrarUsuario_com_ra_valido(){
		usuario.equals(null);
	}
	
	@Test
	public void CT0aUC06CadastrarUsuario_com_ra_valido(){ 
		assertFalse(emprestimo.validaData("29-03-2003"));
	} 
	
	@Test
	public void CT0bUC06CadastrarUsuario_com_ra_valido(){ 
		assertFalse(emprestimo.validaData("30-02-2000"));
	}
	
	@Test
	public void CT0cUC06CadastrarUsuario_com_ra_valido(){ 
		assertTrue(emprestimo.validaData("29/03/2003"));
	}
}





