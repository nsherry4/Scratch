package net.sciencestudio.scratch;

import org.junit.Assert;
import org.junit.Test;

import net.sciencestudio.scratch.encoders.serializers.Serializers;
import net.sciencestudio.scratch.single.Compressed;

public class KryoTest {

	
	@Test
	public void string() {
		String s = "hello";
		Compressed<String> c = Compressed.create(s, Serializers.kryo(String.class));
		Assert.assertEquals(c.get(), s);
	}
	
}
