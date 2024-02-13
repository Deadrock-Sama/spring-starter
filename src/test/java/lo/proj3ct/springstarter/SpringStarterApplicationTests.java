package lo.proj3ct.springstarter;

import org.assertj.core.internal.Classes;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = lo.proj3ct.springstarter.SpringConfig.class)
class SpringStarterApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void valuesForTest() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car engine = ctx.getBean( "CarWithModel", Car.class);

		assertEquals("Audi", engine.getManufacturer());
	}
}
