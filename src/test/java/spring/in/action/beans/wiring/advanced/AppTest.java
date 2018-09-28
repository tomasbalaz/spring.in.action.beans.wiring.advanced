package spring.in.action.beans.wiring.advanced;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.in.action.beans.wiring.advanced.config.Config;
import spring.in.action.beans.wiring.advanced.model.BlankDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class AppTest {
	
	@Autowired
	private BlankDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
		System.out.println(cd.getArtist());
		System.out.println(cd.getTitle());
	}
}
