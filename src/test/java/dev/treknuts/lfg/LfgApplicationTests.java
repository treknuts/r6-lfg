package dev.treknuts.lfg;

import dev.treknuts.lfg.entities.Group;
import dev.treknuts.lfg.entities.Platform;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LfgApplicationTests {

	@Test
	void createGroup() {
		Group group = new Group("Hard stuck silver", "I need sweaty gamers", "treknuts", 3, Platform.PC);

		System.out.println(group.toString());
	}

}
