package com.sunshine.jvm.language.custom;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 自定义ClassLoader
 * @author sunshine
 * @date 2019-08-28
 */
public class SunshineClassLoader extends ClassLoader {

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class clazz = null;
		String clazzName = name + ".class";
		File clazzFile = new File(clazzName);
		if (clazzFile.exists()) {
			try (FileChannel fileChannel = new FileInputStream(clazzFile).getChannel()) {
				MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());
				byte[] bytes = mappedByteBuffer.array();
				clazz = defineClass(name, bytes, 0, bytes.length);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (clazz == null) {
			throw new ClassNotFoundException(clazzName);
		}
		return clazz;
	}

	public static void main(String[] args) throws Exception {
		SunshineClassLoader sunshineClassLoader = new SunshineClassLoader();
		Class clazz = sunshineClassLoader.findClass("Sunshine");
		Method shine = clazz.getMethod("shine");
		shine.invoke(null);
	}
}
