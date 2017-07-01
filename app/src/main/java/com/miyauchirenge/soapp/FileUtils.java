package com.miyauchirenge.soapp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
	public static String readFile(String fileName) {
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			StringBuilder rel = new StringBuilder();
			int c;
			while ((c = reader.read()) != -1)
				rel.append((char) c);
			reader.close();
			return rel.toString();
		} catch (IOException e) {
			return null;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}

	public static byte[] readFileToByteArray(String filename) {
		File f = new File(filename);
		ByteArrayOutputStream bos = new ByteArrayOutputStream((int) f.length());
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(f));
			int buf_size = 1024;
			byte[] buffer = new byte[buf_size];
			int len = 0;
			while (-1 != (len = in.read(buffer, 0, buf_size))) {
				bos.write(buffer, 0, len);
			}
			return bos.toByteArray();
		} catch (IOException e) {
		} finally {
			try {
				in.close();
				bos.close();
			} catch (IOException e) {
			}
		}
		return null;
	}

	public static byte[] readFileFromResource(String filename) {
		InputStream in = Class.class.getResourceAsStream("/" + filename);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			int buf_size = 1024;
			byte[] buffer = new byte[buf_size];
			int len = 0;
			while (-1 != (len = in.read(buffer, 0, buf_size))) {
				bos.write(buffer, 0, len);
			}
			return bos.toByteArray();
		} catch (IOException e) {
		} finally {
			try {
				in.close();
				bos.close();
			} catch (IOException e) {
			}
		}
		return null;
	}

	public static boolean writeFile(String fileName, String data) {
		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public static boolean copyFile(String srcFileName, String destFileName) {
		File srcFile = new File(srcFileName);
		File destFile = new File(destFileName);
		if (destFile.exists())
			new File(destFileName).delete();

		int byteread = 0;
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(destFile);
			byte[] buffer = new byte[1024];

			while ((byteread = in.read(buffer)) != -1) {
				out.write(buffer, 0, byteread);
			}
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		} finally {
			try {
				if (out != null)
					out.close();
				if (in != null)
					in.close();
			} catch (IOException e) {
			}
		}
	}

	public static boolean copyFile(InputStream in, String destFileName) {
		File destFile = new File(destFileName);
		if (destFile.exists())
			new File(destFileName).delete();

		int byteread = 0;
		OutputStream out = null;
		try {
			out = new FileOutputStream(destFile);
			byte[] buffer = new byte[1024];

			while ((byteread = in.read(buffer)) != -1) {
				out.write(buffer, 0, byteread);
			}
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		} finally {
			try {
				if (out != null)
					out.close();
				if (in != null)
					in.close();
			} catch (IOException e) {
			}
		}
	}
}
