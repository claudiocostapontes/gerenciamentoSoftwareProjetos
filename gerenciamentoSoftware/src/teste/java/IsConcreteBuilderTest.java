package teste.java;
import org.junit.Test;
import com.builder.principle.PlataformaSoftware;

public class IsConcreteBuilderTest {

PlataformaSoftware plataformaSoftware = null;

	@Test
	public void ConcreteBuilder() {
		plataformaSoftware= new PlataformaSoftware();
	}
	@Test
	public void buildClientes() {
		plataformaSoftware.setClientes("plataformaSoftware clientes construction compeleted");
	}
	@Test
	public void buildProjetos() {
		plataformaSoftware.setProjetos("plataformaSoftware projetos construction compeleted");
	}
	@Test
	public void buildAtividades() {
		plataformaSoftware.setAtividades("plataformaSoftware atividades construction compeleted");
	}
	@Test
	public PlataformaSoftware buildPart() {
		return plataformaSoftware;
	}

}


