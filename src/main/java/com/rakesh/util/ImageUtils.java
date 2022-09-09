package com.rakesh.util;

import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ImageUtils {

	  public static byte[] compressImage(byte[] data) {
		  Deflater deflater=new Deflater();
		  deflater.setLevel(Deflater.BEST_COMPRESSION);
		  deflater.setInput(data);
		  deflater.finish();
		  
		  ByteArrayOutputStream outputStream=new ByteArrayOutputStream(data.length);
		  byte[] temp=new byte[4*1024];
		  while (!deflater.finished()) {
			int size = deflater.deflate(temp);
			outputStream.write(temp,0,size);
		}
		  try {
			outputStream.close();
		} catch (Exception ignored) {
			// TODO: handle exception
			
		}
		  return outputStream.toByteArray();
	  }
	  
	  public static byte[] deCompressImage(byte[] data) throws DataFormatException {
		  Inflater deflater=new Inflater();
		  //deflater.setLevel(Deflater.BEST_COMPRESSION);
		  deflater.setInput(data);
		  //deflater.finish();
		  
		  ByteArrayOutputStream outputStream=new ByteArrayOutputStream(data.length);
		  byte[] temp=new byte[4*1024];
		  while (!deflater.finished()) {
			int size = deflater.inflate(temp);
			outputStream.write(temp,0,size);
		}
		  
		  return outputStream.toByteArray();
	  }
}
