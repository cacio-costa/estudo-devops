package controlador;

import static br.com.caelum.vraptor.view.Results.http;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

	@Inject
	private Result resultado;
	
	@Get("/")
	public void index() {
		resultado.use(http()).addHeader("Content-type", "text/html").body("<center>Projeto de estudos devops</center>");
	}
	
}
