package cn.bdu.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Demo1 {
	public static String getFourRandom(){
		Random random = new Random();
		String fourRandom = random.nextInt(10000) + "";
		int randLength = fourRandom.length();
			if(randLength<4){
				for(int i=1; i<=4-randLength; i++)
					fourRandom = "0" + fourRandom;
			}
			return fourRandom;
		}

	public static void WriterFun() {
		// 获得路径
		String filepath = "D:\\j2ee-workspace\\bookstore\\WebContent\\WEB-INF";
		filepath += "\\new_words.txt";

		File file = new File(filepath);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));

			Random random = new Random();
			for (int i = 0; i < 10000; i++) {
//				int nums = Math.round(random.nextFloat() * 1000.0f);
				// 将int 转化为 String类型
				bw.write(getFourRandom());
				bw.newLine();
			}
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		WriterFun();
	}
}
