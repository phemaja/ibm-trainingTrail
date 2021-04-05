import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TestTimeout {

	@Test
	@Timeout(unit = TimeUnit.MILLISECONDS, value =20)
	public void testTimeout() throws InterruptedException{
		Thread.sleep(1);
	}
	
	@Test
	public void testTimeoutAssert() {
		assertTimeout(Duration.ofMillis(10), TestTimeout::abc);
		//assertTimeout(Duration.ofMillis(10), () -> {Thread.sleep(1);});

	}
	
	public static void abc() {
		try
		{
			Thread.sleep(1);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
