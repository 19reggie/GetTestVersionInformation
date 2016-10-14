package com.reggie.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PublicMethod {

	public String execute(String command) {
		String commandResult = null;
		BufferedReader in = null;
		StringBuffer stringBuffer = new StringBuffer();
		try {
			Process proc = Runtime.getRuntime().exec(command);
			proc.waitFor();
			in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line = null;
			while ((line = in.readLine()) != null) {
				stringBuffer.append(line);
			}
			commandResult = stringBuffer.toString();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return commandResult;
	}

	public String execute2(String command) {
		String commandResult = null;
		BufferedReader in = null;
		StringBuffer stringBuffer = new StringBuffer();
		try {
			Process proc = Runtime.getRuntime().exec(command);
			proc.waitFor();
			in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line = null;
			while ((line = in.readLine()) != null) {
				stringBuffer.append(line + "\n");
			}
			commandResult = stringBuffer.toString();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return commandResult;
	}

	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(date);
	}

	public File getDirectoryPath() {
		String directoryPath = System.getProperty("user.dir") + "\\repository\\results";
		File mDirectoryPath = new File(directoryPath);
		if (!mDirectoryPath.exists()) {
			mDirectoryPath.mkdirs();
		}
		return mDirectoryPath;
	}

	public File createFile(String fileNmae) {
		String directory = System.getProperty("user.dir") + "\\repository\\results";// directory
		String file = directory + "\\" + fileNmae + "_" + getCurrentTime() + ".xls";// file
		File directoryPath = new File(directory);
		File mfile = new File(file);
		if (!directoryPath.exists() && !mfile.exists()) {
			directoryPath.mkdirs();
			try {
				mfile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return mfile;
	}

	public String[] arrayListToString(ArrayList<String> arrayList) {
		String[] string = new String[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			string[i] = arrayList.get(i);
		}
		return string;
	}

	public int[] stringToInt(String[] arr_str) {
		int[] arr_int = new int[arr_str.length];
		for (int i = 0; i < arr_str.length; i++) {
			arr_int[i] = Integer.parseInt(arr_str[i]);
		}
		return arr_int;
	}

	public String getAverageValue(int[] aa) {
		int sum = 0;
		for (int i = 0; i < aa.length; i++) {
			sum += aa[i];
		}
		String averageValue = Integer.toString(sum / aa.length);
		return averageValue;
	}

	public String readFile(String filename) {
		String result = "";
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
			}
			result = sb.toString();
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
