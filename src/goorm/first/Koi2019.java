package goorm.first;

import java.io.*;

public class Koi2019 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int[] arr = new int[input];
		for (int i = 0; i < input; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 0;
		int maxHeight = arr[arr.length - 1];
		for (int j = arr.length - 2; j >= 0; j--) {
			if (arr[j] > maxHeight) {
				cnt++;
				maxHeight = arr[j];
			}
		}
		System.out.print(cnt + 1);
	}

}
