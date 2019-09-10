package com.sunshine.jvm.language.junit.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/**
 * @author yangsonglin
 * @date 2019-07-29 20:07
 */
@DisplayName("JDK运行时环境条件判断测试")
public class RuntimeEnvironmentConditionTest {

	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void testOnlyOnJDK8() {
		System.out.println("Test only on JDK8");
	}

	@Test
	@EnabledOnJre({JRE.JAVA_11, JRE.JAVA_12})
	void testOnlyOnJDK11OrJDK12() {
		System.out.println("Test only on either JDK11 or JDK12");
	}

	@Test
	@DisabledOnJre({JRE.JAVA_9})
	void testDisabledOnJDK9() {
		System.out.println("Test disabled on JDK9");
	}
}
